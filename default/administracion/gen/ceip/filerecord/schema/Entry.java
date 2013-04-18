package ceip.filerecord.schema;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "entry", strict = false)
@SuppressWarnings("all")
public class Entry {
  @Element(name = "Subject", required = false)
  private String Subject;
  
  public String getSubject() {
    return this.Subject;
  }
  
  public void setSubject(final String Subject) {
    this.Subject = Subject;
  }
  
  @Element(name = "Ciclo", required = false)
  private org.monet.bpi.types.Number Ciclo;
  
  public org.monet.bpi.types.Number getCiclo() {
    return this.Ciclo;
  }
  
  public void setCiclo(final org.monet.bpi.types.Number Ciclo) {
    this.Ciclo = Ciclo;
  }
  
  @Element(name = "NotaCiclo", required = false)
  private org.monet.bpi.types.Number NotaCiclo;
  
  public org.monet.bpi.types.Number getNotaCiclo() {
    return this.NotaCiclo;
  }
  
  public void setNotaCiclo(final org.monet.bpi.types.Number NotaCiclo) {
    this.NotaCiclo = NotaCiclo;
  }
}
