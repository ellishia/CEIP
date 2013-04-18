package doc;

import doc.studentdoc.Schema;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeDocumentImpl;

@SuppressWarnings("all")
public class StudentDoc extends NodeDocumentImpl {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (doc.studentdoc.Schema) this.genericGetSchema();
  }
  
  public static StudentDoc createNew(final Node parent) {
    return (doc.StudentDoc)org.monet.bpi.NodeService.create(doc.StudentDoc.class, parent);
  }
}
