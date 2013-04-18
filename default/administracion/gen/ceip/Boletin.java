package ceip;

import ceip.AcademicRecords;
import ceip.boletin.Schema;
import ceip.boletines.Index;
import org.monet.bpi.Node;

@SuppressWarnings("all")
public class Boletin extends AcademicRecords {
  public Index getIndex() {
    return (ceip.boletines.Index)this.getIndexEntry("ceip.Boletines.Index");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (ceip.boletin.Schema) this.genericGetSchema();
  }
  
  public static Boletin createNew(final Node parent) {
    return (ceip.Boletin)org.monet.bpi.NodeService.create(ceip.Boletin.class, parent);
  }
}
