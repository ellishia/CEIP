package direc.schedule.scheduleslot;

import direc.schedule.Indice;
import direc.schedule.ScheduleSlot;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.schedule.ScheduleSlot node = (direc.schedule.ScheduleSlot) this.genericGetNode();
    direc.schedule.Indice reference = (direc.schedule.Indice) this.genericGetReference();
    reference.setTeacher(node.getTeacher());
    
  }
  
  public Indice getReference() {
    return (direc.schedule.Indice) this.genericGetReference();
  }
  
  public ScheduleSlot getNode() {
    return (direc.schedule.ScheduleSlot) this.genericGetNode();
  }
}
