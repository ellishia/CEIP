package serv.incidents;

import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldSerial;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Incident extends NodeFormImpl {
  public FieldDate getDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("Incident", "Date"));
  }
  
  public Date getDate() {
    return ((org.monet.bpi.FieldDate)this.getField("Incident", "Date")).get();
  }
  
  public void setDate(final Date value) {
    this.getDateField().set(value);
  }
  
  public FieldSerial getIdentifierField() {
    return ((org.monet.bpi.FieldSerial)this.getField("Incident", "Identifier"));
  }
  
  public String getIdentifier() {
    return ((org.monet.bpi.FieldSerial)this.getField("Incident", "Identifier")).get();
  }
  
  public void setIdentifier(final String value) {
    this.getIdentifierField().set(value);
  }
  
  public FieldLink getBusLineField() {
    return ((org.monet.bpi.FieldLink)this.getField("Incident", "BusLine"));
  }
  
  public Link getBusLine() {
    return ((org.monet.bpi.FieldLink)this.getField("Incident", "BusLine")).get();
  }
  
  public Term getBusLineAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("Incident", "BusLine")).getAsTerm();
  }
  
  public void setBusLine(final Link value) {
    this.getBusLineField().set(value);
  }
  
  public FieldText getManagerField() {
    return ((org.monet.bpi.FieldText)this.getField("Incident", "Manager"));
  }
  
  public String getManager() {
    return ((org.monet.bpi.FieldText)this.getField("Incident", "Manager")).get();
  }
  
  public void setManager(final String value) {
    this.getManagerField().set(value);
  }
  
  public FieldText getDescriptionField() {
    return ((org.monet.bpi.FieldText)this.getField("Incident", "Description"));
  }
  
  public String getDescription() {
    return ((org.monet.bpi.FieldText)this.getField("Incident", "Description")).get();
  }
  
  public void setDescription(final String value) {
    this.getDescriptionField().set(value);
  }
  
  public FieldSelect getClasificationField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Incident", "Clasification"));
  }
  
  public Term getClasification() {
    return ((org.monet.bpi.FieldSelect)this.getField("Incident", "Clasification")).get();
  }
  
  public void setClasification(final Term value) {
    this.getClasificationField().set(value);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Incident createNew(final Node parent) {
    return (serv.incidents.Incident)org.monet.bpi.NodeService.create(serv.incidents.Incident.class, parent);
  }
}
