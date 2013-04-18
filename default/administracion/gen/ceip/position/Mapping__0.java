package ceip.position;

import ceip.Position;
import ceip.availablepositions.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    ceip.Position node = (ceip.Position) this.genericGetNode();
    ceip.availablepositions.Indice reference = (ceip.availablepositions.Indice) this.genericGetReference();
    
  }
  
  public Indice getReference() {
    return (ceip.availablepositions.Indice) this.genericGetReference();
  }
  
  public Position getNode() {
    return (ceip.Position) this.genericGetNode();
  }
}
