package ceip.admiteddoc.exportador;

import ceip.AdmitedDoc;
import ceip.admiteddoc.Exportador;
import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl.ExporterScopeImpl;

@SuppressWarnings("all")
public class ExporterScope extends ExporterScopeImpl {
  public ExporterScope(final Exportador instance, final Node target) {
    instance.super(target);
  }
  
  public void toDocument(final AdmitedDoc document) {
    this.internalToDocument(document);
  }
  
  public AdmitedDoc toNewDocument() {
    return (ceip.AdmitedDoc)internalToNewDocument("ceip.AdmitedDoc");
  }
}
