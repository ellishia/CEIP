package direc;

import direc.DocumentoCentro;
import direc.minutedoc.Schema;
import org.monet.bpi.Node;

@SuppressWarnings("all")
public class MinuteDoc extends DocumentoCentro {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (direc.minutedoc.Schema) this.genericGetSchema();
  }
  
  public static MinuteDoc createNew(final Node parent) {
    return (direc.MinuteDoc)org.monet.bpi.NodeService.create(direc.MinuteDoc.class, parent);
  }
}
