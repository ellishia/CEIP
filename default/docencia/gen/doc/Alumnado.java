package doc;

import doc.alumnado.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class Alumnado extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<doc.alumnado.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<doc.alumnado.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<doc.alumnado.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<doc.alumnado.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (doc.alumnado.Indice)genericGetFirst(where);
  }
  
  public static Alumnado getInstance() {
    return (doc.Alumnado)org.monet.bpi.NodeService.locate("doc.Alumnado");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
