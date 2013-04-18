package direc.ejemplares;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Libro = new org.monet.bpi.Param("mhetbgq");
  
  public Term getLibro() {
    return (org.monet.bpi.types.Term)this.getAttribute("mhetbgq");
  }
  
  public void setLibro(final Term Libro) {
    this.setAttribute("mhetbgq", Libro);
  }
  
  public final static Param Estado = new org.monet.bpi.Param("mrui52w");
  
  public String getEstado() {
    return (java.lang.String)this.getAttribute("mrui52w");
  }
  
  public void setEstado(final String Estado) {
    this.setAttribute("mrui52w", Estado);
  }
  
  public final static Param Codigo = new org.monet.bpi.Param("mp_wqqg");
  
  public Term getCodigo() {
    return (org.monet.bpi.types.Term)this.getAttribute("mp_wqqg");
  }
  
  public void setCodigo(final Term Codigo) {
    this.setAttribute("mp_wqqg", Codigo);
  }
}
