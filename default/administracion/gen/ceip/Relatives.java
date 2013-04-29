package ceip;

import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSection;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;

@SuppressWarnings("all")
public class Relatives extends NodeFormImpl {
  public FieldMultiple<FieldSection,Void> getParentField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSection, java.lang.Void>)this.getField("Relatives", "Parent"));
  }
  
  public FieldMultiple<FieldSection,Void> getAuthorizedRelativesField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSection, java.lang.Void>)this.getField("Relatives", "AuthorizedRelatives"));
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Relatives createNew(final Node parent) {
    return (ceip.Relatives)org.monet.bpi.NodeService.create(ceip.Relatives.class, parent);
  }
}
