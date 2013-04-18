package doc;

import doc.groups.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class Groups extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<doc.groups.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<doc.groups.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<doc.groups.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<doc.groups.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (doc.groups.Indice)genericGetFirst(where);
  }
  
  public static Groups getInstance() {
    return (doc.Groups)org.monet.bpi.NodeService.locate("doc.Groups");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
