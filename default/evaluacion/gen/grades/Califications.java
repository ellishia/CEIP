package grades;

import grades.califications.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings(value = "all")
public class Califications extends NodeCollectionImpl {
  public static Califications getInstance() {
    return (grades.Califications)org.monet.bpi.NodeService.locate("grades.Califications");
  }
  
  public Iterable<Indice> getAll() {
    return (Iterable<grades.califications.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<grades.califications.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<grades.califications.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<grades.califications.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (grades.califications.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
