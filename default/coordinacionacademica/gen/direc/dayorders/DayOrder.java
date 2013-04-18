package direc.dayorders;

import direc.dayorders.Indice;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;

@SuppressWarnings("all")
public class DayOrder extends NodeFormImpl {
  public FieldText getTitleField() {
    return ((org.monet.bpi.FieldText)this.getField("DayOrder", "Title"));
  }
  
  public String getTitle() {
    return ((org.monet.bpi.FieldText)this.getField("DayOrder", "Title")).get();
  }
  
  public void setTitle(final String value) {
    this.getTitleField().set(value);
  }
  
  public FieldText getTopicsField() {
    return ((org.monet.bpi.FieldText)this.getField("DayOrder", "Topics"));
  }
  
  public String getTopics() {
    return ((org.monet.bpi.FieldText)this.getField("DayOrder", "Topics")).get();
  }
  
  public void setTopics(final String value) {
    this.getTopicsField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.dayorders.Indice)this.getIndexEntry("direc.DayOrders.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static DayOrder createNew(final Node parent) {
    return (direc.dayorders.DayOrder)org.monet.bpi.NodeService.create(direc.dayorders.DayOrder.class, parent);
  }
}
