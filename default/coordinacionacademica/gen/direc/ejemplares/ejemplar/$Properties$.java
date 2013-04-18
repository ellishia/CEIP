package direc.ejemplares.ejemplar;

import direc.ejemplares.Ejemplar;
import org.monet.bpi.Properties;
import org.monet.bpi.java.MappingImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class $Properties$ extends MappingImpl {
  public void calculateMapping() {
    this.calculate();
  }
  
  public Properties getProperties() {
    return (org.monet.bpi.Properties) this.genericGetReference();
  }
  
  public Ejemplar getNode() {
    return (direc.ejemplares.Ejemplar) this.genericGetNode();
  }
  
  private void calculate() {
    Ejemplar _node = this.getNode();
    Ejemplar _node_1 = this.getNode();
    String _codigo = _node_1.getCodigo();
    String _plus = (_codigo + " ");
    Ejemplar _node_2 = this.getNode();
    Term _libroAsTerm = _node_2.getLibroAsTerm();
    String _plus_1 = (_plus + _libroAsTerm);
    _node.setLabel(_plus_1);
  }
}
