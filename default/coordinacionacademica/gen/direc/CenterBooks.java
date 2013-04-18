package direc;

import direc.centerbooks.Indice;
import direc.procesos.AnadirEjemplar;
import org.monet.bpi.ClientService;
import org.monet.bpi.Expression;
import org.monet.bpi.MonetLink;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class CenterBooks extends NodeCollectionImpl {
  public static CenterBooks getInstance() {
    return (direc.CenterBooks)org.monet.bpi.NodeService.locate("direc.CenterBooks");
  }
  
  public Iterable<Indice> getAll() {
    return (Iterable<direc.centerbooks.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<direc.centerbooks.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<direc.centerbooks.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<direc.centerbooks.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (direc.centerbooks.Indice)genericGetFirst(where);
  }
  
  public void onExemplairAddition() {
    AnadirEjemplar tarea = AnadirEjemplar.createNew();
    tarea.save();
    tarea.resume();
    String _id = tarea.getId();
    MonetLink _forTask = MonetLink.forTask(_id);
    ClientService.redirectUserTo(_forTask);
  }
  
  public void executeCommand(final String operation) {
    if(operation.equals("ExemplairAddition")) {
    	this.onExemplairAddition();
    }super.executeCommand(operation);
  }
}
