package grades.controls.control;

import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldNumber;
import org.monet.bpi.FieldSection;
import org.monet.bpi.java.FieldSectionImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class DiaryControl extends FieldSectionImpl implements FieldSection {
  public FieldNumber getGradeField() {
    return ((org.monet.bpi.FieldNumber)this.getField("Control", "Grade"));
  }
  
  public org.monet.bpi.types.Number getGrade() {
    return ((org.monet.bpi.FieldNumber)this.getField("Control", "Grade")).get();
  }
  
  public void setGrade(final org.monet.bpi.types.Number value) {
    this.getGradeField().set(value);
  }
  
  public void setGrade(final double value) {
    this.getGradeField().set(new org.monet.bpi.types.Number(value));
  }
  
  public FieldLink getStudentField() {
    return ((org.monet.bpi.FieldLink)this.getField("Control", "Student"));
  }
  
  public Link getStudent() {
    return ((org.monet.bpi.FieldLink)this.getField("Control", "Student")).get();
  }
  
  public Term getStudentAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("Control", "Student")).getAsTerm();
  }
  
  public void setStudent(final Link value) {
    this.getStudentField().set(value);
  }
}
