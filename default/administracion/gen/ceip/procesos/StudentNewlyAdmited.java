package ceip.procesos;

import ceip.AdmitedDoc;
import ceip.Applications;
import ceip.admiteddoc.Exportador;
import ceip.admiteddoc.exportador.ExporterScope;
import ceip.procesos.studentnewlyadmited.Lock;
import ceip.procesos.studentnewlyadmited.Place;
import org.monet.bpi.DelegationSetup;
import org.monet.bpi.JobRequest;
import org.monet.bpi.JobResponse;
import org.monet.bpi.JobSetup;
import org.monet.bpi.Node;
import org.monet.bpi.RoleChooser;
import org.monet.bpi.ValidationResult;
import org.monet.bpi.java.ActivityImpl;
import org.monet.bpi.types.Date;

@SuppressWarnings("all")
public class StudentNewlyAdmited extends ActivityImpl {
  public AdmitedDoc getTarget() {
    return (ceip.AdmitedDoc)genericGetTarget();
  }
  
  public void setTarget(final AdmitedDoc node) {
    this.genericSetTarget((ceip.AdmitedDoc)node);
  }
  
  public void onInitialize() {
    Applications _instance = Applications.getInstance();
    ExporterScope _doExportOf = Exportador.doExportOf(_instance);
    AdmitedDoc _newDocument = _doExportOf.toNewDocument();
    this.setTarget(_newDocument);
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
  
  public static StudentNewlyAdmited createNew() {
    return (ceip.procesos.StudentNewlyAdmited)org.monet.bpi.TaskService.create(ceip.procesos.StudentNewlyAdmited.class);
  }
  
  private void onSetup0(final DelegationSetup ds) {
    ds.cancel();
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
    switch(hash) {}
  }
  
  public void onSetupDelegation(final String placeCode, final String actionCode, final DelegationSetup p0) {
    int hash = (actionCode + placeCode).hashCode();
    switch(hash) {case 2071156568 :
      onSetup0((org.monet.bpi.DelegationSetup) p0);
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
