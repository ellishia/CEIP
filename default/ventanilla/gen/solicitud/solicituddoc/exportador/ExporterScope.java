package solicitud.solicituddoc.exportador;

import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl.ExporterScopeImpl;
import solicitud.SolicitudDoc;
import solicitud.solicituddoc.Exportador;

@SuppressWarnings("all")
public class ExporterScope extends ExporterScopeImpl {
  public ExporterScope(final Exportador instance, final Node target) {
    instance.super(target);
  }
  
  public void toDocument(final SolicitudDoc document) {
    this.internalToDocument(document);
  }
  
  public SolicitudDoc toNewDocument() {
    return (solicitud.SolicitudDoc)internalToNewDocument("solicitud.SolicitudDoc");
  }
}
