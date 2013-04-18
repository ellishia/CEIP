package solicitud;

import org.monet.bpi.Node;
import org.monet.bpi.java.NodeDocumentImpl;
import solicitud.admiteddoc.Schema;

@SuppressWarnings("all")
public class AdmitedDoc extends NodeDocumentImpl {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (solicitud.admiteddoc.Schema) this.genericGetSchema();
  }
  
  public static AdmitedDoc createNew(final Node parent) {
    return (solicitud.AdmitedDoc)org.monet.bpi.NodeService.create(solicitud.AdmitedDoc.class, parent);
  }
}
