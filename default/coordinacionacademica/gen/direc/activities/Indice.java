package direc.activities;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Name = new org.monet.bpi.Param("im_8grta");
  
  public String getName() {
    return (java.lang.String)this.getAttribute("im_8grta");
  }
  
  public void setName(final String Name) {
    this.setAttribute("im_8grta", Name);
  }
}
