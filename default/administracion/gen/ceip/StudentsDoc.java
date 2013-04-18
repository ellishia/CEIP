package ceip;

import ceip.AcademicRecords;
import ceip.studentsdoc.Schema;
import org.monet.bpi.Node;

@SuppressWarnings("all")
public class StudentsDoc extends AcademicRecords {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public Schema getSchema() {
    return (ceip.studentsdoc.Schema) this.genericGetSchema();
  }
  
  public static StudentsDoc createNew(final Node parent) {
    return (ceip.StudentsDoc)org.monet.bpi.NodeService.create(ceip.StudentsDoc.class, parent);
  }
}
