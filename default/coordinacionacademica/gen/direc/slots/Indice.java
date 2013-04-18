package direc.slots;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Nombre = new org.monet.bpi.Param("ime33kpa");
  
  public String getNombre() {
    return (java.lang.String)this.getAttribute("ime33kpa");
  }
  
  public void setNombre(final String Nombre) {
    this.setAttribute("ime33kpa", Nombre);
  }
}
