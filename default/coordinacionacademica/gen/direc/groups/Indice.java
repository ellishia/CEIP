package direc.groups;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Name = new org.monet.bpi.Param("im9nub3a");
  
  public String getName() {
    return (java.lang.String)this.getAttribute("im9nub3a");
  }
  
  public void setName(final String Name) {
    this.setAttribute("im9nub3a", Name);
  }
  
  public final static Param Identifier = new org.monet.bpi.Param("meodvlg");
  
  public String getIdentifier() {
    return (java.lang.String)this.getAttribute("meodvlg");
  }
  
  public void setIdentifier(final String Identifier) {
    this.setAttribute("meodvlg", Identifier);
  }
  
  public final static Param AcademicYear = new org.monet.bpi.Param("mxnbm_a");
  
  public Term getAcademicYear() {
    return (org.monet.bpi.types.Term)this.getAttribute("mxnbm_a");
  }
  
  public void setAcademicYear(final Term AcademicYear) {
    this.setAttribute("mxnbm_a", AcademicYear);
  }
}
