package ceip;

import ceip.studentdatas.Indice;
import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class StudentDatas extends NodeCollectionImpl {
  public Iterable<Indice> getAll() {
    return (Iterable<ceip.studentdatas.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<ceip.studentdatas.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<ceip.studentdatas.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<ceip.studentdatas.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (ceip.studentdatas.Indice)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static StudentDatas createNew(final Node parent) {
    return (ceip.StudentDatas)org.monet.bpi.NodeService.create(ceip.StudentDatas.class, parent);
  }
}
