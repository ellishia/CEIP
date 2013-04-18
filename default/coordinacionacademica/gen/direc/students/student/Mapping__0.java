package direc.students.student;

import direc.students.Index;
import direc.students.Student;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.students.Student node = (direc.students.Student) this.genericGetNode();
    direc.students.Index reference = (direc.students.Index) this.genericGetReference();
    reference.setName(node.getName());
    reference.setSurname(node.getSurname());
    reference.setLevel(node.getLevel());
    reference.setCial(node.getCial());
    
  }
  
  public Index getReference() {
    return (direc.students.Index) this.genericGetReference();
  }
  
  public Student getNode() {
    return (direc.students.Student) this.genericGetNode();
  }
}
