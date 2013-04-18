package direc;

import direc.schedules.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class Schedules extends NodeCollectionImpl {
  public static Schedules getInstance() {
    return (direc.Schedules)org.monet.bpi.NodeService.locate("direc.Schedules");
  }
  
  public Iterable<Indice> getAll() {
    return (Iterable<direc.schedules.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<direc.schedules.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<direc.schedules.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<direc.schedules.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (direc.schedules.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
