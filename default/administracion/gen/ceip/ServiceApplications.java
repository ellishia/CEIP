package ceip;

import ceip.serviceapplications.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class ServiceApplications extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<ceip.serviceapplications.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<ceip.serviceapplications.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<ceip.serviceapplications.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<ceip.serviceapplications.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (ceip.serviceapplications.Indice)genericGetFirst(where);
  }
  
  public static ServiceApplications getInstance() {
    return (ceip.ServiceApplications)org.monet.bpi.NodeService.locate("ceip.ServiceApplications");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
