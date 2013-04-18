package doc.subjectlevels;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param AsignaturaCompleta = new org.monet.bpi.Param("m03x2wq");
  
  public String getAsignaturaCompleta() {
    return (java.lang.String)this.getAttribute("m03x2wq");
  }
  
  public void setAsignaturaCompleta(final String AsignaturaCompleta) {
    this.setAttribute("m03x2wq", AsignaturaCompleta);
  }
  
  public final static Param Asignatura = new org.monet.bpi.Param("imkmgxew");
  
  public Link getAsignatura() {
    return (org.monet.bpi.types.Link)this.getAttribute("imkmgxew");
  }
  
  public void setAsignatura(final Link Asignatura) {
    this.setAttribute("imkmgxew", Asignatura);
  }
  
  public final static Param Grade = new org.monet.bpi.Param("m9kmlwq");
  
  public Term getGrade() {
    return (org.monet.bpi.types.Term)this.getAttribute("m9kmlwq");
  }
  
  public void setGrade(final Term Grade) {
    this.setAttribute("m9kmlwq", Grade);
  }
  
  public final static Param Identifier = new org.monet.bpi.Param("mlvkb3a");
  
  public String getIdentifier() {
    return (java.lang.String)this.getAttribute("mlvkb3a");
  }
  
  public void setIdentifier(final String Identifier) {
    this.setAttribute("mlvkb3a", Identifier);
  }
}
