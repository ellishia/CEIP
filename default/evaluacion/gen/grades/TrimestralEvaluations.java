package grades;

import grades.trimestralevaluations.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings(value = "all")
public class TrimestralEvaluations extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<grades.trimestralevaluations.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<grades.trimestralevaluations.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<grades.trimestralevaluations.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<grades.trimestralevaluations.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (grades.trimestralevaluations.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static TrimestralEvaluations createNew(final Node parent) {
    return (grades.TrimestralEvaluations)org.monet.bpi.NodeService.create(grades.TrimestralEvaluations.class, parent);
  }
}
