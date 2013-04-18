package direc.schedule;

import direc.schedule.Indice;
import org.monet.bpi.FieldLink;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class ScheduleSlot extends NodeFormImpl {
  public FieldLink getSlotField() {
    return ((org.monet.bpi.FieldLink)this.getField("ScheduleSlot", "Slot"));
  }
  
  public Link getSlot() {
    return ((org.monet.bpi.FieldLink)this.getField("ScheduleSlot", "Slot")).get();
  }
  
  public Term getSlotAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("ScheduleSlot", "Slot")).getAsTerm();
  }
  
  public void setSlot(final Link value) {
    this.getSlotField().set(value);
  }
  
  public FieldLink getTeacherField() {
    return ((org.monet.bpi.FieldLink)this.getField("ScheduleSlot", "Teacher"));
  }
  
  public Link getTeacher() {
    return ((org.monet.bpi.FieldLink)this.getField("ScheduleSlot", "Teacher")).get();
  }
  
  public Term getTeacherAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("ScheduleSlot", "Teacher")).getAsTerm();
  }
  
  public void setTeacher(final Link value) {
    this.getTeacherField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.schedule.Indice)this.getIndexEntry("direc.Schedule.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static ScheduleSlot createNew(final Node parent) {
    return (direc.schedule.ScheduleSlot)org.monet.bpi.NodeService.create(direc.schedule.ScheduleSlot.class, parent);
  }
}
