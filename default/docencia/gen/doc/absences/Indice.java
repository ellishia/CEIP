package doc.absences;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Date = new org.monet.bpi.Param("mnrveow");
  
  public Date getDate() {
    return (org.monet.bpi.types.Date)this.getAttribute("mnrveow");
  }
  
  public void setDate(final Date Date) {
    this.setAttribute("mnrveow", Date);
  }
  
  public final static Param Student = new org.monet.bpi.Param("mycgusa");
  
  public Link getStudent() {
    return (org.monet.bpi.types.Link)this.getAttribute("mycgusa");
  }
  
  public void setStudent(final Link Student) {
    this.setAttribute("mycgusa", Student);
  }
}
