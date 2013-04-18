package ceip.academiccalendars.academiccalendar;

import ceip.academiccalendars.AcademicCalendar;
import ceip.academiccalendars.Index;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    ceip.academiccalendars.AcademicCalendar node = (ceip.academiccalendars.AcademicCalendar) this.genericGetNode();
    ceip.academiccalendars.Index reference = (ceip.academiccalendars.Index) this.genericGetReference();
    
  }
  
  public Index getReference() {
    return (ceip.academiccalendars.Index) this.genericGetReference();
  }
  
  public AcademicCalendar getNode() {
    return (ceip.academiccalendars.AcademicCalendar) this.genericGetNode();
  }
}
