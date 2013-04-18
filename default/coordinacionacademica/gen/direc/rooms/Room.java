package direc.rooms;

import direc.rooms.Indice;
import org.monet.bpi.FieldNumber;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;

@SuppressWarnings("all")
public class Room extends NodeFormImpl {
  public FieldText getNombreField() {
    return ((org.monet.bpi.FieldText)this.getField("Room", "Nombre"));
  }
  
  public String getNombre() {
    return ((org.monet.bpi.FieldText)this.getField("Room", "Nombre")).get();
  }
  
  public void setNombre(final String value) {
    this.getNombreField().set(value);
  }
  
  public FieldText getPlacementField() {
    return ((org.monet.bpi.FieldText)this.getField("Room", "Placement"));
  }
  
  public String getPlacement() {
    return ((org.monet.bpi.FieldText)this.getField("Room", "Placement")).get();
  }
  
  public void setPlacement(final String value) {
    this.getPlacementField().set(value);
  }
  
  public FieldNumber getCapacityField() {
    return ((org.monet.bpi.FieldNumber)this.getField("Room", "Capacity"));
  }
  
  public org.monet.bpi.types.Number getCapacity() {
    return ((org.monet.bpi.FieldNumber)this.getField("Room", "Capacity")).get();
  }
  
  public void setCapacity(final org.monet.bpi.types.Number value) {
    this.getCapacityField().set(value);
  }
  
  public void setCapacity(final double value) {
    this.getCapacityField().set(new org.monet.bpi.types.Number(value));
  }
  
  public Indice getIndice() {
    return (direc.rooms.Indice)this.getIndexEntry("direc.Rooms.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Room createNew(final Node parent) {
    return (direc.rooms.Room)org.monet.bpi.NodeService.create(direc.rooms.Room.class, parent);
  }
}
