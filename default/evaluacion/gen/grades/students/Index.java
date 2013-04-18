package grades.students;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings(value = "all")
public class Index extends IndexEntryImpl {
  public final static Param Nombre = new org.monet.bpi.Param("imphcdia");
  
  public String getNombre() {
    return (java.lang.String)this.getAttribute("imphcdia");
  }
  
  public void setNombre(final String Nombre) {
    this.setAttribute("imphcdia", Nombre);
  }
  
  public final static Param Surname = new org.monet.bpi.Param("mxxcmpg");
  
  public String getSurname() {
    return (java.lang.String)this.getAttribute("mxxcmpg");
  }
  
  public void setSurname(final String Surname) {
    this.setAttribute("mxxcmpg", Surname);
  }
  
  public final static Param Cial = new org.monet.bpi.Param("mtrp82w");
  
  public String getCial() {
    return (java.lang.String)this.getAttribute("mtrp82w");
  }
  
  public void setCial(final String Cial) {
    this.setAttribute("mtrp82w", Cial);
  }
}
