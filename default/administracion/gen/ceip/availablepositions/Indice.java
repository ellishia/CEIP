package ceip.availablepositions;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Anyo = new org.monet.bpi.Param("imljgmza");
  
  public String getAnyo() {
    return (java.lang.String)this.getAttribute("imljgmza");
  }
  
  public void setAnyo(final String Anyo) {
    this.setAttribute("imljgmza", Anyo);
  }
}
