package direc.teacherasignations.teacherasignation;

import direc.teacherasignations.Indice;
import direc.teacherasignations.TeacherAsignation;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.teacherasignations.TeacherAsignation node = (direc.teacherasignations.TeacherAsignation) this.genericGetNode();
    direc.teacherasignations.Indice reference = (direc.teacherasignations.Indice) this.genericGetReference();
    reference.setTeacher(node.getTeacher());
    
  }
  
  public Indice getReference() {
    return (direc.teacherasignations.Indice) this.genericGetReference();
  }
  
  public TeacherAsignation getNode() {
    return (direc.teacherasignations.TeacherAsignation) this.genericGetNode();
  }
}
