package solicitud.applications;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Identifier = new org.monet.bpi.Param("m9tmdqg");
  
  public String getIdentifier() {
    return (java.lang.String)this.getAttribute("m9tmdqg");
  }
  
  public void setIdentifier(final String Identifier) {
    this.setAttribute("m9tmdqg", Identifier);
  }
  
  public final static Param StudentName = new org.monet.bpi.Param("mmqilaa");
  
  public String getStudentName() {
    return (java.lang.String)this.getAttribute("mmqilaa");
  }
  
  public void setStudentName(final String StudentName) {
    this.setAttribute("mmqilaa", StudentName);
  }
  
  public final static Param StudentSurname = new org.monet.bpi.Param("m7njy2q");
  
  public String getStudentSurname() {
    return (java.lang.String)this.getAttribute("m7njy2q");
  }
  
  public void setStudentSurname(final String StudentSurname) {
    this.setAttribute("m7njy2q", StudentSurname);
  }
  
  public final static Param Cial = new org.monet.bpi.Param("mzl__yg");
  
  public String getCial() {
    return (java.lang.String)this.getAttribute("mzl__yg");
  }
  
  public void setCial(final String Cial) {
    this.setAttribute("mzl__yg", Cial);
  }
}
