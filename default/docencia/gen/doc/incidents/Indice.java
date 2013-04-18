package doc.incidents;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Place = new org.monet.bpi.Param("imqtitkw");
  
  public String getPlace() {
    return (java.lang.String)this.getAttribute("imqtitkw");
  }
  
  public void setPlace(final String Place) {
    this.setAttribute("imqtitkw", Place);
  }
  
  public final static Param Student = new org.monet.bpi.Param("m21abnw");
  
  public Link getStudent() {
    return (org.monet.bpi.types.Link)this.getAttribute("m21abnw");
  }
  
  public void setStudent(final Link Student) {
    this.setAttribute("m21abnw", Student);
  }
  
  public final static Param Date = new org.monet.bpi.Param("m4arhsa");
  
  public Date getDate() {
    return (org.monet.bpi.types.Date)this.getAttribute("m4arhsa");
  }
  
  public void setDate(final Date Date) {
    this.setAttribute("m4arhsa", Date);
  }
}
