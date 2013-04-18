package direc.asignations;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param AcademicYear = new org.monet.bpi.Param("myack7a");
  
  public Term getAcademicYear() {
    return (org.monet.bpi.types.Term)this.getAttribute("myack7a");
  }
  
  public void setAcademicYear(final Term AcademicYear) {
    this.setAttribute("myack7a", AcademicYear);
  }
  
  public final static Param Student = new org.monet.bpi.Param("mzzyd7a");
  
  public Term getStudent() {
    return (org.monet.bpi.types.Term)this.getAttribute("mzzyd7a");
  }
  
  public void setStudent(final Term Student) {
    this.setAttribute("mzzyd7a", Student);
  }
}
