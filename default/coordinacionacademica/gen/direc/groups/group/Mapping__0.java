package direc.groups.group;

import direc.groups.Group;
import direc.groups.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.groups.Group node = (direc.groups.Group) this.genericGetNode();
    direc.groups.Indice reference = (direc.groups.Indice) this.genericGetReference();
    reference.setName(node.getName());
    reference.setAcademicYear(node.getAcademicYear());
    reference.setIdentifier(node.getIdentifier());
    
  }
  
  public Indice getReference() {
    return (direc.groups.Indice) this.genericGetReference();
  }
  
  public Group getNode() {
    return (direc.groups.Group) this.genericGetNode();
  }
}
