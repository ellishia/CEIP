package direc.dayorders.dayorder;

import direc.dayorders.DayOrder;
import direc.dayorders.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.dayorders.DayOrder node = (direc.dayorders.DayOrder) this.genericGetNode();
    direc.dayorders.Indice reference = (direc.dayorders.Indice) this.genericGetReference();
    reference.setTitle(node.getTitle());
    
  }
  
  public Indice getReference() {
    return (direc.dayorders.Indice) this.genericGetReference();
  }
  
  public DayOrder getNode() {
    return (direc.dayorders.DayOrder) this.genericGetNode();
  }
}
