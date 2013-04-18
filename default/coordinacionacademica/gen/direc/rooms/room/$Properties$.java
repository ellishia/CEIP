package direc.rooms.room;

import com.google.common.base.Objects;
import direc.rooms.Room;
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
  
  public Room getNode() {
    return (direc.rooms.Room) this.genericGetNode();
  }
  
  private void calculate() {
    Room _node = this.getNode();
    String _nombre = _node.getNombre();
    boolean _notEquals = (!Objects.equal(_nombre, null));
    if (_notEquals) {
      Room _node_1 = this.getNode();
      Room _node_2 = this.getNode();
      String _nombre_1 = _node_2.getNombre();
      _node_1.setLabel(_nombre_1);
    } else {
      Room _node_3 = this.getNode();
      _node_3.setLabel("Aula sin nombre");
    }
  }
}
