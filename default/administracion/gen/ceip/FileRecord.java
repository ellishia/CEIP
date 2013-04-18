package ceip;

import ceip.filerecord.Schema;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeDocumentImpl;

@SuppressWarnings("all")
public class FileRecord extends NodeDocumentImpl {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (ceip.filerecord.Schema) this.genericGetSchema();
  }
  
  public static FileRecord createNew(final Node parent) {
    return (ceip.FileRecord)org.monet.bpi.NodeService.create(ceip.FileRecord.class, parent);
  }
}
