package direc.teacherasignations;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Link;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Teacher = new org.monet.bpi.Param("im69logq");
  
  public Link getTeacher() {
    return (org.monet.bpi.types.Link)this.getAttribute("im69logq");
  }
  
  public void setTeacher(final Link Teacher) {
    this.setAttribute("im69logq", Teacher);
  }
}
