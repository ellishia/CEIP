package serv.buslines;

import java.util.ArrayList;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldSerial;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Term;
import serv.buslines.Indice;

@SuppressWarnings("all")
public class Busline extends NodeFormImpl {
  public FieldSerial getIdField() {
    return ((org.monet.bpi.FieldSerial)this.getField("Busline", "Id"));
  }
  
  public String getId() {
    return ((org.monet.bpi.FieldSerial)this.getField("Busline", "Id")).get();
  }
  
  public void setId(final String value) {
    this.getIdField().set(value);
  }
  
  public FieldText getNameField() {
    return ((org.monet.bpi.FieldText)this.getField("Busline", "Name"));
  }
  
  public String getName() {
    return ((org.monet.bpi.FieldText)this.getField("Busline", "Name")).get();
  }
  
  public void setName(final String value) {
    this.getNameField().set(value);
  }
  
  public FieldMultiple<FieldSelect,Term> getStopsField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSelect, org.monet.bpi.types.Term>)this.getField("Busline", "Stops"));
  }
  
  public ArrayList<Term> getStops() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSelect, org.monet.bpi.types.Term>)this.getField("Busline", "Stops")).getAll();
  }
  
  public FieldMultiple<FieldText,String> getManagerField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldText, java.lang.String>)this.getField("Busline", "Manager"));
  }
  
  public ArrayList<String> getManager() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldText, java.lang.String>)this.getField("Busline", "Manager")).getAll();
  }
  
  public FieldText getAuxiliarField() {
    return ((org.monet.bpi.FieldText)this.getField("Busline", "Auxiliar"));
  }
  
  public String getAuxiliar() {
    return ((org.monet.bpi.FieldText)this.getField("Busline", "Auxiliar")).get();
  }
  
  public void setAuxiliar(final String value) {
    this.getAuxiliarField().set(value);
  }
  
  public FieldSection getDatesField() {
    return ((org.monet.bpi.FieldSection)this.getField("Busline", "Dates"));
  }
  
  public FieldText getScheduleField() {
    return ((org.monet.bpi.FieldText)this.getField("Busline", "Schedule"));
  }
  
  public String getSchedule() {
    return ((org.monet.bpi.FieldText)this.getField("Busline", "Schedule")).get();
  }
  
  public void setSchedule(final String value) {
    this.getScheduleField().set(value);
  }
  
  public FieldText getDirectionField() {
    return ((org.monet.bpi.FieldText)this.getField("Busline", "Direction"));
  }
  
  public String getDirection() {
    return ((org.monet.bpi.FieldText)this.getField("Busline", "Direction")).get();
  }
  
  public void setDirection(final String value) {
    this.getDirectionField().set(value);
  }
  
  public Indice getIndice() {
    return (serv.buslines.Indice)this.getIndexEntry("serv.Buslines.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Busline createNew(final Node parent) {
    return (serv.buslines.Busline)org.monet.bpi.NodeService.create(serv.buslines.Busline.class, parent);
  }
}
