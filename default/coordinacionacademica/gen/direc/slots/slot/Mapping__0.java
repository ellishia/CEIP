package direc.slots.slot;

import direc.slots.Indice;
import direc.slots.Slot;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.slots.Slot node = (direc.slots.Slot) this.genericGetNode();
    direc.slots.Indice reference = (direc.slots.Indice) this.genericGetReference();
    
  }
  
  public Indice getReference() {
    return (direc.slots.Indice) this.genericGetReference();
  }
  
  public Slot getNode() {
    return (direc.slots.Slot) this.genericGetNode();
  }
}
