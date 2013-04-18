package grades;

import grades.trimestralevaluations.Indice;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Term;

@SuppressWarnings(value = "all")
public class EvaluationForm extends NodeFormImpl {
  public FieldSelect getGroupField() {
    return ((org.monet.bpi.FieldSelect)this.getField("EvaluationForm", "Group"));
  }
  
  public Term getGroup() {
    return ((org.monet.bpi.FieldSelect)this.getField("EvaluationForm", "Group")).get();
  }
  
  public void setGroup(final Term value) {
    this.getGroupField().set(value);
  }
  
  public FieldSelect getTutorField() {
    return ((org.monet.bpi.FieldSelect)this.getField("EvaluationForm", "Tutor"));
  }
  
  public Term getTutor() {
    return ((org.monet.bpi.FieldSelect)this.getField("EvaluationForm", "Tutor")).get();
  }
  
  public void setTutor(final Term value) {
    this.getTutorField().set(value);
  }
  
  public FieldDate getDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("EvaluationForm", "Date"));
  }
  
  public Date getDate() {
    return ((org.monet.bpi.FieldDate)this.getField("EvaluationForm", "Date")).get();
  }
  
  public void setDate(final Date value) {
    this.getDateField().set(value);
  }
  
  public FieldSelect getAcademicYearField() {
    return ((org.monet.bpi.FieldSelect)this.getField("EvaluationForm", "AcademicYear"));
  }
  
  public Term getAcademicYear() {
    return ((org.monet.bpi.FieldSelect)this.getField("EvaluationForm", "AcademicYear")).get();
  }
  
  public void setAcademicYear(final Term value) {
    this.getAcademicYearField().set(value);
  }
  
  public FieldSelect getTrimesterField() {
    return ((org.monet.bpi.FieldSelect)this.getField("EvaluationForm", "Trimester"));
  }
  
  public Term getTrimester() {
    return ((org.monet.bpi.FieldSelect)this.getField("EvaluationForm", "Trimester")).get();
  }
  
  public void setTrimester(final Term value) {
    this.getTrimesterField().set(value);
  }
  
  public Indice getIndice() {
    return (grades.trimestralevaluations.Indice)this.getIndexEntry("grades.TrimestralEvaluations.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static EvaluationForm createNew(final Node parent) {
    return (grades.EvaluationForm)org.monet.bpi.NodeService.create(grades.EvaluationForm.class, parent);
  }
}
