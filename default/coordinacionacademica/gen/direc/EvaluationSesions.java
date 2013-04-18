package direc;

import direc.evaluationsesions.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class EvaluationSesions extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<direc.evaluationsesions.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<direc.evaluationsesions.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<direc.evaluationsesions.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<direc.evaluationsesions.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (direc.evaluationsesions.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static EvaluationSesions createNew(final Node parent) {
    return (direc.EvaluationSesions)org.monet.bpi.NodeService.create(direc.EvaluationSesions.class, parent);
  }
}
