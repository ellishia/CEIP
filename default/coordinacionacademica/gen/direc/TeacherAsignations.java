package direc;

import direc.teacherasignations.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class TeacherAsignations extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<direc.teacherasignations.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<direc.teacherasignations.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<direc.teacherasignations.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<direc.teacherasignations.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (direc.teacherasignations.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static TeacherAsignations createNew(final Node parent) {
    return (direc.TeacherAsignations)org.monet.bpi.NodeService.create(direc.TeacherAsignations.class, parent);
  }
}
