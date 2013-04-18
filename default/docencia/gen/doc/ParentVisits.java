package doc;

import doc.parentvisits.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class ParentVisits extends NodeCollectionImpl {
  public static ParentVisits getInstance() {
    return (doc.ParentVisits)org.monet.bpi.NodeService.locate("doc.ParentVisits");
  }
  
  public Iterable<Indice> getAll() {
    return (Iterable<doc.parentvisits.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<doc.parentvisits.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<doc.parentvisits.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<doc.parentvisits.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (doc.parentvisits.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
