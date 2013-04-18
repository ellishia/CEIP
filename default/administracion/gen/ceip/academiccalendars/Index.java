package ceip.academiccalendars;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Index extends IndexEntryImpl {
  public final static Param AcademicYear = new org.monet.bpi.Param("mbqd4gw");
  
  public Term getAcademicYear() {
    return (org.monet.bpi.types.Term)this.getAttribute("mbqd4gw");
  }
  
  public void setAcademicYear(final Term academicYear) {
    this.setAttribute("mbqd4gw", academicYear);
  }
}
