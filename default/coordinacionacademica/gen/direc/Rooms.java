package direc;

import direc.rooms.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class Rooms extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<direc.rooms.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<direc.rooms.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<direc.rooms.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<direc.rooms.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (direc.rooms.Indice)genericGetFirst(where);
  }
  
  public static Rooms getInstance() {
    return (direc.Rooms)org.monet.bpi.NodeService.locate("direc.Rooms");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
