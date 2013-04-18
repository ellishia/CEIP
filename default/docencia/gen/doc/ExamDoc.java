package doc;

import doc.examdoc.Schema;
import doc.examdocs.Indice;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeDocumentImpl;

@SuppressWarnings("all")
public class ExamDoc extends NodeDocumentImpl {
  public Indice getIndice() {
    return (doc.examdocs.Indice)this.getIndexEntry("doc.ExamDocs.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (doc.examdoc.Schema) this.genericGetSchema();
  }
  
  public static ExamDoc createNew(final Node parent) {
    return (doc.ExamDoc)org.monet.bpi.NodeService.create(doc.ExamDoc.class, parent);
  }
}
