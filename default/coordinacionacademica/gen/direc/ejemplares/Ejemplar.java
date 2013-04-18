package direc.ejemplares;

import direc.ejemplares.Indice;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldSerial;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Ejemplar extends NodeFormImpl {
  public FieldLink getLibroField() {
    return ((org.monet.bpi.FieldLink)this.getField("Ejemplar", "Libro"));
  }
  
  public Link getLibro() {
    return ((org.monet.bpi.FieldLink)this.getField("Ejemplar", "Libro")).get();
  }
  
  public Term getLibroAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("Ejemplar", "Libro")).getAsTerm();
  }
  
  public void setLibro(final Link value) {
    this.getLibroField().set(value);
  }
  
  public FieldSerial getCodigoField() {
    return ((org.monet.bpi.FieldSerial)this.getField("Ejemplar", "Codigo"));
  }
  
  public String getCodigo() {
    return ((org.monet.bpi.FieldSerial)this.getField("Ejemplar", "Codigo")).get();
  }
  
  public void setCodigo(final String value) {
    this.getCodigoField().set(value);
  }
  
  public FieldText getEstadoField() {
    return ((org.monet.bpi.FieldText)this.getField("Ejemplar", "Estado"));
  }
  
  public String getEstado() {
    return ((org.monet.bpi.FieldText)this.getField("Ejemplar", "Estado")).get();
  }
  
  public void setEstado(final String value) {
    this.getEstadoField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.ejemplares.Indice)this.getIndexEntry("direc.Ejemplares.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Ejemplar createNew(final Node parent) {
    return (direc.ejemplares.Ejemplar)org.monet.bpi.NodeService.create(direc.ejemplares.Ejemplar.class, parent);
  }
}
