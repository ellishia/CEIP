package direc.claustrodoc.exportador;

import direc.ClaustroDoc;
import direc.claustrodoc.Exportador;
import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl.ExporterScopeImpl;

@SuppressWarnings("all")
public class ExporterScope extends ExporterScopeImpl {
  public ExporterScope(final Exportador instance, final Node target) {
    instance.super(target);
  }
  
  public void toDocument(final ClaustroDoc document) {
    this.internalToDocument(document);
  }
  
  public ClaustroDoc toNewDocument() {
    return (direc.ClaustroDoc)internalToNewDocument("direc.ClaustroDoc");
  }
}
