package direc.dayorders;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Title = new org.monet.bpi.Param("imcb_1xq");
  
  public String getTitle() {
    return (java.lang.String)this.getAttribute("imcb_1xq");
  }
  
  public void setTitle(final String Title) {
    this.setAttribute("imcb_1xq", Title);
  }
}
