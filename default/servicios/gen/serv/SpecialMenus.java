package serv;

import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;
import serv.specialmenus.Indice;

@SuppressWarnings("all")
public class SpecialMenus extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<serv.specialmenus.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<serv.specialmenus.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<serv.specialmenus.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<serv.specialmenus.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (serv.specialmenus.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static SpecialMenus createNew(final Node parent) {
    return (serv.SpecialMenus)org.monet.bpi.NodeService.create(serv.SpecialMenus.class, parent);
  }
}
