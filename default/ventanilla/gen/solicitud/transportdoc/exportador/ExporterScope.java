package solicitud.transportdoc.exportador;

import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl.ExporterScopeImpl;
import solicitud.TransportDoc;
import solicitud.transportdoc.Exportador;

@SuppressWarnings("all")
public class ExporterScope extends ExporterScopeImpl {
  public ExporterScope(final Exportador instance, final Node target) {
    instance.super(target);
  }
  
  public void toDocument(final TransportDoc document) {
    this.internalToDocument(document);
  }
  
  public TransportDoc toNewDocument() {
    return (solicitud.TransportDoc)internalToNewDocument("solicitud.TransportDoc");
  }
}
