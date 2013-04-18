package direc.teachers.teacher;

import direc.teachers.Indice;
import direc.teachers.Teacher;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.teachers.Teacher node = (direc.teachers.Teacher) this.genericGetNode();
    direc.teachers.Indice reference = (direc.teachers.Indice) this.genericGetReference();
    reference.setName(node.getName());
    reference.setSurname(node.getSurname());
    reference.setIdentifier(node.getIdentifier());
    
  }
  
  public Indice getReference() {
    return (direc.teachers.Indice) this.genericGetReference();
  }
  
  public Teacher getNode() {
    return (direc.teachers.Teacher) this.genericGetNode();
  }
}
