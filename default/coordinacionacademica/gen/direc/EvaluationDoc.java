package direc;

import direc.DocumentoCentro;
import direc.evaluationdoc.Schema;
import org.monet.bpi.Node;

@SuppressWarnings("all")
public class EvaluationDoc extends DocumentoCentro {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (direc.evaluationdoc.Schema) this.genericGetSchema();
  }
  
  public static EvaluationDoc createNew(final Node parent) {
    return (direc.EvaluationDoc)org.monet.bpi.NodeService.create(direc.EvaluationDoc.class, parent);
  }
}
