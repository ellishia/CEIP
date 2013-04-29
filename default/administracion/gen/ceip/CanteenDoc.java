package ceip;

import ceip.canteendoc.Schema;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeDocumentImpl;

@SuppressWarnings("all")
public class CanteenDoc extends NodeDocumentImpl {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (ceip.canteendoc.Schema) this.genericGetSchema();
  }
  
  public static CanteenDoc createNew(final Node parent) {
    return (ceip.CanteenDoc)org.monet.bpi.NodeService.create(ceip.CanteenDoc.class, parent);
  }
}
