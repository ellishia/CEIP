package direc;

import direc.parentsmeetings.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class ParentsMeetings extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<direc.parentsmeetings.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<direc.parentsmeetings.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<direc.parentsmeetings.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<direc.parentsmeetings.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (direc.parentsmeetings.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static ParentsMeetings createNew(final Node parent) {
    return (direc.ParentsMeetings)org.monet.bpi.NodeService.create(direc.ParentsMeetings.class, parent);
  }
}
