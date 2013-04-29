package ceip;

import ceip.serviceapplications.ServiceApplication;
import java.util.ArrayList;
import org.monet.bpi.FieldBoolean;
import org.monet.bpi.FieldFile;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.types.File;

@SuppressWarnings("all")
public class CanteenApplication extends ServiceApplication {
  public FieldText getScheduleField() {
    return ((org.monet.bpi.FieldText)this.getField("CanteenApplication", "Schedule"));
  }
  
  public String getSchedule() {
    return ((org.monet.bpi.FieldText)this.getField("CanteenApplication", "Schedule")).get();
  }
  
  public void setSchedule(final String value) {
    this.getScheduleField().set(value);
  }
  
  public FieldBoolean getActualPositionField() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "ActualPosition"));
  }
  
  public boolean getActualPosition() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "ActualPosition")).get();
  }
  
  public void setActualPosition(final boolean value) {
    this.getActualPositionField().set(value);
  }
  
  public FieldBoolean getSubsidizedField() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "Subsidized"));
  }
  
  public boolean getSubsidized() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "Subsidized")).get();
  }
  
  public void setSubsidized(final boolean value) {
    this.getSubsidizedField().set(value);
  }
  
  public FieldSection getCriteriaField() {
    return ((org.monet.bpi.FieldSection)this.getField("CanteenApplication", "Criteria"));
  }
  
  public FieldText getObservationsField() {
    return ((org.monet.bpi.FieldText)this.getField("CanteenApplication", "Observations"));
  }
  
  public String getObservations() {
    return ((org.monet.bpi.FieldText)this.getField("CanteenApplication", "Observations")).get();
  }
  
  public void setObservations(final String value) {
    this.getObservationsField().set(value);
  }
  
  public FieldMultiple<FieldFile,File> getDocumentsField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldFile, org.monet.bpi.types.File>)this.getField("CanteenApplication", "Documents"));
  }
  
  public ArrayList<File> getDocuments() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldFile, org.monet.bpi.types.File>)this.getField("CanteenApplication", "Documents")).getAll();
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static CanteenApplication createNew(final Node parent) {
    return (ceip.CanteenApplication)org.monet.bpi.NodeService.create(ceip.CanteenApplication.class, parent);
  }
}
