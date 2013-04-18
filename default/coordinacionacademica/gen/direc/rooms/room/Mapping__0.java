package direc.rooms.room;

import direc.rooms.Indice;
import direc.rooms.Room;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.rooms.Room node = (direc.rooms.Room) this.genericGetNode();
    direc.rooms.Indice reference = (direc.rooms.Indice) this.genericGetReference();
    reference.setNombre(node.getNombre());
    reference.setPlacement(node.getPlacement());
    reference.setCapacity(node.getCapacity());
    
  }
  
  public Indice getReference() {
    return (direc.rooms.Indice) this.genericGetReference();
  }
  
  public Room getNode() {
    return (direc.rooms.Room) this.genericGetNode();
  }
}
