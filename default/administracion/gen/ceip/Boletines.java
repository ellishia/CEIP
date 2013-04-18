package ceip;

import ceip.boletines.Index;
import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class Boletines extends NodeCollectionImpl {
  public static Boletines getInstance() {
    return (ceip.Boletines)org.monet.bpi.NodeService.locate("ceip.Boletines");
  }
  
  public Iterable<Index> getAll() {
    return (Iterable<ceip.boletines.Index>)genericGetAll();
  }
  
  public Iterable<Index> getAll(final OrderExpression orderBy) {
    return (Iterable<ceip.boletines.Index>)genericGetAll(orderBy);
  }
  
  public Iterable<Index> get(final Expression where) {
    return (Iterable<ceip.boletines.Index>)genericGet(where);
  }
  
  public Iterable<Index> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<ceip.boletines.Index>)genericGet(where, orderBy);
  }
  
  public Index getFirst(final Expression where) {
    return (ceip.boletines.Index)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
