package solicitud.procesos;

import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.monet.bpi.DelegationSetup;
import org.monet.bpi.FieldSection;
import org.monet.bpi.JobRequest;
import org.monet.bpi.JobResponse;
import org.monet.bpi.JobSetup;
import org.monet.bpi.Node;
import org.monet.bpi.OperationExpression;
import org.monet.bpi.RoleChooser;
import org.monet.bpi.ValidationResult;
import org.monet.bpi.java.ActivityImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.File;
import org.monet.bpi.types.Term;
import solicitud.Application;
import solicitud.ApplicationInfo;
import solicitud.CanteenApplication;
import solicitud.ServiceApplications;
import solicitud.TransportApplication;
import solicitud.canteenapplication.Criteria;
import solicitud.procesos.publicarplaza.Lock;
import solicitud.procesos.publicarplaza.Place;
import solicitud.serviceapplications.Indice;

@SuppressWarnings("all")
public class PublicarPlaza extends ActivityImpl {
  public Application getTarget() {
    return (solicitud.Application)genericGetTarget();
  }
  
  public void setTarget(final Application node) {
    this.genericSetTarget((solicitud.Application)node);
  }
  
  public void onInitialize() {
    this.setContextVariable("canteen", "false");
    this.setContextVariable("transport", "false");
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
  
  public static PublicarPlaza createNew() {
    return (solicitud.procesos.PublicarPlaza)org.monet.bpi.TaskService.create(solicitud.procesos.PublicarPlaza.class);
  }
  
  private void onArrive0() {
    ServiceApplications serviceAppl = ServiceApplications.getInstance();
    Application _target = this.getTarget();
    Application sol = ((Application) _target);
    ApplicationInfo _applicationInfo = sol.getApplicationInfo();
    String _cial = _applicationInfo.getCial();
    OperationExpression _Eq = Indice.Cial.Eq(_cial);
    Iterable<Indice> solicitudes = serviceAppl.get(_Eq);
    Boolean canteen = Boolean.valueOf(false);
    Boolean transport = Boolean.valueOf(false);
    for (final Indice serv : solicitudes) {
      {
        Node nodo = serv.getIndexedNode();
        if ((nodo instanceof CanteenApplication)) {
          canteen = Boolean.valueOf(true);
        } else {
          transport = Boolean.valueOf(true);
        }
      }
    }
    String _string = canteen.toString();
    this.setContextVariable("canteen", _string);
    String _string_1 = transport.toString();
    this.setContextVariable("transport", _string_1);
    boolean _or = false;
    boolean _not = (!(canteen).booleanValue());
    if (_not) {
      _or = true;
    } else {
      boolean _not_1 = (!(transport).booleanValue());
      _or = (_not || _not_1);
    }
    if (_or) {
      this.doGoto(Place.AnadirEscoge, "Adjuntar solicitudes de servicios");
    } else {
      this.doGoto(Place.Generado, null);
    }
  }
  
  private void onArrive1() {
    String transport = this.getContextVariable("transport");
    boolean i = Boolean.parseBoolean(transport);
    boolean _not = (!i);
    if (_not) {
      this.doGoto(Place.AnadirTrans, "Visualizar solicitud de transporte");
      return;
    }
    String canteen = this.getContextVariable("canteen");
    boolean _parseBoolean = Boolean.parseBoolean(canteen);
    i = _parseBoolean;
    boolean _not_1 = (!i);
    if (_not_1) {
      this.doGoto(Place.Anadir, "Visualizar solicitud de comedor");
      return;
    } else {
      this.doGoto(Place.Generado, "ya se han adjuntado las solicitudes de servicios");
      return;
    }
  }
  
  private void onArrive2() {
    String _string = Boolean.valueOf(true).toString();
    this.setContextVariable("transport", _string);
  }
  
  private void onArrive3() {
    String _string = Boolean.valueOf(true).toString();
    this.setContextVariable("canteen", _string);
  }
  
  private void onSolve4(final TransportApplication f) {
    boolean _and = false;
    String _address = f.getAddress();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_address);
    boolean _not = (!_isNullOrEmpty);
    if (!_not) {
      _and = false;
    } else {
      org.monet.bpi.types.Number _distance = f.getDistance();
      boolean _notEquals = (!Objects.equal(_distance, null));
      _and = (_not && _notEquals);
    }
    if (_and) {
      ServiceApplications servicios = ServiceApplications.getInstance();
      TransportApplication solitrans = TransportApplication.createNew(servicios);
      Application _target = this.getTarget();
      ApplicationInfo _applicationInfo = _target.getApplicationInfo();
      ApplicationInfo applicationInfo = ((ApplicationInfo) _applicationInfo);
      Term _academicYear = applicationInfo.getAcademicYear();
      solitrans.setAcademicYear(_academicYear);
      String _cial = applicationInfo.getCial();
      solitrans.setCial(_cial);
      String _studentName = applicationInfo.getStudentName();
      solitrans.setStudentName(_studentName);
      String _studentSurname = applicationInfo.getStudentSurname();
      solitrans.setStudentSurname(_studentSurname);
      Date _date = new Date();
      solitrans.setDate(_date);
      String _address_1 = f.getAddress();
      solitrans.setAddress(_address_1);
      org.monet.bpi.types.Number _distance_1 = f.getDistance();
      solitrans.setDistance(_distance_1);
      String _trip = f.getTrip();
      solitrans.setTrip(_trip);
      String _stop = f.getStop();
      solitrans.setStop(_stop);
      String _leaveAt = f.getLeaveAt();
      solitrans.setLeaveAt(_leaveAt);
      solitrans.save();
    }
  }
  
  private void onSolve5(final CanteenApplication f) {
    String _schedule = f.getSchedule();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_schedule);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      ServiceApplications servicios = ServiceApplications.getInstance();
      CanteenApplication solicomensal = CanteenApplication.createNew(servicios);
      Application _target = this.getTarget();
      ApplicationInfo _applicationInfo = _target.getApplicationInfo();
      ApplicationInfo applicationInfo = ((ApplicationInfo) _applicationInfo);
      Term _academicYear = applicationInfo.getAcademicYear();
      solicomensal.setAcademicYear(_academicYear);
      String _cial = applicationInfo.getCial();
      solicomensal.setCial(_cial);
      String _studentName = applicationInfo.getStudentName();
      solicomensal.setStudentName(_studentName);
      String _studentSurname = applicationInfo.getStudentSurname();
      solicomensal.setStudentSurname(_studentSurname);
      Date _date = new Date();
      solicomensal.setDate(_date);
      boolean _actualPosition = f.getActualPosition();
      solicomensal.setActualPosition(_actualPosition);
      String _schedule_1 = f.getSchedule();
      solicomensal.setSchedule(_schedule_1);
      boolean _subsidized = f.getSubsidized();
      solicomensal.setSubsidized(_subsidized);
      FieldSection _criteriaField = f.getCriteriaField();
      Criteria criterios = ((Criteria) _criteriaField);
      FieldSection _criteriaField_1 = solicomensal.getCriteriaField();
      Criteria solicriterios = ((Criteria) _criteriaField_1);
      boolean _anualIncome = criterios.getAnualIncome();
      solicriterios.setAnualIncome(_anualIncome);
      boolean _handicaped = criterios.getHandicaped();
      solicriterios.setHandicaped(_handicaped);
      boolean _siblings = criterios.getSiblings();
      solicriterios.setSiblings(_siblings);
      boolean _monoParentalorNumberusFamily = criterios.getMonoParentalorNumberusFamily();
      solicriterios.setMonoParentalorNumberusFamily(_monoParentalorNumberusFamily);
      boolean _workingPersonalLife = criterios.getWorkingPersonalLife();
      solicriterios.setWorkingPersonalLife(_workingPersonalLife);
      boolean _parentsInSchool = criterios.getParentsInSchool();
      solicriterios.setParentsInSchool(_parentsInSchool);
      String _observations = f.getObservations();
      solicomensal.setObservations(_observations);
      ArrayList<File> _documents = solicomensal.getDocuments();
      ArrayList<File> _documents_1 = f.getDocuments();
      _documents.addAll(_documents_1);
      solicomensal.save();
    }
  }
  
  private void onSetup6(final DelegationSetup ds) {
    ds.cancel();
  }
  
  public void onArrivePlace(final String placeCode) {
    int hash = (placeCode).hashCode();
    switch(hash) {case -328865944 :
      onArrive3();
    break;
    case 1368842438 :
      onArrive2();
    break;
    case 1521986536 :
      onArrive0();
    break;
    case 1315951608 :
      onArrive1();
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
    switch(hash) {case 995305580 :
      onSolve4((solicitud.TransportApplication) p0);
    break;
    case 374918415 :
      onSolve5((solicitud.CanteenApplication) p0);
    break;
    }
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
    switch(hash) {}
  }
  
  public void onSetupDelegation(final String placeCode, final String actionCode, final DelegationSetup p0) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {case 1667885618 :
      onSetup6((org.monet.bpi.DelegationSetup) p0);
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
  
  public Node getShServiceApplications() {
    return this.getShortCut("shServiceApplications");
  }
  
  public void setShServiceApplications(final Node node) {
    this.setShortCut("shServiceApplications", node);
  }
  
  public void removeShServiceApplications() {
    this.removeShortCut("shServiceApplications");
  }
}
