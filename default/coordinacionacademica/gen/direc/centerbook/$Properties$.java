package direc.centerbook;

import direc.CenterBook;
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
  
  public CenterBook getNode() {
    return (direc.CenterBook) this.genericGetNode();
  }
  
  private void calculate() {
    CenterBook _node = this.getNode();
    String _title = _node.getTitle();
    String _plus = (_title + " ");
    CenterBook _node_1 = this.getNode();
    String _editorial = _node_1.getEditorial();
    String valor = (_plus + _editorial);
    CenterBook _node_2 = this.getNode();
    _node_2.setLabel(valor);
  }
}
