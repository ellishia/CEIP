package doc.parentvisits.parentvisit;

import doc.parentvisits.Indice;
import doc.parentvisits.ParentVisit;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    doc.parentvisits.ParentVisit node = (doc.parentvisits.ParentVisit) this.genericGetNode();
    doc.parentvisits.Indice reference = (doc.parentvisits.Indice) this.genericGetReference();
    reference.setIdentifier(node.getIdentifier());
    reference.setTitle(node.getTitle());
    reference.setDate(node.getDate());
    
  }
  
  public Indice getReference() {
    return (doc.parentvisits.Indice) this.genericGetReference();
  }
  
  public ParentVisit getNode() {
    return (doc.parentvisits.ParentVisit) this.genericGetNode();
  }
}
