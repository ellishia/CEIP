package doc.groups;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Name = new org.monet.bpi.Param("im9nub3a");
  
  public String getName() {
    return (java.lang.String)this.getAttribute("im9nub3a");
  }
  
  public void setName(final String Name) {
    this.setAttribute("im9nub3a", Name);
  }
}
