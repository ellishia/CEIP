package ceip;

import ceip.applications.Indice;
import ceip.procesos.StudentNewlyAdmited;
import org.monet.bpi.ClientService;
import org.monet.bpi.Expression;
import org.monet.bpi.MonetLink;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class Applications extends NodeCollectionImpl {
  public static Applications getInstance() {
    return (ceip.Applications)org.monet.bpi.NodeService.locate("ceip.Applications");
  }
  
  public Iterable<Indice> getAll() {
    return (Iterable<ceip.applications.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<ceip.applications.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<ceip.applications.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<ceip.applications.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (ceip.applications.Indice)genericGetFirst(where);
  }
  
  public void onNuevosAlumnos() {
    StudentNewlyAdmited listado = StudentNewlyAdmited.createNew();
    listado.resume();
    String _id = listado.getId();
    MonetLink _forTask = MonetLink.forTask(_id);
    ClientService.redirectUserTo(_forTask);
  }
  
  public void executeCommand(final String operation) {
    if(operation.equals("NuevosAlumnos")) {
    	this.onNuevosAlumnos();
    }super.executeCommand(operation);
  }
}
