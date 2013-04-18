package ceip;

import ceip.serviceapplications.ServiceApplication;
import org.monet.bpi.FieldNumber;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;

@SuppressWarnings("all")
public class TransportApplication extends ServiceApplication {
  public FieldText getAddressField() {
    return ((org.monet.bpi.FieldText)this.getField("TransportApplication", "Address"));
  }
  
  public String getAddress() {
    return ((org.monet.bpi.FieldText)this.getField("TransportApplication", "Address")).get();
  }
  
  public void setAddress(final String value) {
    this.getAddressField().set(value);
  }
  
  public FieldNumber getDistanceField() {
    return ((org.monet.bpi.FieldNumber)this.getField("TransportApplication", "Distance"));
  }
  
  public org.monet.bpi.types.Number getDistance() {
    return ((org.monet.bpi.FieldNumber)this.getField("TransportApplication", "Distance")).get();
  }
  
  public void setDistance(final org.monet.bpi.types.Number value) {
    this.getDistanceField().set(value);
  }
  
  public void setDistance(final double value) {
    this.getDistanceField().set(new org.monet.bpi.types.Number(value));
  }
  
  public FieldText getTripField() {
    return ((org.monet.bpi.FieldText)this.getField("TransportApplication", "Trip"));
  }
  
  public String getTrip() {
    return ((org.monet.bpi.FieldText)this.getField("TransportApplication", "Trip")).get();
  }
  
  public void setTrip(final String value) {
    this.getTripField().set(value);
  }
  
  public FieldText getStopField() {
    return ((org.monet.bpi.FieldText)this.getField("TransportApplication", "Stop"));
  }
  
  public String getStop() {
    return ((org.monet.bpi.FieldText)this.getField("TransportApplication", "Stop")).get();
  }
  
  public void setStop(final String value) {
    this.getStopField().set(value);
  }
  
  public FieldText getLeaveAtField() {
    return ((org.monet.bpi.FieldText)this.getField("TransportApplication", "LeaveAt"));
  }
  
  public String getLeaveAt() {
    return ((org.monet.bpi.FieldText)this.getField("TransportApplication", "LeaveAt")).get();
  }
  
  public void setLeaveAt(final String value) {
    this.getLeaveAtField().set(value);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static TransportApplication createNew(final Node parent) {
    return (ceip.TransportApplication)org.monet.bpi.NodeService.create(ceip.TransportApplication.class, parent);
  }
}
