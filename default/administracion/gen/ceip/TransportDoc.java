package ceip;

import ceip.transportdoc.Schema;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeDocumentImpl;

@SuppressWarnings("all")
public class TransportDoc extends NodeDocumentImpl {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (ceip.transportdoc.Schema) this.genericGetSchema();
  }
  
  public static TransportDoc createNew(final Node parent) {
    return (ceip.TransportDoc)org.monet.bpi.NodeService.create(ceip.TransportDoc.class, parent);
  }
}
