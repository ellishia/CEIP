package direc.slots;

import direc.slots.Indice;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Slot extends NodeFormImpl {
  public FieldSelect getWeekdayField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Slot", "Weekday"));
  }
  
  public Term getWeekday() {
    return ((org.monet.bpi.FieldSelect)this.getField("Slot", "Weekday")).get();
  }
  
  public void setWeekday(final Term value) {
    this.getWeekdayField().set(value);
  }
  
  public FieldText getDayHourField() {
    return ((org.monet.bpi.FieldText)this.getField("Slot", "DayHour"));
  }
  
  public String getDayHour() {
    return ((org.monet.bpi.FieldText)this.getField("Slot", "DayHour")).get();
  }
  
  public void setDayHour(final String value) {
    this.getDayHourField().set(value);
  }
  
  public FieldSelect getSubjectField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Slot", "Subject"));
  }
  
  public Term getSubject() {
    return ((org.monet.bpi.FieldSelect)this.getField("Slot", "Subject")).get();
  }
  
  public void setSubject(final Term value) {
    this.getSubjectField().set(value);
  }
  
  public FieldLink getGroupField() {
    return ((org.monet.bpi.FieldLink)this.getField("Slot", "Group"));
  }
  
  public Link getGroup() {
    return ((org.monet.bpi.FieldLink)this.getField("Slot", "Group")).get();
  }
  
  public Term getGroupAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("Slot", "Group")).getAsTerm();
  }
  
  public void setGroup(final Link value) {
    this.getGroupField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.slots.Indice)this.getIndexEntry("direc.Slots.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Slot createNew(final Node parent) {
    return (direc.slots.Slot)org.monet.bpi.NodeService.create(direc.slots.Slot.class, parent);
  }
}
