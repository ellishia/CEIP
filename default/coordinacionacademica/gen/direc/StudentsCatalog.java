package direc;

import direc.students.Index;
import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCatalogImpl;

@SuppressWarnings("all")
public class StudentsCatalog extends NodeCatalogImpl {
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
  
  public static StudentsCatalog createNew(final Node parent) {
    return (direc.StudentsCatalog)org.monet.bpi.NodeService.create(direc.StudentsCatalog.class, parent);
  }
}
