package ceip;

import ceip.availablepositions.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class TotalPositions extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<ceip.availablepositions.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<ceip.availablepositions.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<ceip.availablepositions.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<ceip.availablepositions.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (ceip.availablepositions.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static TotalPositions createNew(final Node parent) {
    return (ceip.TotalPositions)org.monet.bpi.NodeService.create(ceip.TotalPositions.class, parent);
  }
}
