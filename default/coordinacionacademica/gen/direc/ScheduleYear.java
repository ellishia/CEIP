package direc;

import direc.schedules.Indice;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class ScheduleYear extends NodeFormImpl {
  public FieldSelect getAcademicYearField() {
    return ((org.monet.bpi.FieldSelect)this.getField("ScheduleYear", "AcademicYear"));
  }
  
  public Term getAcademicYear() {
    return ((org.monet.bpi.FieldSelect)this.getField("ScheduleYear", "AcademicYear")).get();
  }
  
  public void setAcademicYear(final Term value) {
    this.getAcademicYearField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.schedules.Indice)this.getIndexEntry("direc.Schedules.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static ScheduleYear createNew(final Node parent) {
    return (direc.ScheduleYear)org.monet.bpi.NodeService.create(direc.ScheduleYear.class, parent);
  }
}
