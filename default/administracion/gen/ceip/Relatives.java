package ceip;

import ceip.relatives.AuthorizedRelatives;
import ceip.relatives.Parent;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;

@SuppressWarnings("all")
public class Relatives extends NodeFormImpl {
  public FieldMultiple<Parent,Void> getParentField() {
    return ((org.monet.bpi.FieldMultiple<ceip.relatives.Parent, java.lang.Void>)this.getField("Relatives", "Parent"));
  }
  
  public FieldMultiple<AuthorizedRelatives,Void> getAuthorizedRelativesField() {
    return ((org.monet.bpi.FieldMultiple<ceip.relatives.AuthorizedRelatives, java.lang.Void>)this.getField("Relatives", "AuthorizedRelatives"));
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Relatives createNew(final Node parent) {
    return (ceip.Relatives)org.monet.bpi.NodeService.create(ceip.Relatives.class, parent);
  }
}
