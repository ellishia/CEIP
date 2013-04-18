package ceip.boletin.schema;

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
  
  @Element(name = "PrimerTrim", required = false)
  private String PrimerTrim;
  
  public String getPrimerTrim() {
    return this.PrimerTrim;
  }
  
  public void setPrimerTrim(final String PrimerTrim) {
    this.PrimerTrim = PrimerTrim;
  }
  
  @Element(name = "SegundoTrim", required = false)
  private String SegundoTrim;
  
  public String getSegundoTrim() {
    return this.SegundoTrim;
  }
  
  public void setSegundoTrim(final String SegundoTrim) {
    this.SegundoTrim = SegundoTrim;
  }
  
  @Element(name = "TercerTrim", required = false)
  private String TercerTrim;
  
  public String getTercerTrim() {
    return this.TercerTrim;
  }
  
  public void setTercerTrim(final String TercerTrim) {
    this.TercerTrim = TercerTrim;
  }
  
  @Element(name = "Global", required = false)
  private String Global;
  
  public String getGlobal() {
    return this.Global;
  }
  
  public void setGlobal(final String Global) {
    this.Global = Global;
  }
}
