package solicitud;

import org.monet.bpi.Node;
import org.monet.bpi.java.NodeDocumentImpl;
import solicitud.canteendoc.Schema;

@SuppressWarnings("all")
public class CanteenDoc extends NodeDocumentImpl {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (solicitud.canteendoc.Schema) this.genericGetSchema();
  }
  
  public static CanteenDoc createNew(final Node parent) {
    return (solicitud.CanteenDoc)org.monet.bpi.NodeService.create(solicitud.CanteenDoc.class, parent);
  }
}
