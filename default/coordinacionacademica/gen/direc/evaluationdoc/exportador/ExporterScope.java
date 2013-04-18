package direc.evaluationdoc.exportador;

import direc.EvaluationDoc;
import direc.evaluationdoc.Exportador;
import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl.ExporterScopeImpl;

@SuppressWarnings("all")
public class ExporterScope extends ExporterScopeImpl {
  public ExporterScope(final Exportador instance, final Node target) {
    instance.super(target);
  }
  
  public void toDocument(final EvaluationDoc document) {
    this.internalToDocument(document);
  }
  
  public EvaluationDoc toNewDocument() {
    return (direc.EvaluationDoc)internalToNewDocument("direc.EvaluationDoc");
  }
}
