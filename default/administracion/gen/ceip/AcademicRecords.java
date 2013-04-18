package ceip;

import ceip.academicrecords.Schema;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeDocumentImpl;

@SuppressWarnings("all")
public abstract class AcademicRecords extends NodeDocumentImpl {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (ceip.academicrecords.Schema) this.genericGetSchema();
  }
  
  public static AcademicRecords createNew(final Node parent) {
    return (ceip.AcademicRecords)org.monet.bpi.NodeService.create(ceip.AcademicRecords.class, parent);
  }
}
