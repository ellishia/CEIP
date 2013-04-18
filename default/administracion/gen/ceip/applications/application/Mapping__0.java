package ceip.applications.application;

import ceip.applications.Application;
import ceip.applications.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    ceip.applications.Application node = (ceip.applications.Application) this.genericGetNode();
    ceip.applications.Indice reference = (ceip.applications.Indice) this.genericGetReference();
    reference.setIdentifier(node.getIdentifier());
    reference.setStudentName(node.getStudentName());
    reference.setStudentSurname(node.getStudentSurname());
    reference.setLevel(node.getLevel());
    
  }
  
  public Indice getReference() {
    return (ceip.applications.Indice) this.genericGetReference();
  }
  
  public Application getNode() {
    return (ceip.applications.Application) this.genericGetNode();
  }
}
