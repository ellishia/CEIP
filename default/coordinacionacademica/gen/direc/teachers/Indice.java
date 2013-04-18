package direc.teachers;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Name = new org.monet.bpi.Param("imrlvfkg");
  
  public String getName() {
    return (java.lang.String)this.getAttribute("imrlvfkg");
  }
  
  public void setName(final String Name) {
    this.setAttribute("imrlvfkg", Name);
  }
  
  public final static Param Surname = new org.monet.bpi.Param("mhahdla");
  
  public String getSurname() {
    return (java.lang.String)this.getAttribute("mhahdla");
  }
  
  public void setSurname(final String Surname) {
    this.setAttribute("mhahdla", Surname);
  }
  
  public final static Param Identifier = new org.monet.bpi.Param("my7etra");
  
  public String getIdentifier() {
    return (java.lang.String)this.getAttribute("my7etra");
  }
  
  public void setIdentifier(final String Identifier) {
    this.setAttribute("my7etra", Identifier);
  }
}
