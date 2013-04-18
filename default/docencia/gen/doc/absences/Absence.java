package doc.absences;

import doc.absences.Indice;
import java.util.ArrayList;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldFile;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.File;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Absence extends NodeFormImpl {
  public FieldDate getDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("Absence", "Date"));
  }
  
  public Date getDate() {
    return ((org.monet.bpi.FieldDate)this.getField("Absence", "Date")).get();
  }
  
  public void setDate(final Date value) {
    this.getDateField().set(value);
  }
  
  public FieldMultiple<FieldText,String> getHourField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldText, java.lang.String>)this.getField("Absence", "Hour"));
  }
  
  public ArrayList<String> getHour() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldText, java.lang.String>)this.getField("Absence", "Hour")).getAll();
  }
  
  public FieldMultiple<FieldSelect,Term> getAreasField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSelect, org.monet.bpi.types.Term>)this.getField("Absence", "Areas"));
  }
  
  public ArrayList<Term> getAreas() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSelect, org.monet.bpi.types.Term>)this.getField("Absence", "Areas")).getAll();
  }
  
  public FieldLink getStudentField() {
    return ((org.monet.bpi.FieldLink)this.getField("Absence", "Student"));
  }
  
  public Link getStudent() {
    return ((org.monet.bpi.FieldLink)this.getField("Absence", "Student")).get();
  }
  
  public Term getStudentAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("Absence", "Student")).getAsTerm();
  }
  
  public void setStudent(final Link value) {
    this.getStudentField().set(value);
  }
  
  public FieldFile getJustificanteField() {
    return ((org.monet.bpi.FieldFile)this.getField("Absence", "Justificante"));
  }
  
  public File getJustificante() {
    return ((org.monet.bpi.FieldFile)this.getField("Absence", "Justificante")).get();
  }
  
  public void setJustificante(final File value) {
    this.getJustificanteField().set(value);
  }
  
  public Indice getIndice() {
    return (doc.absences.Indice)this.getIndexEntry("doc.Absences.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Absence createNew(final Node parent) {
    return (doc.absences.Absence)org.monet.bpi.NodeService.create(doc.absences.Absence.class, parent);
  }
}
