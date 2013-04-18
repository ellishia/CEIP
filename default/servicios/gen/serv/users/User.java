package serv.users;

import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import serv.users.user.Information;

@SuppressWarnings("all")
public abstract class User extends NodeFormImpl {
  public Information getInformationField() {
    return ((serv.users.user.Information)this.getField("User", "Information"));
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static User createNew(final Node parent) {
    return (serv.users.User)org.monet.bpi.NodeService.create(serv.users.User.class, parent);
  }
}
