package ceip;

import ceip.AcademicRecords;
import ceip.admiteddoc.Schema;
import org.monet.bpi.Node;

@SuppressWarnings("all")
public class AdmitedDoc extends AcademicRecords {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (ceip.admiteddoc.Schema) this.genericGetSchema();
  }
  
  public static AdmitedDoc createNew(final Node parent) {
    return (ceip.AdmitedDoc)org.monet.bpi.NodeService.create(ceip.AdmitedDoc.class, parent);
  }
}
