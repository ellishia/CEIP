package grades.califications;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings(value = "all")
public class Indice extends IndexEntryImpl {
  public final static Param Subject = new org.monet.bpi.Param("iminbk5w");
  
  public Term getSubject() {
    return (org.monet.bpi.types.Term)this.getAttribute("iminbk5w");
  }
  
  public void setSubject(final Term Subject) {
    this.setAttribute("iminbk5w", Subject);
  }
  
  public final static Param Level = new org.monet.bpi.Param("mevbxmw");
  
  public Term getLevel() {
    return (org.monet.bpi.types.Term)this.getAttribute("mevbxmw");
  }
  
  public void setLevel(final Term Level) {
    this.setAttribute("mevbxmw", Level);
  }
  
  public final static Param Grade = new org.monet.bpi.Param("mkrpqvg");
  
  public String getGrade() {
    return (java.lang.String)this.getAttribute("mkrpqvg");
  }
  
  public void setGrade(final String Grade) {
    this.setAttribute("mkrpqvg", Grade);
  }
  
  public final static Param Trimester = new org.monet.bpi.Param("mo9mzwg");
  
  public Term getTrimester() {
    return (org.monet.bpi.types.Term)this.getAttribute("mo9mzwg");
  }
  
  public void setTrimester(final Term Trimester) {
    this.setAttribute("mo9mzwg", Trimester);
  }
  
  public final static Param AcademicYear = new org.monet.bpi.Param("mi8peha");
  
  public Term getAcademicYear() {
    return (org.monet.bpi.types.Term)this.getAttribute("mi8peha");
  }
  
  public void setAcademicYear(final Term AcademicYear) {
    this.setAttribute("mi8peha", AcademicYear);
  }
  
  public final static Param Student = new org.monet.bpi.Param("mh5h9sw");
  
  public Term getStudent() {
    return (org.monet.bpi.types.Term)this.getAttribute("mh5h9sw");
  }
  
  public void setStudent(final Term Student) {
    this.setAttribute("mh5h9sw", Student);
  }
  
  public final static Param Cial = new org.monet.bpi.Param("m4azljw");
  
  public String getCial() {
    return (java.lang.String)this.getAttribute("m4azljw");
  }
  
  public void setCial(final String Cial) {
    this.setAttribute("m4azljw", Cial);
  }
}
