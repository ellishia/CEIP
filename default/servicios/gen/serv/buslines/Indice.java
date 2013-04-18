package serv.buslines;

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
  
  public final static Param Id = new org.monet.bpi.Param("menunpq");
  
  public String getId() {
    return (java.lang.String)this.getAttribute("menunpq");
  }
  
  public void setId(final String Id) {
    this.setAttribute("menunpq", Id);
  }
}
