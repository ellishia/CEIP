package doc.subjects;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Name = new org.monet.bpi.Param("mt_1fqq");
  
  public String getName() {
    return (java.lang.String)this.getAttribute("mt_1fqq");
  }
  
  public void setName(final String Name) {
    this.setAttribute("mt_1fqq", Name);
  }
  
  public final static Param Identifier = new org.monet.bpi.Param("mzmk4og");
  
  public String getIdentifier() {
    return (java.lang.String)this.getAttribute("mzmk4og");
  }
  
  public void setIdentifier(final String Identifier) {
    this.setAttribute("mzmk4og", Identifier);
  }
}
