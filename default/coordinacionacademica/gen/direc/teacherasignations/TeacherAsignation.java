package direc.teacherasignations;

import direc.teacherasignations.Indice;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldLink;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class TeacherAsignation extends NodeFormImpl {
  public FieldDate getFromField() {
    return ((org.monet.bpi.FieldDate)this.getField("TeacherAsignation", "From"));
  }
  
  public Date getFrom() {
    return ((org.monet.bpi.FieldDate)this.getField("TeacherAsignation", "From")).get();
  }
  
  public void setFrom(final Date value) {
    this.getFromField().set(value);
  }
  
  public FieldDate getToField() {
    return ((org.monet.bpi.FieldDate)this.getField("TeacherAsignation", "To"));
  }
  
  public Date getTo() {
    return ((org.monet.bpi.FieldDate)this.getField("TeacherAsignation", "To")).get();
  }
  
  public void setTo(final Date value) {
    this.getToField().set(value);
  }
  
  public FieldLink getTeacherField() {
    return ((org.monet.bpi.FieldLink)this.getField("TeacherAsignation", "Teacher"));
  }
  
  public Link getTeacher() {
    return ((org.monet.bpi.FieldLink)this.getField("TeacherAsignation", "Teacher")).get();
  }
  
  public Term getTeacherAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("TeacherAsignation", "Teacher")).getAsTerm();
  }
  
  public void setTeacher(final Link value) {
    this.getTeacherField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.teacherasignations.Indice)this.getIndexEntry("direc.TeacherAsignations.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static TeacherAsignation createNew(final Node parent) {
    return (direc.teacherasignations.TeacherAsignation)org.monet.bpi.NodeService.create(direc.teacherasignations.TeacherAsignation.class, parent);
  }
}
