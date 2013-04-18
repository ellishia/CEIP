package serv.stops;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Name = new org.monet.bpi.Param("imkufqig");
  
  public String getName() {
    return (java.lang.String)this.getAttribute("imkufqig");
  }
  
  public void setName(final String Name) {
    this.setAttribute("imkufqig", Name);
  }
  
  public final static Param Identifier = new org.monet.bpi.Param("m_ewveq");
  
  public String getIdentifier() {
    return (java.lang.String)this.getAttribute("m_ewveq");
  }
  
  public void setIdentifier(final String Identifier) {
    this.setAttribute("m_ewveq", Identifier);
  }
}
