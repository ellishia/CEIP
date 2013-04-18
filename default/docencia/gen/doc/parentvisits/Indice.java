package doc.parentvisits;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Date;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Title = new org.monet.bpi.Param("mig11aq");
  
  public String getTitle() {
    return (java.lang.String)this.getAttribute("mig11aq");
  }
  
  public void setTitle(final String Title) {
    this.setAttribute("mig11aq", Title);
  }
  
  public final static Param Date = new org.monet.bpi.Param("mdtjgla");
  
  public Date getDate() {
    return (org.monet.bpi.types.Date)this.getAttribute("mdtjgla");
  }
  
  public void setDate(final Date Date) {
    this.setAttribute("mdtjgla", Date);
  }
  
  public final static Param Identifier = new org.monet.bpi.Param("msokzaa");
  
  public String getIdentifier() {
    return (java.lang.String)this.getAttribute("msokzaa");
  }
  
  public void setIdentifier(final String Identifier) {
    this.setAttribute("msokzaa", Identifier);
  }
}
