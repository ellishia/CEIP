package solicitud;

import org.monet.bpi.Node;
import org.monet.bpi.java.NodeDocumentImpl;
import solicitud.solicituddoc.Schema;

@SuppressWarnings("all")
public class SolicitudDoc extends NodeDocumentImpl {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (solicitud.solicituddoc.Schema) this.genericGetSchema();
  }
  
  public static SolicitudDoc createNew(final Node parent) {
    return (solicitud.SolicitudDoc)org.monet.bpi.NodeService.create(solicitud.SolicitudDoc.class, parent);
  }
}
