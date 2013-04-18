package grades.controls.control;

import grades.controls.Control;
import grades.controls.Indice;
import org.monet.bpi.java.MappingImpl;

public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    grades.controls.Control node = (grades.controls.Control) this.genericGetNode();
    grades.controls.Indice reference = (grades.controls.Indice) this.genericGetReference();
    reference.setSubject(node.getSubject());
    reference.setTeacher(node.getTeacher());
    reference.setDate(node.getDate());
    
  }
  
  public Indice getReference() {
    return (grades.controls.Indice) this.genericGetReference();
  }
  
  public Control getNode() {
    return (grades.controls.Control) this.genericGetNode();
  }
}
