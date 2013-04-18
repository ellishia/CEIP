package ceip.applications;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Identifier = new org.monet.bpi.Param("imzjznhq");
  
  public String getIdentifier() {
    return (java.lang.String)this.getAttribute("imzjznhq");
  }
  
  public void setIdentifier(final String Identifier) {
    this.setAttribute("imzjznhq", Identifier);
  }
  
  public final static Param StudentName = new org.monet.bpi.Param("mmqilaa");
  
  public String getStudentName() {
    return (java.lang.String)this.getAttribute("mmqilaa");
  }
  
  public void setStudentName(final String StudentName) {
    this.setAttribute("mmqilaa", StudentName);
  }
  
  public final static Param StudentSurname = new org.monet.bpi.Param("m7njy2q");
  
  public String getStudentSurname() {
    return (java.lang.String)this.getAttribute("m7njy2q");
  }
  
  public void setStudentSurname(final String StudentSurname) {
    this.setAttribute("m7njy2q", StudentSurname);
  }
  
  public final static Param Level = new org.monet.bpi.Param("mh7c5cq");
  
  public Term getLevel() {
    return (org.monet.bpi.types.Term)this.getAttribute("mh7c5cq");
  }
  
  public void setLevel(final Term Level) {
    this.setAttribute("mh7c5cq", Level);
  }
}
