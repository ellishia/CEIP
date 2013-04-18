package grades.students.student;

import grades.students.Index;
import grades.students.Student;
import org.monet.bpi.java.MappingImpl;

public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    grades.students.Student node = (grades.students.Student) this.genericGetNode();
    grades.students.Index reference = (grades.students.Index) this.genericGetReference();
    reference.setNombre(node.getNombre());
    reference.setSurname(node.getSurname());
    
  }
  
  public Index getReference() {
    return (grades.students.Index) this.genericGetReference();
  }
  
  public Student getNode() {
    return (grades.students.Student) this.genericGetNode();
  }
}
