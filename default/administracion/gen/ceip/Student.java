package ceip;

import ceip.BasicInfo;
import ceip.MedicalIssues;
import ceip.Relatives;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeContainerImpl;

@SuppressWarnings("all")
public class Student extends NodeContainerImpl {
  public BasicInfo getBasicInfo() {
    return (ceip.BasicInfo)this.getChildNode("ceip.BasicInfo");
  }
  
  public MedicalIssues getMedicalIssues() {
    return (ceip.MedicalIssues)this.getChildNode("ceip.MedicalIssues");
  }
  
  public Relatives getRelatives() {
    return (ceip.Relatives)this.getChildNode("ceip.Relatives");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Student createNew(final Node parent) {
    return (ceip.Student)org.monet.bpi.NodeService.create(ceip.Student.class, parent);
  }
}
