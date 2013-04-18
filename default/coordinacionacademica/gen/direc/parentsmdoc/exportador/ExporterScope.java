package direc.parentsmdoc.exportador;

import direc.ParentsMDoc;
import direc.parentsmdoc.Exportador;
import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl.ExporterScopeImpl;

@SuppressWarnings("all")
public class ExporterScope extends ExporterScopeImpl {
  public ExporterScope(final Exportador instance, final Node target) {
    instance.super(target);
  }
  
  public void toDocument(final ParentsMDoc document) {
    this.internalToDocument(document);
  }
  
  public ParentsMDoc toNewDocument() {
    return (direc.ParentsMDoc)internalToNewDocument("direc.ParentsMDoc");
  }
}
