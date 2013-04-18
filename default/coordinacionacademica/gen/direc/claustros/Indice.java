package direc.claustros;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Title = new org.monet.bpi.Param("mo3_vbq");
  
  public String getTitle() {
    return (java.lang.String)this.getAttribute("mo3_vbq");
  }
  
  public void setTitle(final String Title) {
    this.setAttribute("mo3_vbq", Title);
  }
}
