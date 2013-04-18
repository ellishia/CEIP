package doc.subjects.subject;

import doc.subjects.Indice;
import doc.subjects.Subject;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    doc.subjects.Subject node = (doc.subjects.Subject) this.genericGetNode();
    doc.subjects.Indice reference = (doc.subjects.Indice) this.genericGetReference();
    reference.setName(node.getName());
    reference.setIdentifier(node.getIdentifier());
    
  }
  
  public Indice getReference() {
    return (doc.subjects.Indice) this.genericGetReference();
  }
  
  public Subject getNode() {
    return (doc.subjects.Subject) this.genericGetNode();
  }
}
