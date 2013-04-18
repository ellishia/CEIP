package direc.schedules;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param AcademicYear = new org.monet.bpi.Param("imci9utq");
  
  public Term getAcademicYear() {
    return (org.monet.bpi.types.Term)this.getAttribute("imci9utq");
  }
  
  public void setAcademicYear(final Term AcademicYear) {
    this.setAttribute("imci9utq", AcademicYear);
  }
}
