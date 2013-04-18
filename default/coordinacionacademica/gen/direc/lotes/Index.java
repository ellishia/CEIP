package direc.lotes;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Index extends IndexEntryImpl {
  public final static Param Identifier = new org.monet.bpi.Param("imdhfuzq");
  
  public String getIdentifier() {
    return (java.lang.String)this.getAttribute("imdhfuzq");
  }
  
  public void setIdentifier(final String Identifier) {
    this.setAttribute("imdhfuzq", Identifier);
  }
  
  public final static Param AcademicYear = new org.monet.bpi.Param("mpvpteq");
  
  public Term getAcademicYear() {
    return (org.monet.bpi.types.Term)this.getAttribute("mpvpteq");
  }
  
  public void setAcademicYear(final Term AcademicYear) {
    this.setAttribute("mpvpteq", AcademicYear);
  }
  
  public final static Param Level = new org.monet.bpi.Param("mju9q8q");
  
  public Term getLevel() {
    return (org.monet.bpi.types.Term)this.getAttribute("mju9q8q");
  }
  
  public void setLevel(final Term Level) {
    this.setAttribute("mju9q8q", Level);
  }
}
