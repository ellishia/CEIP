package doc.subjects.subject;

import doc.subjects.Subject;
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
  
  public Subject getNode() {
    return (doc.subjects.Subject) this.genericGetNode();
  }
  
  private void calculate() {
    Subject _node = this.getNode();
    Subject _node_1 = this.getNode();
    String _name = _node_1.getName();
    _node.setLabel(_name);
  }
}
