package direc.intanceejemplar;

import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldNumber;
import org.monet.bpi.FieldSection;
import org.monet.bpi.java.FieldSectionImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Ejemplares extends FieldSectionImpl implements FieldSection {
  public FieldLink getLibroField() {
    return ((org.monet.bpi.FieldLink)this.getField("IntanceEjemplar", "Libro"));
  }
  
  public Link getLibro() {
    return ((org.monet.bpi.FieldLink)this.getField("IntanceEjemplar", "Libro")).get();
  }
  
  public Term getLibroAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("IntanceEjemplar", "Libro")).getAsTerm();
  }
  
  public void setLibro(final Link value) {
    this.getLibroField().set(value);
  }
  
  public FieldNumber getNumberField() {
    return ((org.monet.bpi.FieldNumber)this.getField("IntanceEjemplar", "Number"));
  }
  
  public org.monet.bpi.types.Number getNumber() {
    return ((org.monet.bpi.FieldNumber)this.getField("IntanceEjemplar", "Number")).get();
  }
  
  public void setNumber(final org.monet.bpi.types.Number value) {
    this.getNumberField().set(value);
  }
  
  public void setNumber(final double value) {
    this.getNumberField().set(new org.monet.bpi.types.Number(value));
  }
}
