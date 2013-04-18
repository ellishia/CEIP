package ceip;

import ceip.MedicalIssues;
import ceip.Relatives;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeContainerImpl;

@SuppressWarnings("all")
public class StudentData extends NodeContainerImpl {
  public MedicalIssues getMedicalIssues() {
    return (ceip.MedicalIssues)this.getChildNode("ceip.MedicalIssues");
  }
  
  public Relatives getRelatives() {
    return (ceip.Relatives)this.getChildNode("ceip.Relatives");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static StudentData createNew(final Node parent) {
    return (ceip.StudentData)org.monet.bpi.NodeService.create(ceip.StudentData.class, parent);
  }
}
