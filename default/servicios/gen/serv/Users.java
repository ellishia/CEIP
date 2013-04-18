package serv;

import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;
import serv.users.Indice;

@SuppressWarnings("all")
public class Users extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<serv.users.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<serv.users.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<serv.users.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<serv.users.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (serv.users.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Users createNew(final Node parent) {
    return (serv.Users)org.monet.bpi.NodeService.create(serv.Users.class, parent);
  }
}
