package direc;

import direc.DocumentoCentro;
import direc.parentsmdoc.Schema;
import org.monet.bpi.Node;

@SuppressWarnings("all")
public class ParentsMDoc extends DocumentoCentro {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (direc.parentsmdoc.Schema) this.genericGetSchema();
  }
  
  public static ParentsMDoc createNew(final Node parent) {
    return (direc.ParentsMDoc)org.monet.bpi.NodeService.create(direc.ParentsMDoc.class, parent);
  }
}
