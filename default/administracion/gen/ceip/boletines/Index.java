package ceip.boletines;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Index extends IndexEntryImpl {
  public final static Param Name = new org.monet.bpi.Param("mdzpx_q");
  
  public String getName() {
    return (java.lang.String)this.getAttribute("mdzpx_q");
  }
  
  public void setName(final String Name) {
    this.setAttribute("mdzpx_q", Name);
  }
  
  public final static Param AcademicYear = new org.monet.bpi.Param("mviej6q");
  
  public String getAcademicYear() {
    return (java.lang.String)this.getAttribute("mviej6q");
  }
  
  public void setAcademicYear(final String AcademicYear) {
    this.setAttribute("mviej6q", AcademicYear);
  }
  
  public final static Param Trimester = new org.monet.bpi.Param("meac4mw");
  
  public Term getTrimester() {
    return (org.monet.bpi.types.Term)this.getAttribute("meac4mw");
  }
  
  public void setTrimester(final Term Trimester) {
    this.setAttribute("meac4mw", Trimester);
  }
  
  public final static Param StudentName = new org.monet.bpi.Param("m1asb2a");
  
  public String getStudentName() {
    return (java.lang.String)this.getAttribute("m1asb2a");
  }
  
  public void setStudentName(final String StudentName) {
    this.setAttribute("m1asb2a", StudentName);
  }
}
