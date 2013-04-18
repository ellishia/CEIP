package doc.exams;

import doc.exams.Indice;
import java.util.ArrayList;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class ExamForm extends NodeFormImpl {
  public FieldText getTitleField() {
    return ((org.monet.bpi.FieldText)this.getField("ExamForm", "Title"));
  }
  
  public String getTitle() {
    return ((org.monet.bpi.FieldText)this.getField("ExamForm", "Title")).get();
  }
  
  public void setTitle(final String value) {
    this.getTitleField().set(value);
  }
  
  public FieldSelect getAreaField() {
    return ((org.monet.bpi.FieldSelect)this.getField("ExamForm", "Area"));
  }
  
  public Term getArea() {
    return ((org.monet.bpi.FieldSelect)this.getField("ExamForm", "Area")).get();
  }
  
  public void setArea(final Term value) {
    this.getAreaField().set(value);
  }
  
  public FieldSelect getGradeField() {
    return ((org.monet.bpi.FieldSelect)this.getField("ExamForm", "Grade"));
  }
  
  public Term getGrade() {
    return ((org.monet.bpi.FieldSelect)this.getField("ExamForm", "Grade")).get();
  }
  
  public void setGrade(final Term value) {
    this.getGradeField().set(value);
  }
  
  public FieldSelect getLevelField() {
    return ((org.monet.bpi.FieldSelect)this.getField("ExamForm", "Level"));
  }
  
  public Term getLevel() {
    return ((org.monet.bpi.FieldSelect)this.getField("ExamForm", "Level")).get();
  }
  
  public void setLevel(final Term value) {
    this.getLevelField().set(value);
  }
  
  public FieldMultiple<FieldText,String> getQuestionsField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldText, java.lang.String>)this.getField("ExamForm", "Questions"));
  }
  
  public ArrayList<String> getQuestions() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldText, java.lang.String>)this.getField("ExamForm", "Questions")).getAll();
  }
  
  public FieldText getInstructionsField() {
    return ((org.monet.bpi.FieldText)this.getField("ExamForm", "Instructions"));
  }
  
  public String getInstructions() {
    return ((org.monet.bpi.FieldText)this.getField("ExamForm", "Instructions")).get();
  }
  
  public void setInstructions(final String value) {
    this.getInstructionsField().set(value);
  }
  
  public Indice getIndice() {
    return (doc.exams.Indice)this.getIndexEntry("doc.Exams.Indice");
  }
  
  public void onExamDoc() {
    
  }
  
  public void executeCommand(final String operation) {
    if(operation.equals("ExamDoc")) {
    	this.onExamDoc();
    }super.executeCommand(operation);
  }
  
  public static ExamForm createNew(final Node parent) {
    return (doc.exams.ExamForm)org.monet.bpi.NodeService.create(doc.exams.ExamForm.class, parent);
  }
}
