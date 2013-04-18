package serv;

import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;
import serv.userstransport.Indice;

@SuppressWarnings("all")
public class UsersTransport extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<serv.userstransport.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<serv.userstransport.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<serv.userstransport.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<serv.userstransport.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (serv.userstransport.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static UsersTransport createNew(final Node parent) {
    return (serv.UsersTransport)org.monet.bpi.NodeService.create(serv.UsersTransport.class, parent);
  }
}
