package doc.parentvisits;

import doc.parentvisits.Indice;
import java.util.ArrayList;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldSerial;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class ParentVisit extends NodeFormImpl {
  public FieldSerial getIdentifierField() {
    return ((org.monet.bpi.FieldSerial)this.getField("ParentVisit", "Identifier"));
  }
  
  public String getIdentifier() {
    return ((org.monet.bpi.FieldSerial)this.getField("ParentVisit", "Identifier")).get();
  }
  
  public void setIdentifier(final String value) {
    this.getIdentifierField().set(value);
  }
  
  public FieldText getTitleField() {
    return ((org.monet.bpi.FieldText)this.getField("ParentVisit", "Title"));
  }
  
  public String getTitle() {
    return ((org.monet.bpi.FieldText)this.getField("ParentVisit", "Title")).get();
  }
  
  public void setTitle(final String value) {
    this.getTitleField().set(value);
  }
  
  public FieldDate getDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("ParentVisit", "Date"));
  }
  
  public Date getDate() {
    return ((org.monet.bpi.FieldDate)this.getField("ParentVisit", "Date")).get();
  }
  
  public void setDate(final Date value) {
    this.getDateField().set(value);
  }
  
  public FieldMultiple<FieldSelect,Term> getAreasField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSelect, org.monet.bpi.types.Term>)this.getField("ParentVisit", "Areas"));
  }
  
  public ArrayList<Term> getAreas() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSelect, org.monet.bpi.types.Term>)this.getField("ParentVisit", "Areas")).getAll();
  }
  
  public FieldLink getStudentField() {
    return ((org.monet.bpi.FieldLink)this.getField("ParentVisit", "Student"));
  }
  
  public Link getStudent() {
    return ((org.monet.bpi.FieldLink)this.getField("ParentVisit", "Student")).get();
  }
  
  public Term getStudentAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("ParentVisit", "Student")).getAsTerm();
  }
  
  public void setStudent(final Link value) {
    this.getStudentField().set(value);
  }
  
  public FieldMultiple<FieldSelect,Term> getTeacherField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSelect, org.monet.bpi.types.Term>)this.getField("ParentVisit", "Teacher"));
  }
  
  public ArrayList<Term> getTeacher() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSelect, org.monet.bpi.types.Term>)this.getField("ParentVisit", "Teacher")).getAll();
  }
  
  public FieldText getTopicsField() {
    return ((org.monet.bpi.FieldText)this.getField("ParentVisit", "Topics"));
  }
  
  public String getTopics() {
    return ((org.monet.bpi.FieldText)this.getField("ParentVisit", "Topics")).get();
  }
  
  public void setTopics(final String value) {
    this.getTopicsField().set(value);
  }
  
  public FieldText getObservationsField() {
    return ((org.monet.bpi.FieldText)this.getField("ParentVisit", "Observations"));
  }
  
  public String getObservations() {
    return ((org.monet.bpi.FieldText)this.getField("ParentVisit", "Observations")).get();
  }
  
  public void setObservations(final String value) {
    this.getObservationsField().set(value);
  }
  
  public Indice getIndice() {
    return (doc.parentvisits.Indice)this.getIndexEntry("doc.ParentVisits.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static ParentVisit createNew(final Node parent) {
    return (doc.parentvisits.ParentVisit)org.monet.bpi.NodeService.create(doc.parentvisits.ParentVisit.class, parent);
  }
}
