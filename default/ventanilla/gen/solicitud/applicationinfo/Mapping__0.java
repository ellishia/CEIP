package solicitud.applicationinfo;

import org.monet.bpi.java.MappingImpl;
import solicitud.ApplicationInfo;
import solicitud.applications.Indice;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    solicitud.ApplicationInfo node = (solicitud.ApplicationInfo) this.genericGetNode();
    solicitud.applications.Indice reference = (solicitud.applications.Indice) this.genericGetReference();
    reference.setIdentifier(node.getIdentifier());
    reference.setStudentName(node.getStudentName());
    reference.setStudentSurname(node.getStudentSurname());
    reference.setCial(node.getCial());
    
  }
  
  public Indice getReference() {
    return (solicitud.applications.Indice) this.genericGetReference();
  }
  
  public ApplicationInfo getNode() {
    return (solicitud.ApplicationInfo) this.genericGetNode();
  }
}
