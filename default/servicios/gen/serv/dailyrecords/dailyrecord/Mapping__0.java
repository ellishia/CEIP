package serv.dailyrecords.dailyrecord;

import org.monet.bpi.java.MappingImpl;
import serv.dailyrecords.DailyRecord;
import serv.dailyrecords.Indice;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    serv.dailyrecords.DailyRecord node = (serv.dailyrecords.DailyRecord) this.genericGetNode();
    serv.dailyrecords.Indice reference = (serv.dailyrecords.Indice) this.genericGetReference();
    reference.setDate(node.getDate());
    
  }
  
  public Indice getReference() {
    return (serv.dailyrecords.Indice) this.genericGetReference();
  }
  
  public DailyRecord getNode() {
    return (serv.dailyrecords.DailyRecord) this.genericGetNode();
  }
}
