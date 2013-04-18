package serv;

import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;
import serv.userscanteen.Indice;

@SuppressWarnings("all")
public class UsersCanteen extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<serv.userscanteen.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<serv.userscanteen.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<serv.userscanteen.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<serv.userscanteen.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (serv.userscanteen.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static UsersCanteen createNew(final Node parent) {
    return (serv.UsersCanteen)org.monet.bpi.NodeService.create(serv.UsersCanteen.class, parent);
  }
}
