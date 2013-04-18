package doc.alumnado;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Date;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Name = new org.monet.bpi.Param("immdlljg");
  
  public String getName() {
    return (java.lang.String)this.getAttribute("immdlljg");
  }
  
  public void setName(final String Name) {
    this.setAttribute("immdlljg", Name);
  }
  
  public final static Param Surname = new org.monet.bpi.Param("mrzyyaq");
  
  public String getSurname() {
    return (java.lang.String)this.getAttribute("mrzyyaq");
  }
  
  public void setSurname(final String Surname) {
    this.setAttribute("mrzyyaq", Surname);
  }
  
  public final static Param Cial = new org.monet.bpi.Param("mgaelyq");
  
  public String getCial() {
    return (java.lang.String)this.getAttribute("mgaelyq");
  }
  
  public void setCial(final String Cial) {
    this.setAttribute("mgaelyq", Cial);
  }
  
  public final static Param BirthDate = new org.monet.bpi.Param("mbl7uda");
  
  public Date getBirthDate() {
    return (org.monet.bpi.types.Date)this.getAttribute("mbl7uda");
  }
  
  public void setBirthDate(final Date BirthDate) {
    this.setAttribute("mbl7uda", BirthDate);
  }
}
