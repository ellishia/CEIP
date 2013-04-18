package doc.absences.absence;

import doc.absences.Absence;
import doc.absences.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    doc.absences.Absence node = (doc.absences.Absence) this.genericGetNode();
    doc.absences.Indice reference = (doc.absences.Indice) this.genericGetReference();
    reference.setDate(node.getDate());
    reference.setStudent(node.getStudent());
    
  }
  
  public Indice getReference() {
    return (doc.absences.Indice) this.genericGetReference();
  }
  
  public Absence getNode() {
    return (doc.absences.Absence) this.genericGetNode();
  }
}
