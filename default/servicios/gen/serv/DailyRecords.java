package serv;

import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;
import serv.dailyrecords.Indice;

@SuppressWarnings("all")
public class DailyRecords extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<serv.dailyrecords.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<serv.dailyrecords.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<serv.dailyrecords.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<serv.dailyrecords.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (serv.dailyrecords.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static DailyRecords createNew(final Node parent) {
    return (serv.DailyRecords)org.monet.bpi.NodeService.create(serv.DailyRecords.class, parent);
  }
}
