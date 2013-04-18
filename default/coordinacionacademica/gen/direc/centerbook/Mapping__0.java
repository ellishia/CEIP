package direc.centerbook;

import direc.CenterBook;
import direc.centerbooks.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.CenterBook node = (direc.CenterBook) this.genericGetNode();
    direc.centerbooks.Indice reference = (direc.centerbooks.Indice) this.genericGetReference();
    reference.setTitle(node.getTitle());
    reference.setEditorial(node.getEditorial());
    reference.setLevel(node.getLevel());
    
  }
  
  public Indice getReference() {
    return (direc.centerbooks.Indice) this.genericGetReference();
  }
  
  public CenterBook getNode() {
    return (direc.CenterBook) this.genericGetNode();
  }
}
