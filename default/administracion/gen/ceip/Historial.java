package ceip;

import ceip.AcademicRecords;
import ceip.historial.Schema;
import org.monet.bpi.Node;

@SuppressWarnings("all")
public class Historial extends AcademicRecords {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (ceip.historial.Schema) this.genericGetSchema();
  }
  
  public static Historial createNew(final Node parent) {
    return (ceip.Historial)org.monet.bpi.NodeService.create(ceip.Historial.class, parent);
  }
}
