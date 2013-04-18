package direc.minutedoc.exportador;

import direc.MinuteDoc;
import direc.minutedoc.Exportador;
import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl.ExporterScopeImpl;

@SuppressWarnings("all")
public class ExporterScope extends ExporterScopeImpl {
  public ExporterScope(final Exportador instance, final Node target) {
    instance.super(target);
  }
  
  public void toDocument(final MinuteDoc document) {
    this.internalToDocument(document);
  }
  
  public MinuteDoc toNewDocument() {
    return (direc.MinuteDoc)internalToNewDocument("direc.MinuteDoc");
  }
}
