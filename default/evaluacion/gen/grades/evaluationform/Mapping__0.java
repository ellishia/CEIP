package grades.evaluationform;

import grades.EvaluationForm;
import grades.trimestralevaluations.Indice;
import org.monet.bpi.java.MappingImpl;

public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    grades.EvaluationForm node = (grades.EvaluationForm) this.genericGetNode();
    grades.trimestralevaluations.Indice reference = (grades.trimestralevaluations.Indice) this.genericGetReference();
    reference.setGroup(node.getGroup());
    reference.setAcademicYear(node.getAcademicYear());
    
  }
  
  public Indice getReference() {
    return (grades.trimestralevaluations.Indice) this.genericGetReference();
  }
  
  public EvaluationForm getNode() {
    return (grades.EvaluationForm) this.genericGetNode();
  }
}
