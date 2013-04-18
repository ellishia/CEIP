package grades.califications;

import grades.califications.Indice;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings(value = "all")
public class Calification extends NodeFormImpl {
  public FieldSelect getAcademicYearField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Calification", "AcademicYear"));
  }
  
  public Term getAcademicYear() {
    return ((org.monet.bpi.FieldSelect)this.getField("Calification", "AcademicYear")).get();
  }
  
  public void setAcademicYear(final Term value) {
    this.getAcademicYearField().set(value);
  }
  
  public FieldSelect getSubjectField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Calification", "Subject"));
  }
  
  public Term getSubject() {
    return ((org.monet.bpi.FieldSelect)this.getField("Calification", "Subject")).get();
  }
  
  public void setSubject(final Term value) {
    this.getSubjectField().set(value);
  }
  
  public FieldSelect getTrimesterField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Calification", "Trimester"));
  }
  
  public Term getTrimester() {
    return ((org.monet.bpi.FieldSelect)this.getField("Calification", "Trimester")).get();
  }
  
  public void setTrimester(final Term value) {
    this.getTrimesterField().set(value);
  }
  
  public FieldText getGradeField() {
    return ((org.monet.bpi.FieldText)this.getField("Calification", "Grade"));
  }
  
  public String getGrade() {
    return ((org.monet.bpi.FieldText)this.getField("Calification", "Grade")).get();
  }
  
  public void setGrade(final String value) {
    this.getGradeField().set(value);
  }
  
  public FieldLink getStudentField() {
    return ((org.monet.bpi.FieldLink)this.getField("Calification", "Student"));
  }
  
  public Link getStudent() {
    return ((org.monet.bpi.FieldLink)this.getField("Calification", "Student")).get();
  }
  
  public Term getStudentAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("Calification", "Student")).getAsTerm();
  }
  
  public void setStudent(final Link value) {
    this.getStudentField().set(value);
  }
  
  public Indice getIndice() {
    return (grades.califications.Indice)this.getIndexEntry("grades.Califications.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Calification createNew(final Node parent) {
    return (grades.califications.Calification)org.monet.bpi.NodeService.create(grades.califications.Calification.class, parent);
  }
}
