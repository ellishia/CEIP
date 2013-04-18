package grades;

import grades.students.Index;
import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings(value = "all")
public class Students extends NodeCollectionImpl {
  public static Students getInstance() {
    return (grades.Students)org.monet.bpi.NodeService.locate("grades.Students");
  }
  
  public Iterable<Index> getAll() {
    return (Iterable<grades.students.Index>)genericGetAll();
  }
  
  public Iterable<Index> getAll(final OrderExpression orderBy) {
    return (Iterable<grades.students.Index>)genericGetAll(orderBy);
  }
  
  public Iterable<Index> get(final Expression where) {
    return (Iterable<grades.students.Index>)genericGet(where);
  }
  
  public Iterable<Index> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<grades.students.Index>)genericGet(where, orderBy);
  }
  
  public Index getFirst(final Expression where) {
    return (grades.students.Index)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
