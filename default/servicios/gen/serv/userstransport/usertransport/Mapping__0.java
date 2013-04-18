package serv.userstransport.usertransport;

import org.monet.bpi.java.MappingImpl;
import serv.userstransport.Indice;
import serv.userstransport.UserTransport;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    serv.userstransport.UserTransport node = (serv.userstransport.UserTransport) this.genericGetNode();
    serv.userstransport.Indice reference = (serv.userstransport.Indice) this.genericGetReference();
    reference.setStop(node.getStop());
    
  }
  
  public Indice getReference() {
    return (serv.userstransport.Indice) this.genericGetReference();
  }
  
  public UserTransport getNode() {
    return (serv.userstransport.UserTransport) this.genericGetNode();
  }
}
