package ceip;

import ceip.procesos.StudentTransfer;
import ceip.students.Index;
import org.monet.bpi.ClientService;
import org.monet.bpi.Expression;
import org.monet.bpi.MonetLink;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class Students extends NodeCollectionImpl {
  public static Students getInstance() {
    return (ceip.Students)org.monet.bpi.NodeService.locate("ceip.Students");
  }
  
  public Iterable<Index> getAll() {
    return (Iterable<ceip.students.Index>)genericGetAll();
  }
  
  public Iterable<Index> getAll(final OrderExpression orderBy) {
    return (Iterable<ceip.students.Index>)genericGetAll(orderBy);
  }
  
  public Iterable<Index> get(final Expression where) {
    return (Iterable<ceip.students.Index>)genericGet(where);
  }
  
  public Iterable<Index> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<ceip.students.Index>)genericGet(where, orderBy);
  }
  
  public Index getFirst(final Expression where) {
    return (ceip.students.Index)genericGetFirst(where);
  }
  
  public void onOperacionTramitar() {
    StudentTransfer listado = StudentTransfer.createNew();
    listado.resume();
    String _id = listado.getId();
    MonetLink _forTask = MonetLink.forTask(_id);
    ClientService.redirectUserTo(_forTask);
  }
  
  public void executeCommand(final String operation) {
    if(operation.equals("OperacionTramitar")) {
    	this.onOperacionTramitar();
    }super.executeCommand(operation);
  }
}
