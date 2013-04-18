package direc;

import direc.students.Index;
import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class Students extends NodeCollectionImpl {
  public static Students getInstance() {
    return (direc.Students)org.monet.bpi.NodeService.locate("direc.Students");
  }
  
  public Iterable<Index> getAll() {
    return (Iterable<direc.students.Index>)genericGetAll();
  }
  
  public Iterable<Index> getAll(final OrderExpression orderBy) {
    return (Iterable<direc.students.Index>)genericGetAll(orderBy);
  }
  
  public Iterable<Index> get(final Expression where) {
    return (Iterable<direc.students.Index>)genericGet(where);
  }
  
  public Iterable<Index> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<direc.students.Index>)genericGet(where, orderBy);
  }
  
  public Index getFirst(final Expression where) {
    return (direc.students.Index)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
