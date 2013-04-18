package grades;

import grades.continuosevaluation.Index;
import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCatalogImpl;

@SuppressWarnings(value = "all")
public class ContinuosEvaluation extends NodeCatalogImpl {
  public Iterable<Index> getAll() {
    return (Iterable<grades.continuosevaluation.Index>)genericGetAll();
  }
  
  public Iterable<Index> getAll(final OrderExpression orderBy) {
    return (Iterable<grades.continuosevaluation.Index>)genericGetAll(orderBy);
  }
  
  public Iterable<Index> get(final Expression where) {
    return (Iterable<grades.continuosevaluation.Index>)genericGet(where);
  }
  
  public Iterable<Index> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<grades.continuosevaluation.Index>)genericGet(where, orderBy);
  }
  
  public Index getFirst(final Expression where) {
    return (grades.continuosevaluation.Index)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static ContinuosEvaluation createNew(final Node parent) {
    return (grades.ContinuosEvaluation)org.monet.bpi.NodeService.create(grades.ContinuosEvaluation.class, parent);
  }
}
