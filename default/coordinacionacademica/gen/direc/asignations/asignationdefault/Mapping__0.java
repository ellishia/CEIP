package direc.asignations.asignationdefault;

import direc.asignations.AsignationDefault;
import direc.asignations.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.asignations.AsignationDefault node = (direc.asignations.AsignationDefault) this.genericGetNode();
    direc.asignations.Indice reference = (direc.asignations.Indice) this.genericGetReference();
    reference.setAcademicYear(node.getAcademicYear());
    
  }
  
  public Indice getReference() {
    return (direc.asignations.Indice) this.genericGetReference();
  }
  
  public AsignationDefault getNode() {
    return (direc.asignations.AsignationDefault) this.genericGetNode();
  }
}
