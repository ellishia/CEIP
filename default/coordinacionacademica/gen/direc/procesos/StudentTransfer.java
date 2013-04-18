package direc.procesos;

import direc.procesos.studenttransfer.Lock;
import direc.procesos.studenttransfer.Place;
import org.monet.bpi.DelegationSetup;
import org.monet.bpi.JobRequest;
import org.monet.bpi.JobResponse;
import org.monet.bpi.JobSetup;
import org.monet.bpi.Node;
import org.monet.bpi.RoleChooser;
import org.monet.bpi.ValidationResult;
import org.monet.bpi.java.ServiceImpl;
import org.monet.bpi.types.Date;

@SuppressWarnings("all")
public class StudentTransfer extends ServiceImpl {
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
    return (direc.procesos.StudentTransfer)org.monet.bpi.TaskService.create(direc.procesos.StudentTransfer.class);
  }
  
  private void onArrive0() {
    this.addLog("Llega al inicial", "");
  }
  
  public void onArrivePlace(final String placeCode) {
    int hash = (placeCode).hashCode();
    switch(hash) {case -502406697 :
      onArrive0();
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
}
