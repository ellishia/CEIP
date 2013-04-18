package doc.subjectlevels;

import doc.subjectlevels.Indice;
import java.util.ArrayList;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldSerial;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class SubjectLevel extends NodeFormImpl {
  public FieldLink getAsignaturaField() {
    return ((org.monet.bpi.FieldLink)this.getField("SubjectLevel", "Asignatura"));
  }
  
  public Link getAsignatura() {
    return ((org.monet.bpi.FieldLink)this.getField("SubjectLevel", "Asignatura")).get();
  }
  
  public Term getAsignaturaAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("SubjectLevel", "Asignatura")).getAsTerm();
  }
  
  public void setAsignatura(final Link value) {
    this.getAsignaturaField().set(value);
  }
  
  public FieldSelect getGradeField() {
    return ((org.monet.bpi.FieldSelect)this.getField("SubjectLevel", "Grade"));
  }
  
  public Term getGrade() {
    return ((org.monet.bpi.FieldSelect)this.getField("SubjectLevel", "Grade")).get();
  }
  
  public void setGrade(final Term value) {
    this.getGradeField().set(value);
  }
  
  public FieldMultiple<FieldLink,Link> getExamsField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("SubjectLevel", "Exams"));
  }
  
  public ArrayList<Link> getExams() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("SubjectLevel", "Exams")).getAll();
  }
  
  public ArrayList<Term> getExamsAsTerm() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("SubjectLevel", "Exams")).getAllAsTerm();
  }
  
  public FieldSerial getIdentifierField() {
    return ((org.monet.bpi.FieldSerial)this.getField("SubjectLevel", "Identifier"));
  }
  
  public String getIdentifier() {
    return ((org.monet.bpi.FieldSerial)this.getField("SubjectLevel", "Identifier")).get();
  }
  
  public void setIdentifier(final String value) {
    this.getIdentifierField().set(value);
  }
  
  public Indice getIndice() {
    return (doc.subjectlevels.Indice)this.getIndexEntry("doc.SubjectLevels.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static SubjectLevel createNew(final Node parent) {
    return (doc.subjectlevels.SubjectLevel)org.monet.bpi.NodeService.create(doc.subjectlevels.SubjectLevel.class, parent);
  }
}
