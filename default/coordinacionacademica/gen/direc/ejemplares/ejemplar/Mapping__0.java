package direc.ejemplares.ejemplar;

import direc.ejemplares.Ejemplar;
import direc.ejemplares.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.ejemplares.Ejemplar node = (direc.ejemplares.Ejemplar) this.genericGetNode();
    direc.ejemplares.Indice reference = (direc.ejemplares.Indice) this.genericGetReference();
    reference.setEstado(node.getEstado());
    
  }
  
  public Indice getReference() {
    return (direc.ejemplares.Indice) this.genericGetReference();
  }
  
  public Ejemplar getNode() {
    return (direc.ejemplares.Ejemplar) this.genericGetNode();
  }
}
