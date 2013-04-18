package serv.buslines.busline;

import org.monet.bpi.java.MappingImpl;
import serv.buslines.Busline;
import serv.buslines.Indice;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    serv.buslines.Busline node = (serv.buslines.Busline) this.genericGetNode();
    serv.buslines.Indice reference = (serv.buslines.Indice) this.genericGetReference();
    reference.setId(node.getId());
    reference.setName(node.getName());
    
  }
  
  public Indice getReference() {
    return (serv.buslines.Indice) this.genericGetReference();
  }
  
  public Busline getNode() {
    return (serv.buslines.Busline) this.genericGetNode();
  }
}
