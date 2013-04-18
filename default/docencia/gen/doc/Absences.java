package doc;

import doc.absences.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class Absences extends NodeCollectionImpl {
  public static Absences getInstance() {
    return (doc.Absences)org.monet.bpi.NodeService.locate("doc.Absences");
  }
  
  public Iterable<Indice> getAll() {
    return (Iterable<doc.absences.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<doc.absences.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<doc.absences.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<doc.absences.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (doc.absences.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
