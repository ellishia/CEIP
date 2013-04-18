package direc.scheduleyear;

import direc.ScheduleYear;
import direc.schedules.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.ScheduleYear node = (direc.ScheduleYear) this.genericGetNode();
    direc.schedules.Indice reference = (direc.schedules.Indice) this.genericGetReference();
    reference.setAcademicYear(node.getAcademicYear());
    
  }
  
  public Indice getReference() {
    return (direc.schedules.Indice) this.genericGetReference();
  }
  
  public ScheduleYear getNode() {
    return (direc.ScheduleYear) this.genericGetNode();
  }
}
