package doc.examdoc.exportador;

import doc.ExamDoc;
import doc.examdoc.Exportador;
import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl.ExporterScopeImpl;

@SuppressWarnings("all")
public class ExporterScope extends ExporterScopeImpl {
  public ExporterScope(final Exportador instance, final Node target) {
    instance.super(target);
  }
  
  public void toDocument(final ExamDoc document) {
    this.internalToDocument(document);
  }
  
  public ExamDoc toNewDocument() {
    return (doc.ExamDoc)internalToNewDocument("doc.ExamDoc");
  }
}
