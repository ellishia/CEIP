package direc.schedule.scheduleslot;

import com.google.common.base.Objects;
import direc.schedule.Indice;
import direc.schedule.ScheduleSlot;
import direc.slots.Slot;
import org.monet.bpi.FieldLink;
import org.monet.bpi.Node;
import org.monet.bpi.java.MappingImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.schedule.ScheduleSlot node = (direc.schedule.ScheduleSlot) this.genericGetNode();
    direc.schedule.Indice reference = (direc.schedule.Indice) this.genericGetReference();
    reference.setTeacher(node.getTeacher());
    this.calculate();
  }
  
  public Indice getReference() {
    return (direc.schedule.Indice) this.genericGetReference();
  }
  
  public ScheduleSlot getNode() {
    return (direc.schedule.ScheduleSlot) this.genericGetNode();
  }
  
  private void calculate() {
    ScheduleSlot nodo = this.getNode();
    Indice referencia = this.getReference();
    boolean _notEquals = (!Objects.equal(nodo, null));
    if (_notEquals) {
      FieldLink slotField = nodo.getSlotField();
      Link _teacher = nodo.getTeacher();
      referencia.setTeacher(_teacher);
      boolean _notEquals_1 = (!Objects.equal(slotField, null));
      if (_notEquals_1) {
        Node _node = slotField.getNode();
        Slot slot = ((Slot) _node);
        boolean _notEquals_2 = (!Objects.equal(slot, null));
        if (_notEquals_2) {
          Link _group = slot.getGroup();
          referencia.setGroup(_group);
          String _dayHour = slot.getDayHour();
          referencia.setDayHour(_dayHour);
          Term _weekday = slot.getWeekday();
          referencia.setWeekday(_weekday);
          String _subject = slot.getSubject();
          referencia.setSubject(_subject);
        }
      }
    }
  }
}
