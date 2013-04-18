package grades.trimestralevaluations;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings(value = "all")
public class Indice extends IndexEntryImpl {
  public final static Param AcademicYear = new org.monet.bpi.Param("mhga3lg");
  
  public Term getAcademicYear() {
    return (org.monet.bpi.types.Term)this.getAttribute("mhga3lg");
  }
  
  public void setAcademicYear(final Term AcademicYear) {
    this.setAttribute("mhga3lg", AcademicYear);
  }
  
  public final static Param Group = new org.monet.bpi.Param("m1swm9q");
  
  public Term getGroup() {
    return (org.monet.bpi.types.Term)this.getAttribute("m1swm9q");
  }
  
  public void setGroup(final Term Group) {
    this.setAttribute("m1swm9q", Group);
  }
  
  public final static Param Teacher = new org.monet.bpi.Param("miark_g");
  
  public Term getTeacher() {
    return (org.monet.bpi.types.Term)this.getAttribute("miark_g");
  }
  
  public void setTeacher(final Term Teacher) {
    this.setAttribute("miark_g", Teacher);
  }
}
