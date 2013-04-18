package direc;

import direc.activities.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class Activities extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<direc.activities.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<direc.activities.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<direc.activities.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<direc.activities.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (direc.activities.Indice)genericGetFirst(where);
  }
  
  public static Activities getInstance() {
    return (direc.Activities)org.monet.bpi.NodeService.locate("direc.Activities");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
