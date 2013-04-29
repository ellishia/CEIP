package direc.schedule;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Group = new org.monet.bpi.Param("mqnqraw");
  
  public Link getGroup() {
    return (org.monet.bpi.types.Link)this.getAttribute("mqnqraw");
  }
  
  public void setGroup(final Link Group) {
    this.setAttribute("mqnqraw", Group);
  }
  
  public final static Param Weekday = new org.monet.bpi.Param("m1pfonq");
  
  public Term getWeekday() {
    return (org.monet.bpi.types.Term)this.getAttribute("m1pfonq");
  }
  
  public void setWeekday(final Term Weekday) {
    this.setAttribute("m1pfonq", Weekday);
  }
  
  public final static Param DayHour = new org.monet.bpi.Param("mzilrsq");
  
  public String getDayHour() {
    return (java.lang.String)this.getAttribute("mzilrsq");
  }
  
  public void setDayHour(final String DayHour) {
    this.setAttribute("mzilrsq", DayHour);
  }
  
  public final static Param Subject = new org.monet.bpi.Param("mno6_qg");
  
  public String getSubject() {
    return (java.lang.String)this.getAttribute("mno6_qg");
  }
  
  public void setSubject(final String Subject) {
    this.setAttribute("mno6_qg", Subject);
  }
  
  public final static Param Teacher = new org.monet.bpi.Param("makme0a");
  
  public Link getTeacher() {
    return (org.monet.bpi.types.Link)this.getAttribute("makme0a");
  }
  
  public void setTeacher(final Link Teacher) {
    this.setAttribute("makme0a", Teacher);
  }
}
