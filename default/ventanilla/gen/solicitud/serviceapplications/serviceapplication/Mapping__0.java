package solicitud.serviceapplications.serviceapplication;

import org.monet.bpi.java.MappingImpl;
import solicitud.serviceapplications.Indice;
import solicitud.serviceapplications.ServiceApplication;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    solicitud.serviceapplications.ServiceApplication node = (solicitud.serviceapplications.ServiceApplication) this.genericGetNode();
    solicitud.serviceapplications.Indice reference = (solicitud.serviceapplications.Indice) this.genericGetReference();
    reference.setStudentName(node.getStudentName());
    reference.setStudentSurname(node.getStudentSurname());
    reference.setCial(node.getCial());
    
  }
  
  public Indice getReference() {
    return (solicitud.serviceapplications.Indice) this.genericGetReference();
  }
  
  public ServiceApplication getNode() {
    return (solicitud.serviceapplications.ServiceApplication) this.genericGetNode();
  }
}
