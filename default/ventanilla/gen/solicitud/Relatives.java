package solicitud;

import org.monet.bpi.FieldMultiple;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import solicitud.relatives.AuthorizedRelatives;
import solicitud.relatives.Parent;

@SuppressWarnings("all")
public class Relatives extends NodeFormImpl {
  public FieldMultiple<Parent,Void> getParentField() {
    return ((org.monet.bpi.FieldMultiple<solicitud.relatives.Parent, java.lang.Void>)this.getField("Relatives", "Parent"));
  }
  
  public FieldMultiple<AuthorizedRelatives,Void> getAuthorizedRelativesField() {
    return ((org.monet.bpi.FieldMultiple<solicitud.relatives.AuthorizedRelatives, java.lang.Void>)this.getField("Relatives", "AuthorizedRelatives"));
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Relatives createNew(final Node parent) {
    return (solicitud.Relatives)org.monet.bpi.NodeService.create(solicitud.Relatives.class, parent);
  }
}
