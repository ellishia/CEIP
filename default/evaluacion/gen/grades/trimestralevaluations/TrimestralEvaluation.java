package grades.trimestralevaluations;

import grades.Califications;
import grades.EvaluationForm;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeContainerImpl;

@SuppressWarnings("all")
public class TrimestralEvaluation extends NodeContainerImpl {
  public EvaluationForm getEvaluationForm() {
    return (grades.EvaluationForm)this.getChildNode("grades.EvaluationForm");
  }
  
  public Califications getCalifications() {
    return (grades.Califications)this.getChildNode("grades.Califications");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static TrimestralEvaluation createNew(final Node parent) {
    return (grades.trimestralevaluations.TrimestralEvaluation)org.monet.bpi.NodeService.create(grades.trimestralevaluations.TrimestralEvaluation.class, parent);
  }
}
