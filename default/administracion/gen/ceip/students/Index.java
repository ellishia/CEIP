package ceip.students;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Index extends IndexEntryImpl {
  public final static Param Name = new org.monet.bpi.Param("mimpvgw");
  
  public String getName() {
    return (java.lang.String)this.getAttribute("mimpvgw");
  }
  
  public void setName(final String Name) {
    this.setAttribute("mimpvgw", Name);
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
