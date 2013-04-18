package serv.specialmenus;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Suitable = new org.monet.bpi.Param("imkufqig");
  
  public String getSuitable() {
    return (java.lang.String)this.getAttribute("imkufqig");
  }
  
  public void setSuitable(final String Suitable) {
    this.setAttribute("imkufqig", Suitable);
  }
  
  public final static Param Identifier = new org.monet.bpi.Param("m9bkhmq");
  
  public String getIdentifier() {
    return (java.lang.String)this.getAttribute("m9bkhmq");
  }
  
  public void setIdentifier(final String Identifier) {
    this.setAttribute("m9bkhmq", Identifier);
  }
}
