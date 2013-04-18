package direc.teacherasignations;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Teacher = new org.monet.bpi.Param("im69logq");
  
  public Term getTeacher() {
    return (org.monet.bpi.types.Term)this.getAttribute("im69logq");
  }
  
  public void setTeacher(final Term Teacher) {
    this.setAttribute("im69logq", Teacher);
  }
}
