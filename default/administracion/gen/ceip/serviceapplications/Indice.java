package ceip.serviceapplications;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Date = new org.monet.bpi.Param("img7bi6g");
  
  public String getDate() {
    return (java.lang.String)this.getAttribute("img7bi6g");
  }
  
  public void setDate(final String Date) {
    this.setAttribute("img7bi6g", Date);
  }
  
  public final static Param StudentName = new org.monet.bpi.Param("mly34sg");
  
  public String getStudentName() {
    return (java.lang.String)this.getAttribute("mly34sg");
  }
  
  public void setStudentName(final String StudentName) {
    this.setAttribute("mly34sg", StudentName);
  }
  
  public final static Param StudentSurname = new org.monet.bpi.Param("mayyduq");
  
  public String getStudentSurname() {
    return (java.lang.String)this.getAttribute("mayyduq");
  }
  
  public void setStudentSurname(final String StudentSurname) {
    this.setAttribute("mayyduq", StudentSurname);
  }
  
  public final static Param Cial = new org.monet.bpi.Param("mbh8uvw");
  
  public String getCial() {
    return (java.lang.String)this.getAttribute("mbh8uvw");
  }
  
  public void setCial(final String Cial) {
    this.setAttribute("mbh8uvw", Cial);
  }
  
  public final static Param Identifier = new org.monet.bpi.Param("mfkgxrg");
  
  public String getIdentifier() {
    return (java.lang.String)this.getAttribute("mfkgxrg");
  }
  
  public void setIdentifier(final String Identifier) {
    this.setAttribute("mfkgxrg", Identifier);
  }
}
