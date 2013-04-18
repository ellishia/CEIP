package direc.students;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Index extends IndexEntryImpl {
  public final static Param Name = new org.monet.bpi.Param("imphcdia");
  
  public String getName() {
    return (java.lang.String)this.getAttribute("imphcdia");
  }
  
  public void setName(final String Name) {
    this.setAttribute("imphcdia", Name);
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
  
  public final static Param Level = new org.monet.bpi.Param("med9lia");
  
  public Term getLevel() {
    return (org.monet.bpi.types.Term)this.getAttribute("med9lia");
  }
  
  public void setLevel(final Term Level) {
    this.setAttribute("med9lia", Level);
  }
}
