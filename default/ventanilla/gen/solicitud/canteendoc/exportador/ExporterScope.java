package solicitud.canteendoc.exportador;

import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl.ExporterScopeImpl;
import solicitud.CanteenDoc;
import solicitud.canteendoc.Exportador;

@SuppressWarnings("all")
public class ExporterScope extends ExporterScopeImpl {
  public ExporterScope(final Exportador instance, final Node target) {
    instance.super(target);
  }
  
  public void toDocument(final CanteenDoc document) {
    this.internalToDocument(document);
  }
  
  public CanteenDoc toNewDocument() {
    return (solicitud.CanteenDoc)internalToNewDocument("solicitud.CanteenDoc");
  }
}
