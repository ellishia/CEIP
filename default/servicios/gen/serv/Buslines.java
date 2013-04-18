package serv;

import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;
import serv.buslines.Indice;

@SuppressWarnings("all")
public class Buslines extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<serv.buslines.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<serv.buslines.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<serv.buslines.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<serv.buslines.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (serv.buslines.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Buslines createNew(final Node parent) {
    return (serv.Buslines)org.monet.bpi.NodeService.create(serv.Buslines.class, parent);
  }
}
