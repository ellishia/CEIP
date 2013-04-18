package doc.alumnado.student;

import doc.alumnado.Student;
import org.monet.bpi.Properties;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class $Properties$ extends MappingImpl {
  public void calculateMapping() {
    this.calculate();
  }
  
  public Properties getProperties() {
    return (org.monet.bpi.Properties) this.genericGetReference();
  }
  
  public Student getNode() {
    return (doc.alumnado.Student) this.genericGetNode();
  }
  
  private void calculate() {
    Student _node = this.getNode();
    String _name = _node.getName();
    String _plus = (_name + " ");
    Student _node_1 = this.getNode();
    String _surname = _node_1.getSurname();
    String nombreCompleto = (_plus + _surname);
    Student _node_2 = this.getNode();
    _node_2.setLabel(nombreCompleto);
  }
}
