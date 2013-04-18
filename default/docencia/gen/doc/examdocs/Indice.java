package doc.examdocs;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Name = new org.monet.bpi.Param("imlb9i_q");
  
  public String getName() {
    return (java.lang.String)this.getAttribute("imlb9i_q");
  }
  
  public void setName(final String Name) {
    this.setAttribute("imlb9i_q", Name);
  }
}
