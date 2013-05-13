package doc;

import doc.procesos.AnadirAsignaturas;
import doc.subjectlevels.Indice;
import org.monet.bpi.ClientService;
import org.monet.bpi.Expression;
import org.monet.bpi.MonetLink;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class SubjectLevels extends NodeCollectionImpl {
  public static SubjectLevels getInstance() {
    return (doc.SubjectLevels)org.monet.bpi.NodeService.locate("doc.SubjectLevels");
  }
  
  public Iterable<Indice> getAll() {
    return (Iterable<doc.subjectlevels.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<doc.subjectlevels.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<doc.subjectlevels.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<doc.subjectlevels.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (doc.subjectlevels.Indice)genericGetFirst(where);
  }
  
  public void onAddSubjects() {
    AnadirAsignaturas tarea = AnadirAsignaturas.createNew();
    tarea.save();
    tarea.resume();
    String _id = tarea.getId();
    MonetLink _forTask = MonetLink.forTask(_id);
    ClientService.redirectUserTo(_forTask);
  }
  
  public void executeCommand(final String operation) {
    if(operation.equals("AddSubjects")) {
    	this.onAddSubjects();
    }super.executeCommand(operation);
  }
}
