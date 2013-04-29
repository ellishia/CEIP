package grades.controls.control;

import grades.continuosevaluation.Index;
import grades.controls.Control;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__1 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    grades.controls.Control node = (grades.controls.Control) this.genericGetNode();
    grades.continuosevaluation.Index reference = (grades.continuosevaluation.Index) this.genericGetReference();
    reference.setSubject(node.getSubject());
    reference.setTeacher(node.getTeacher());
    reference.setDate(node.getDate());
    
  }
  
  public Index getReference() {
    return (grades.continuosevaluation.Index) this.genericGetReference();
  }
  
  public Control getNode() {
    return (grades.controls.Control) this.genericGetNode();
  }
}
