package ceip.serviceapplications.serviceapplication;

import ceip.serviceapplications.Indice;
import ceip.serviceapplications.ServiceApplication;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    ceip.serviceapplications.ServiceApplication node = (ceip.serviceapplications.ServiceApplication) this.genericGetNode();
    ceip.serviceapplications.Indice reference = (ceip.serviceapplications.Indice) this.genericGetReference();
    reference.setStudentName(node.getStudentName());
    reference.setStudentSurname(node.getStudentSurname());
    reference.setCial(node.getCial());
    reference.setIdentifier(node.getIdentifier());
    
  }
  
  public Indice getReference() {
    return (ceip.serviceapplications.Indice) this.genericGetReference();
  }
  
  public ServiceApplication getNode() {
    return (ceip.serviceapplications.ServiceApplication) this.genericGetNode();
  }
}
