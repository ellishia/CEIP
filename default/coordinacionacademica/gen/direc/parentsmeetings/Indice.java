package direc.parentsmeetings;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Title = new org.monet.bpi.Param("imcb_1xq");
  
  public String getTitle() {
    return (java.lang.String)this.getAttribute("imcb_1xq");
  }
  
  public void setTitle(final String Title) {
    this.setAttribute("imcb_1xq", Title);
  }
  
  public final static Param Date = new org.monet.bpi.Param("mtq8ota");
  
  public Date getDate() {
    return (org.monet.bpi.types.Date)this.getAttribute("mtq8ota");
  }
  
  public void setDate(final Date Date) {
    this.setAttribute("mtq8ota", Date);
  }
  
  public final static Param Group = new org.monet.bpi.Param("mb03o6a");
  
  public Term getGroup() {
    return (org.monet.bpi.types.Term)this.getAttribute("mb03o6a");
  }
  
  public void setGroup(final Term Group) {
    this.setAttribute("mb03o6a", Group);
  }
  
  public final static Param Teacher = new org.monet.bpi.Param("mnrbmfg");
  
  public Term getTeacher() {
    return (org.monet.bpi.types.Term)this.getAttribute("mnrbmfg");
  }
  
  public void setTeacher(final Term Teacher) {
    this.setAttribute("mnrbmfg", Teacher);
  }
}
