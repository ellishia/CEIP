package grades;

import org.monet.bpi.FieldSelect;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings(value = "all")
public class TeacherForm extends NodeFormImpl {
  public FieldSelect getTeacherNameField() {
    return ((org.monet.bpi.FieldSelect)this.getField("TeacherForm", "TeacherName"));
  }
  
  public Term getTeacherName() {
    return ((org.monet.bpi.FieldSelect)this.getField("TeacherForm", "TeacherName")).get();
  }
  
  public void setTeacherName(final Term value) {
    this.getTeacherNameField().set(value);
  }
  
  public FieldSelect getSubjectField() {
    return ((org.monet.bpi.FieldSelect)this.getField("TeacherForm", "Subject"));
  }
  
  public Term getSubject() {
    return ((org.monet.bpi.FieldSelect)this.getField("TeacherForm", "Subject")).get();
  }
  
  public void setSubject(final Term value) {
    this.getSubjectField().set(value);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static TeacherForm createNew(final Node parent) {
    return (grades.TeacherForm)org.monet.bpi.NodeService.create(grades.TeacherForm.class, parent);
  }
}
