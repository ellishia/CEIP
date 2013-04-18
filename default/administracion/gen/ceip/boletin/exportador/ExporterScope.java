package ceip.boletin.exportador;

import ceip.Boletin;
import ceip.boletin.Exportador;
import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl.ExporterScopeImpl;

@SuppressWarnings("all")
public class ExporterScope extends ExporterScopeImpl {
  public ExporterScope(final Exportador instance, final Node target) {
    instance.super(target);
  }
  
  public void toDocument(final Boletin document) {
    this.internalToDocument(document);
  }
  
  public Boletin toNewDocument() {
    return (ceip.Boletin)internalToNewDocument("ceip.Boletin");
  }
}
