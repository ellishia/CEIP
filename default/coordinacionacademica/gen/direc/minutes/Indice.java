package direc.minutes;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Title = new org.monet.bpi.Param("mxnwh6g");
  
  public String getTitle() {
    return (java.lang.String)this.getAttribute("mxnwh6g");
  }
  
  public void setTitle(final String Title) {
    this.setAttribute("mxnwh6g", Title);
  }
}
