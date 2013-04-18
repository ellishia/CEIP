package direc.rooms;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Nombre = new org.monet.bpi.Param("imvd8exq");
  
  public String getNombre() {
    return (java.lang.String)this.getAttribute("imvd8exq");
  }
  
  public void setNombre(final String Nombre) {
    this.setAttribute("imvd8exq", Nombre);
  }
  
  public final static Param Capacity = new org.monet.bpi.Param("mhcwfyq");
  
  public org.monet.bpi.types.Number getCapacity() {
    return (org.monet.bpi.types.Number)this.getAttribute("mhcwfyq");
  }
  
  public void setCapacity(final org.monet.bpi.types.Number Capacity) {
    this.setAttribute("mhcwfyq", Capacity);
  }
  
  public final static Param Placement = new org.monet.bpi.Param("mtc7pwq");
  
  public String getPlacement() {
    return (java.lang.String)this.getAttribute("mtc7pwq");
  }
  
  public void setPlacement(final String Placement) {
    this.setAttribute("mtc7pwq", Placement);
  }
}
