package direc;

import direc.lotes.Index;
import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class Lotes extends NodeCollectionImpl {
  public static Lotes getInstance() {
    return (direc.Lotes)org.monet.bpi.NodeService.locate("direc.Lotes");
  }
  
  public Iterable<Index> getAll() {
    return (Iterable<direc.lotes.Index>)genericGetAll();
  }
  
  public Iterable<Index> getAll(final OrderExpression orderBy) {
    return (Iterable<direc.lotes.Index>)genericGetAll(orderBy);
  }
  
  public Iterable<Index> get(final Expression where) {
    return (Iterable<direc.lotes.Index>)genericGet(where);
  }
  
  public Iterable<Index> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<direc.lotes.Index>)genericGet(where, orderBy);
  }
  
  public Index getFirst(final Expression where) {
    return (direc.lotes.Index)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
