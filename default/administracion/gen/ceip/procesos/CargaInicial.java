package ceip.procesos;

import ceip.CenterInformation;
import ceip.CentroInfo;
import ceip.centerinformation.Contact;
import ceip.procesos.cargainicial.Lock;
import ceip.procesos.cargainicial.Place;
import org.monet.bpi.DelegationSetup;
import org.monet.bpi.JobRequest;
import org.monet.bpi.JobResponse;
import org.monet.bpi.JobSetup;
import org.monet.bpi.Node;
import org.monet.bpi.RoleChooser;
import org.monet.bpi.ValidationResult;
import org.monet.bpi.java.ActivityImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class CargaInicial extends ActivityImpl {
  public void doUnlock(final Lock lock) {
    this.unlock(lock);
  }
  
  public void doLock(final Lock lock) {
    this.lock(lock);
  }
  
  public void doGoto(final Place place, final String historyText) {
    this._goto(place.getId(), historyText);
  }
  
  public static CargaInicial createNew() {
    return (ceip.procesos.CargaInicial)org.monet.bpi.TaskService.create(ceip.procesos.CargaInicial.class);
  }
  
  private void onSolve0(final CenterInformation f) {
    CentroInfo centroInfo = CentroInfo.getInstance();
    CenterInformation info = centroInfo.getCenterInformation();
    String _centerCode = f.getCenterCode();
    info.setCenterCode(_centerCode);
    String _centerName = f.getCenterName();
    info.setCenterName(_centerName);
    Term _academicYear = f.getAcademicYear();
    info.setAcademicYear(_academicYear);
    Contact _contactField = info.getContactField();
    Contact _contactField_1 = f.getContactField();
    String _address = _contactField_1.getAddress();
    _contactField.setAddress(_address);
    Contact _contactField_2 = info.getContactField();
    Contact _contactField_3 = f.getContactField();
    org.monet.bpi.types.Number _zIPCode = _contactField_3.getZIPCode();
    _contactField_2.setZIPCode(_zIPCode);
    Contact _contactField_4 = info.getContactField();
    Contact _contactField_5 = f.getContactField();
    String _town = _contactField_5.getTown();
    _contactField_4.setTown(_town);
    Contact _contactField_6 = info.getContactField();
    Contact _contactField_7 = f.getContactField();
    String _email = _contactField_7.getEmail();
    _contactField_6.setEmail(_email);
    String _influenceAreas = f.getInfluenceAreas();
    info.setInfluenceAreas(_influenceAreas);
    String _limitingAreas = f.getLimitingAreas();
    info.setLimitingAreas(_limitingAreas);
    info.save();
  }
  
  private void onValidate1(final CenterInformation f, final ValidationResult vr) {
    String _centerCode = f.getCenterCode();
    boolean _isEmpty = _centerCode.isEmpty();
    if (_isEmpty) {
      vr.addError("CenterCode", "est\u00E1 vacio");
    }
    String _centerName = f.getCenterName();
    boolean _isEmpty_1 = _centerName.isEmpty();
    if (_isEmpty_1) {
      vr.addError("CenterName", "est\u00E1 vacio");
    }
    Contact _contactField = f.getContactField();
    String _address = _contactField.getAddress();
    boolean _isEmpty_2 = _address.isEmpty();
    if (_isEmpty_2) {
      vr.addError("Address", "est\u00E1 vacio");
    }
    Contact _contactField_1 = f.getContactField();
    String _town = _contactField_1.getTown();
    boolean _isEmpty_3 = _town.isEmpty();
    if (_isEmpty_3) {
      vr.addError("Town", "est\u00E1 vacio");
    }
    Contact _contactField_2 = f.getContactField();
    String _email = _contactField_2.getEmail();
    boolean _isEmpty_4 = _email.isEmpty();
    if (_isEmpty_4) {
      vr.addError("Email", "est\u00E1 vacio");
    }
    String _influenceAreas = f.getInfluenceAreas();
    boolean _isEmpty_5 = _influenceAreas.isEmpty();
    if (_isEmpty_5) {
      vr.addError("InfluenceAreas", "est\u00E1 vacio");
    }
    String _limitingAreas = f.getLimitingAreas();
    boolean _isEmpty_6 = _limitingAreas.isEmpty();
    if (_isEmpty_6) {
      vr.addError("LimitingAreas", "est\u00E1 vacio");
    }
  }
  
  public void onArrivePlace(final String placeCode) {
    int hash = (placeCode).hashCode();
    switch(hash) {}
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
    switch(hash) {case -347969354 :
      onSolve0((ceip.CenterInformation) p0);
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
    switch(hash) {}
  }
  
  public void onSetupDelegationComplete(final String placeCode, final String actionCode, final Date p0, final Date p1, final String p2, final boolean p3) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {}
  }
  
  public void onValidateForm(final String placeCode, final String actionCode, final Node p0, final ValidationResult p1) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {case -347969354 :
      onValidate1((ceip.CenterInformation) p0,(org.monet.bpi.ValidationResult) p1);
    break;
    }
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
}
