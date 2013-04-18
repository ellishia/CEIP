package ceip;

import ceip.solicituddoc.Schema;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeDocumentImpl;

@SuppressWarnings("all")
public class SolicitudDoc extends NodeDocumentImpl {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (ceip.solicituddoc.Schema) this.genericGetSchema();
  }
  
  public static SolicitudDoc createNew(final Node parent) {
    return (ceip.SolicitudDoc)org.monet.bpi.NodeService.create(ceip.SolicitudDoc.class, parent);
  }
}
