package direc.claustros.claustro;

import direc.claustros.Claustro;
import direc.claustros.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.claustros.Claustro node = (direc.claustros.Claustro) this.genericGetNode();
    direc.claustros.Indice reference = (direc.claustros.Indice) this.genericGetReference();
    reference.setTitle(node.getTitle());
    
  }
  
  public Indice getReference() {
    return (direc.claustros.Indice) this.genericGetReference();
  }
  
  public Claustro getNode() {
    return (direc.claustros.Claustro) this.genericGetNode();
  }
}
