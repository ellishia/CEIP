package ceip.applications.application;

import ceip.applications.Application;
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
  
  public Application getNode() {
    return (ceip.applications.Application) this.genericGetNode();
  }
  
  private void calculate() {
    Application _node = this.getNode();
    String nombreCompleto = _node.getStudentName();
    String _plus = (nombreCompleto + " ");
    Application _node_1 = this.getNode();
    String _studentSurname = _node_1.getStudentSurname();
    String _plus_1 = (_plus + _studentSurname);
    nombreCompleto = _plus_1;
    Application _node_2 = this.getNode();
    Application _node_3 = this.getNode();
    String _identifier = _node_3.getIdentifier();
    String _plus_2 = (_identifier + " ");
    String _plus_3 = (_plus_2 + nombreCompleto);
    _node_2.setLabel(_plus_3);
  }
}
