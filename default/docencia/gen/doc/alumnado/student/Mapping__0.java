package doc.alumnado.student;

import doc.alumnado.Indice;
import doc.alumnado.Student;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    doc.alumnado.Student node = (doc.alumnado.Student) this.genericGetNode();
    doc.alumnado.Indice reference = (doc.alumnado.Indice) this.genericGetReference();
    reference.setName(node.getName());
    reference.setSurname(node.getSurname());
    reference.setCial(node.getCial());
    reference.setBirthDate(node.getBirthDate());
    
  }
  
  public Indice getReference() {
    return (doc.alumnado.Indice) this.genericGetReference();
  }
  
  public Student getNode() {
    return (doc.alumnado.Student) this.genericGetNode();
  }
}
