package serv.stops;

import org.monet.bpi.FieldSerial;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import serv.stops.Indice;

@SuppressWarnings("all")
public abstract class Stop extends NodeFormImpl {
  public FieldSerial getIdField() {
    return ((org.monet.bpi.FieldSerial)this.getField("Stop", "Id"));
  }
  
  public String getId() {
    return ((org.monet.bpi.FieldSerial)this.getField("Stop", "Id")).get();
  }
  
  public void setId(final String value) {
    this.getIdField().set(value);
  }
  
  public FieldText getNameField() {
    return ((org.monet.bpi.FieldText)this.getField("Stop", "Name"));
  }
  
  public String getName() {
    return ((org.monet.bpi.FieldText)this.getField("Stop", "Name")).get();
  }
  
  public void setName(final String value) {
    this.getNameField().set(value);
  }
  
  public FieldText getAddressField() {
    return ((org.monet.bpi.FieldText)this.getField("Stop", "Address"));
  }
  
  public String getAddress() {
    return ((org.monet.bpi.FieldText)this.getField("Stop", "Address")).get();
  }
  
  public void setAddress(final String value) {
    this.getAddressField().set(value);
  }
  
  public FieldText getKmField() {
    return ((org.monet.bpi.FieldText)this.getField("Stop", "Km"));
  }
  
  public String getKm() {
    return ((org.monet.bpi.FieldText)this.getField("Stop", "Km")).get();
  }
  
  public void setKm(final String value) {
    this.getKmField().set(value);
  }
  
  public Indice getIndice() {
    return (serv.stops.Indice)this.getIndexEntry("serv.Stops.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Stop createNew(final Node parent) {
    return (serv.stops.Stop)org.monet.bpi.NodeService.create(serv.stops.Stop.class, parent);
  }
}
