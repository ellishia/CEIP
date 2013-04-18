package doc.groups.group;

import doc.groups.Group;
import doc.groups.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    doc.groups.Group node = (doc.groups.Group) this.genericGetNode();
    doc.groups.Indice reference = (doc.groups.Indice) this.genericGetReference();
    reference.setName(node.getName());
    
  }
  
  public Indice getReference() {
    return (doc.groups.Indice) this.genericGetReference();
  }
  
  public Group getNode() {
    return (doc.groups.Group) this.genericGetNode();
  }
}
