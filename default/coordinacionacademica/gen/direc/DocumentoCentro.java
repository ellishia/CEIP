package direc;

import direc.documentocentro.Schema;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeDocumentImpl;

@SuppressWarnings("all")
public abstract class DocumentoCentro extends NodeDocumentImpl {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (direc.documentocentro.Schema) this.genericGetSchema();
  }
  
  public static DocumentoCentro createNew(final Node parent) {
    return (direc.DocumentoCentro)org.monet.bpi.NodeService.create(direc.DocumentoCentro.class, parent);
  }
}
