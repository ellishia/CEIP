package ceip.studentdatas;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Nombre = new org.monet.bpi.Param("immwwqgq");
  
  public String getNombre() {
    return (java.lang.String)this.getAttribute("immwwqgq");
  }
  
  public void setNombre(final String Nombre) {
    this.setAttribute("immwwqgq", Nombre);
  }
}
