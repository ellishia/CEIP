package grades.califications.calification;

import grades.califications.Calification;
import grades.califications.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    grades.califications.Calification node = (grades.califications.Calification) this.genericGetNode();
    grades.califications.Indice reference = (grades.califications.Indice) this.genericGetReference();
    reference.setAcademicYear(node.getAcademicYear());
    reference.setSubject(node.getSubject());
    reference.setTrimester(node.getTrimester());
    reference.setGrade(node.getGrade());
    
  }
  
  public Indice getReference() {
    return (grades.califications.Indice) this.genericGetReference();
  }
  
  public Calification getNode() {
    return (grades.califications.Calification) this.genericGetNode();
  }
}
