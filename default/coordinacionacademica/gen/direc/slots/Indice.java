package direc.slots;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Group = new org.monet.bpi.Param("ime33kpa");
  
  public Link getGroup() {
    return (org.monet.bpi.types.Link)this.getAttribute("ime33kpa");
  }
  
  public void setGroup(final Link Group) {
    this.setAttribute("ime33kpa", Group);
  }
  
  public final static Param Weekday = new org.monet.bpi.Param("ml9itya");
  
  public Term getWeekday() {
    return (org.monet.bpi.types.Term)this.getAttribute("ml9itya");
  }
  
  public void setWeekday(final Term Weekday) {
    this.setAttribute("ml9itya", Weekday);
  }
  
  public final static Param DayHour = new org.monet.bpi.Param("makcuza");
  
  public String getDayHour() {
    return (java.lang.String)this.getAttribute("makcuza");
  }
  
  public void setDayHour(final String DayHour) {
    this.setAttribute("makcuza", DayHour);
  }
}
