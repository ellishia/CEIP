package direc.minutes.acta;

import direc.minutes.Acta;
import direc.minutes.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.minutes.Acta node = (direc.minutes.Acta) this.genericGetNode();
    direc.minutes.Indice reference = (direc.minutes.Indice) this.genericGetReference();
    reference.setTitle(node.getTitle());
    
  }
  
  public Indice getReference() {
    return (direc.minutes.Indice) this.genericGetReference();
  }
  
  public Acta getNode() {
    return (direc.minutes.Acta) this.genericGetNode();
  }
}
