package ceip;

import ceip.academiccalendars.Index;
import org.monet.bpi.Expression;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;

@SuppressWarnings("all")
public class AcademicCalendars extends NodeCollectionImpl {
  public static AcademicCalendars getInstance() {
    return (ceip.AcademicCalendars)org.monet.bpi.NodeService.locate("ceip.AcademicCalendars");
  }
  
  public Iterable<Index> getAll() {
    return (Iterable<ceip.academiccalendars.Index>)genericGetAll();
  }
  
  public Iterable<Index> getAll(final OrderExpression orderBy) {
    return (Iterable<ceip.academiccalendars.Index>)genericGetAll(orderBy);
  }
  
  public Iterable<Index> get(final Expression where) {
    return (Iterable<ceip.academiccalendars.Index>)genericGet(where);
  }
  
  public Iterable<Index> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<ceip.academiccalendars.Index>)genericGet(where, orderBy);
  }
  
  public Index getFirst(final Expression where) {
    return (ceip.academiccalendars.Index)genericGetFirst(where);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
