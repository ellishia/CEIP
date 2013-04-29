package solicitud;

import org.monet.bpi.Node;
import org.monet.bpi.java.NodeDocumentImpl;
import solicitud.transportdoc.Schema;

@SuppressWarnings("all")
public class TransportDoc extends NodeDocumentImpl {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (solicitud.transportdoc.Schema) this.genericGetSchema();
  }
  
  public static TransportDoc createNew(final Node parent) {
    return (solicitud.TransportDoc)org.monet.bpi.NodeService.create(solicitud.TransportDoc.class, parent);
  }
}
