package grades.controls;

import grades.continuosevaluation.Index;
import grades.controls.Indice;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Control extends NodeFormImpl {
  public FieldMultiple<FieldSection,Void> getDiaryControlField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSection, java.lang.Void>)this.getField("Control", "DiaryControl"));
  }
  
  public FieldSelect getSubjectField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Control", "Subject"));
  }
  
  public Term getSubject() {
    return ((org.monet.bpi.FieldSelect)this.getField("Control", "Subject")).get();
  }
  
  public void setSubject(final Term value) {
    this.getSubjectField().set(value);
  }
  
  public FieldSelect getAcademicGradeField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Control", "AcademicGrade"));
  }
  
  public Term getAcademicGrade() {
    return ((org.monet.bpi.FieldSelect)this.getField("Control", "AcademicGrade")).get();
  }
  
  public void setAcademicGrade(final Term value) {
    this.getAcademicGradeField().set(value);
  }
  
  public FieldSelect getTeacherField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Control", "Teacher"));
  }
  
  public Term getTeacher() {
    return ((org.monet.bpi.FieldSelect)this.getField("Control", "Teacher")).get();
  }
  
  public void setTeacher(final Term value) {
    this.getTeacherField().set(value);
  }
  
  public FieldDate getDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("Control", "Date"));
  }
  
  public Date getDate() {
    return ((org.monet.bpi.FieldDate)this.getField("Control", "Date")).get();
  }
  
  public void setDate(final Date value) {
    this.getDateField().set(value);
  }
  
  public Indice getIndice() {
    return (grades.controls.Indice)this.getIndexEntry("grades.Controls.Indice");
  }
  
  public Index getIndex() {
    return (grades.continuosevaluation.Index)this.getIndexEntry("grades.ContinuosEvaluation.Index");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Control createNew(final Node parent) {
    return (grades.controls.Control)org.monet.bpi.NodeService.create(grades.controls.Control.class, parent);
  }
}
