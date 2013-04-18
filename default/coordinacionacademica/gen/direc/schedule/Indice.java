package direc.schedule;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Slot = new org.monet.bpi.Param("imci9utq");
  
  public Term getSlot() {
    return (org.monet.bpi.types.Term)this.getAttribute("imci9utq");
  }
  
  public void setSlot(final Term Slot) {
    this.setAttribute("imci9utq", Slot);
  }
  
  public final static Param Teacher = new org.monet.bpi.Param("makme0a");
  
  public Link getTeacher() {
    return (org.monet.bpi.types.Link)this.getAttribute("makme0a");
  }
  
  public void setTeacher(final Link Teacher) {
    this.setAttribute("makme0a", Teacher);
  }
}
