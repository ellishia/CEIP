package direc.procesos;

import direc.IntanceEjemplar;
import direc.ejemplares.Ejemplar;
import direc.intanceejemplar.Ejemplares;
import direc.procesos.anadirejemplar.Lock;
import direc.procesos.anadirejemplar.Place;
import java.util.ArrayList;
import org.monet.bpi.DelegationSetup;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.JobRequest;
import org.monet.bpi.JobResponse;
import org.monet.bpi.JobSetup;
import org.monet.bpi.Node;
import org.monet.bpi.RoleChooser;
import org.monet.bpi.ValidationResult;
import org.monet.bpi.java.ActivityImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;

@SuppressWarnings("all")
public class AnadirEjemplar extends ActivityImpl {
  public void doUnlock(final Lock lock) {
    this.unlock(lock);
  }
  
  public void doLock(final Lock lock) {
    this.lock(lock);
  }
  
  public void doGoto(final Place place, final String historyText) {
    this._goto(place.getId(), historyText);
  }
  
  public static AnadirEjemplar createNew() {
    return (direc.procesos.AnadirEjemplar)org.monet.bpi.TaskService.create(direc.procesos.AnadirEjemplar.class);
  }
  
  private void onSolve0(final IntanceEjemplar f) {
    FieldMultiple<Ejemplares,Void> _ejemplaresField = f.getEjemplaresField();
    ArrayList<Ejemplares> _allFields = _ejemplaresField.getAllFields();
    for (final Ejemplares item : _allFields) {
      {
        direc.Ejemplares ejemplares = direc.Ejemplares.getInstance();
        org.monet.bpi.types.Number _number = item.getNumber();
        int i = _number.intValue();
        boolean _greaterThan = (i > 0);
        boolean _while = _greaterThan;
        while (_while) {
          {
            Ejemplar ejemplar = Ejemplar.createNew(ejemplares);
            Link _libro = item.getLibro();
            ejemplar.setLibro(_libro);
            ejemplar.setEstado("nuevo");
            ejemplar.save();
            int _minus = (i - 1);
            i = _minus;
          }
          boolean _greaterThan_1 = (i > 0);
          _while = _greaterThan_1;
        }
      }
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
    switch(hash) {case -658179797 :
      onSolve0((direc.IntanceEjemplar) p0);
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
