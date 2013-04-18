package solicitud;

import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;
import solicitud.serviceapplications.Indice;

@SuppressWarnings("all")
public class ServiceApplications extends NodeCollectionImpl {
  public static ServiceApplications getInstance() {
    return (solicitud.ServiceApplications)org.monet.bpi.NodeService.locate("solicitud.ServiceApplications");
  }
  
  public Iterable<Indice> getAll() {
    return (Iterable<solicitud.serviceapplications.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<solicitud.serviceapplications.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<solicitud.serviceapplications.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<solicitud.serviceapplications.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (solicitud.serviceapplications.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
