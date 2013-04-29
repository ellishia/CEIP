package ceip.procesos;

import ceip.Students;
import ceip.StudentsDoc;
import ceip.procesos.studenttransfer.Lock;
import ceip.procesos.studenttransfer.Place;
import ceip.studentsdoc.Exportador;
import ceip.studentsdoc.exportador.ExporterScope;
import java.util.List;
import org.monet.bpi.DelegationSetup;
import org.monet.bpi.JobRequest;
import org.monet.bpi.JobResponse;
import org.monet.bpi.JobSetup;
import org.monet.bpi.Node;
import org.monet.bpi.Role;
import org.monet.bpi.RoleChooser;
import org.monet.bpi.ValidationResult;
import org.monet.bpi.java.ActivityImpl;
import org.monet.bpi.types.Date;

@SuppressWarnings("all")
public class StudentTransfer extends ActivityImpl {
  public StudentsDoc getTarget() {
    return (ceip.StudentsDoc)genericGetTarget();
  }
  
  public void setTarget(final StudentsDoc node) {
    this.genericSetTarget((ceip.StudentsDoc)node);
  }
  
  public void onInitialize() {
    Students _instance = Students.getInstance();
    ExporterScope _doExportOf = Exportador.doExportOf(_instance);
    StudentsDoc _newDocument = _doExportOf.toNewDocument();
    this.setTarget(_newDocument);
    this.setContextVariable("roles", "");
    this.save();
  }
  
  public void doUnlock(final Lock lock) {
    this.unlock(lock);
  }
  
  public void doLock(final Lock lock) {
    this.lock(lock);
  }
  
  public void doGoto(final Place place, final String historyText) {
    this._goto(place.getId(), historyText);
  }
  
  public static StudentTransfer createNew() {
    return (ceip.procesos.StudentTransfer)org.monet.bpi.TaskService.create(ceip.procesos.StudentTransfer.class);
  }
  
  private void onSelectRole0(final RoleChooser roleChooser) {
    List<Role> candidates = roleChooser.getCandidates();
    int _size = candidates.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      String rolesYaEnviados = this.getContextVariable("roles");
      Role candidato = candidates.get(0);
      int i = 1;
      boolean _and = false;
      String _serviceUrl = candidato.getServiceUrl();
      String _plus = (";" + _serviceUrl);
      String _plus_1 = (_plus + ";");
      int _indexOf = rolesYaEnviados.indexOf(_plus_1);
      int _minus = (-1);
      boolean _greaterThan_1 = (_indexOf > _minus);
      if (!_greaterThan_1) {
        _and = false;
      } else {
        int _size_1 = candidates.size();
        boolean _lessThan = (i < _size_1);
        _and = (_greaterThan_1 && _lessThan);
      }
      boolean _while = _and;
      while (_while) {
        {
          Role _get = candidates.get(i);
          candidato = _get;
          int _plus_2 = (i + 1);
          i = _plus_2;
        }
        boolean _and_1 = false;
        String _serviceUrl_1 = candidato.getServiceUrl();
        String _plus_2 = (";" + _serviceUrl_1);
        String _plus_3 = (_plus_2 + ";");
        int _indexOf_1 = rolesYaEnviados.indexOf(_plus_3);
        int _minus_1 = (-1);
        boolean _greaterThan_2 = (_indexOf_1 > _minus_1);
        if (!_greaterThan_2) {
          _and_1 = false;
        } else {
          int _size_2 = candidates.size();
          boolean _lessThan_1 = (i < _size_2);
          _and_1 = (_greaterThan_2 && _lessThan_1);
        }
        _while = _and_1;
      }
      int _size_2 = candidates.size();
      boolean _lessThan_1 = (i < _size_2);
      String _valueOf = String.valueOf(_lessThan_1);
      this.setContextVariable("rolesrestantes", _valueOf);
      roleChooser.choose(candidato);
      String _plus_2 = (rolesYaEnviados + ";");
      String _serviceUrl_1 = candidato.getServiceUrl();
      String _plus_3 = (_plus_2 + _serviceUrl_1);
      String _plus_4 = (_plus_3 + ";");
      rolesYaEnviados = _plus_4;
      this.setContextVariable("roles", rolesYaEnviados);
      this.save();
    }
  }
  
  private void onSetup1(final DelegationSetup ds) {
    ds.cancel();
  }
  
  private void onArrive2() {
    String restantes = this.getContextVariable("rolesrestantes");
    boolean i = Boolean.parseBoolean(restantes);
    if (i) {
      this.doGoto(Place.Generado, null);
    } else {
      this.doGoto(Place.Finalizado, null);
    }
  }
  
  public void onArrivePlace(final String placeCode) {
    int hash = (placeCode).hashCode();
    switch(hash) {case 1253403041 :
      onArrive2();
    break;
    }
  }
  
  public void onTimeoutPlace(final String placeCode, final String actionCode) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {}
  }
  
  public void onTakePlace(final String placeCode, final String actionCode, final String routeCode) {
    int hash = (routeCode + actionCode + placeCode).hashCode();
    switch(hash) {}
  }
  
  public void onSolveAction(final String placeCode, final String actionCode, final Node p0) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {}
  }
  
  public void onCreateJobAction(final String placeCode, final String actionCode, final JobRequest p0) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {}
  }
  
  public void onFinishedJobAction(final String placeCode, final String actionCode, final JobResponse p0) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {}
  }
  
  public void onSelectJobRole(final String placeCode, final String actionCode, final RoleChooser p0) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {}
  }
  
  public void onSetupJob(final String placeCode, final String actionCode, final JobSetup p0) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {}
  }
  
  public void onSelectDelegationRole(final String placeCode, final String actionCode, final RoleChooser p0) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {case 1253153314 :
      onSelectRole0((org.monet.bpi.RoleChooser) p0);
    break;
    }
  }
  
  public void onSetupDelegation(final String placeCode, final String actionCode, final DelegationSetup p0) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {case 1253153314 :
      onSetup1((org.monet.bpi.DelegationSetup) p0);
    break;
    }
  }
  
  public void onSetupDelegationComplete(final String placeCode, final String actionCode, final String p0, final Date p1, final Date p2, final String p3, final boolean p4) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {}
  }
  
  public void onValidateForm(final String placeCode, final String actionCode, final Node p0, final ValidationResult p1) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {}
  }
  
  public boolean onIsBackEnable(final String placeCode, final String actionCode) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {
    }
     return false;
  }
  
  public void onBack(final String placeCode, final String actionCode) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {}
  }
  
  public String onCalculateClassificatorPlace(final String placeCode, final String actionCode) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {
    }
     return null;
  }
  
  public Node getShIncidencia() {
    return this.getShortCut("shIncidencia");
  }
  
  public void setShIncidencia(final Node node) {
    this.setShortCut("shIncidencia", node);
  }
  
  public void removeShIncidencia() {
    this.removeShortCut("shIncidencia");
  }
}
