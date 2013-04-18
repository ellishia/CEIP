package grades.examresults;

import grades.continuosevaluation.Index;
import grades.examresults.Indice;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldNumber;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings(value = "all")
public class ExamResult extends NodeFormImpl {
  public FieldLink getStudentField() {
    return ((org.monet.bpi.FieldLink)this.getField("ExamResult", "Student"));
  }
  
  public Link getStudent() {
    return ((org.monet.bpi.FieldLink)this.getField("ExamResult", "Student")).get();
  }
  
  public Term getStudentAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("ExamResult", "Student")).getAsTerm();
  }
  
  public void setStudent(final Link value) {
    this.getStudentField().set(value);
  }
  
  public FieldSelect getAcademicGradeField() {
    return ((org.monet.bpi.FieldSelect)this.getField("ExamResult", "AcademicGrade"));
  }
  
  public Term getAcademicGrade() {
    return ((org.monet.bpi.FieldSelect)this.getField("ExamResult", "AcademicGrade")).get();
  }
  
  public void setAcademicGrade(final Term value) {
    this.getAcademicGradeField().set(value);
  }
  
  public FieldSelect getSubjectField() {
    return ((org.monet.bpi.FieldSelect)this.getField("ExamResult", "Subject"));
  }
  
  public Term getSubject() {
    return ((org.monet.bpi.FieldSelect)this.getField("ExamResult", "Subject")).get();
  }
  
  public void setSubject(final Term value) {
    this.getSubjectField().set(value);
  }
  
  public FieldSelect getTeacherField() {
    return ((org.monet.bpi.FieldSelect)this.getField("ExamResult", "Teacher"));
  }
  
  public Term getTeacher() {
    return ((org.monet.bpi.FieldSelect)this.getField("ExamResult", "Teacher")).get();
  }
  
  public void setTeacher(final Term value) {
    this.getTeacherField().set(value);
  }
  
  public FieldText getExamField() {
    return ((org.monet.bpi.FieldText)this.getField("ExamResult", "Exam"));
  }
  
  public String getExam() {
    return ((org.monet.bpi.FieldText)this.getField("ExamResult", "Exam")).get();
  }
  
  public void setExam(final String value) {
    this.getExamField().set(value);
  }
  
  public FieldNumber getCalificationField() {
    return ((org.monet.bpi.FieldNumber)this.getField("ExamResult", "Calification"));
  }
  
  public org.monet.bpi.types.Number getCalification() {
    return ((org.monet.bpi.FieldNumber)this.getField("ExamResult", "Calification")).get();
  }
  
  public void setCalification(final org.monet.bpi.types.Number value) {
    this.getCalificationField().set(value);
  }
  
  public void setCalification(final double value) {
    this.getCalificationField().set(new org.monet.bpi.types.Number(value));
  }
  
  public FieldDate getDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("ExamResult", "Date"));
  }
  
  public Date getDate() {
    return ((org.monet.bpi.FieldDate)this.getField("ExamResult", "Date")).get();
  }
  
  public void setDate(final Date value) {
    this.getDateField().set(value);
  }
  
  public FieldText getMistakesField() {
    return ((org.monet.bpi.FieldText)this.getField("ExamResult", "Mistakes"));
  }
  
  public String getMistakes() {
    return ((org.monet.bpi.FieldText)this.getField("ExamResult", "Mistakes")).get();
  }
  
  public void setMistakes(final String value) {
    this.getMistakesField().set(value);
  }
  
  public FieldText getCorrectionsField() {
    return ((org.monet.bpi.FieldText)this.getField("ExamResult", "Corrections"));
  }
  
  public String getCorrections() {
    return ((org.monet.bpi.FieldText)this.getField("ExamResult", "Corrections")).get();
  }
  
  public void setCorrections(final String value) {
    this.getCorrectionsField().set(value);
  }
  
  public FieldText getObservationsField() {
    return ((org.monet.bpi.FieldText)this.getField("ExamResult", "Observations"));
  }
  
  public String getObservations() {
    return ((org.monet.bpi.FieldText)this.getField("ExamResult", "Observations")).get();
  }
  
  public void setObservations(final String value) {
    this.getObservationsField().set(value);
  }
  
  public Indice getIndice() {
    return (grades.examresults.Indice)this.getIndexEntry("grades.ExamResults.Indice");
  }
  
  public Index getIndex() {
    return (grades.continuosevaluation.Index)this.getIndexEntry("grades.ContinuosEvaluation.Index");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static ExamResult createNew(final Node parent) {
    return (grades.examresults.ExamResult)org.monet.bpi.NodeService.create(grades.examresults.ExamResult.class, parent);
  }
}
