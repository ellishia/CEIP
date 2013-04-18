package direc;

import direc.DocumentoCentro;
import direc.claustrodoc.Schema;
import org.monet.bpi.Node;

@SuppressWarnings("all")
public class ClaustroDoc extends DocumentoCentro {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (direc.claustrodoc.Schema) this.genericGetSchema();
  }
  
  public static ClaustroDoc createNew(final Node parent) {
    return (direc.ClaustroDoc)org.monet.bpi.NodeService.create(direc.ClaustroDoc.class, parent);
  }
}
