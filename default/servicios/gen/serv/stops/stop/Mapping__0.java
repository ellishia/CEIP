package serv.stops.stop;

import org.monet.bpi.java.MappingImpl;
import serv.stops.Indice;
import serv.stops.Stop;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    serv.stops.Stop node = (serv.stops.Stop) this.genericGetNode();
    serv.stops.Indice reference = (serv.stops.Indice) this.genericGetReference();
    reference.setName(node.getName());
    
  }
  
  public Indice getReference() {
    return (serv.stops.Indice) this.genericGetReference();
  }
  
  public Stop getNode() {
    return (serv.stops.Stop) this.genericGetNode();
  }
}
