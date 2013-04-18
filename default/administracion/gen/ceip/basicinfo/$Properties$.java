package ceip.basicinfo;

import ceip.BasicInfo;
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
  
  public BasicInfo getNode() {
    return (ceip.BasicInfo) this.genericGetNode();
  }
  
  private void calculate() {
    BasicInfo _node = this.getNode();
    String nombreCompleto = _node.getName();
    String _plus = (nombreCompleto + " ");
    BasicInfo _node_1 = this.getNode();
    String _surname = _node_1.getSurname();
    String _plus_1 = (_plus + _surname);
    nombreCompleto = _plus_1;
    BasicInfo _node_2 = this.getNode();
    _node_2.setLabel(nombreCompleto);
  }
}
