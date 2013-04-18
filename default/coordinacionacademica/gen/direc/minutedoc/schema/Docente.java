package direc.minutedoc.schema;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "docente", strict = false)
@SuppressWarnings("all")
public class Docente {
  @Element(name = "Docente", required = false)
  private String Docente;
  
  public String getDocente() {
    return this.Docente;
  }
  
  public void setDocente(final String Docente) {
    this.Docente = Docente;
  }
  
  @Element(name = "Subject", required = false)
  private String Subject;
  
  public String getSubject() {
    return this.Subject;
  }
  
  public void setSubject(final String Subject) {
    this.Subject = Subject;
  }
}
