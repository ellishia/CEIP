package direc;

import direc.activities.Indice;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;

@SuppressWarnings("all")
public class ActivityFile extends NodeFormImpl {
  public FieldDate getStartDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("ActivityFile", "StartDate"));
  }
  
  public Date getStartDate() {
    return ((org.monet.bpi.FieldDate)this.getField("ActivityFile", "StartDate")).get();
  }
  
  public void setStartDate(final Date value) {
    this.getStartDateField().set(value);
  }
  
  public FieldDate getEndDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("ActivityFile", "EndDate"));
  }
  
  public Date getEndDate() {
    return ((org.monet.bpi.FieldDate)this.getField("ActivityFile", "EndDate")).get();
  }
  
  public void setEndDate(final Date value) {
    this.getEndDateField().set(value);
  }
  
  public FieldText getDescriptionField() {
    return ((org.monet.bpi.FieldText)this.getField("ActivityFile", "Description"));
  }
  
  public String getDescription() {
    return ((org.monet.bpi.FieldText)this.getField("ActivityFile", "Description")).get();
  }
  
  public void setDescription(final String value) {
    this.getDescriptionField().set(value);
  }
  
  public FieldText getNameField() {
    return ((org.monet.bpi.FieldText)this.getField("ActivityFile", "Name"));
  }
  
  public String getName() {
    return ((org.monet.bpi.FieldText)this.getField("ActivityFile", "Name")).get();
  }
  
  public void setName(final String value) {
    this.getNameField().set(value);
  }
  
  public FieldText getEducationalValuesField() {
    return ((org.monet.bpi.FieldText)this.getField("ActivityFile", "EducationalValues"));
  }
  
  public String getEducationalValues() {
    return ((org.monet.bpi.FieldText)this.getField("ActivityFile", "EducationalValues")).get();
  }
  
  public void setEducationalValues(final String value) {
    this.getEducationalValuesField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.activities.Indice)this.getIndexEntry("direc.Activities.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static ActivityFile createNew(final Node parent) {
    return (direc.ActivityFile)org.monet.bpi.NodeService.create(direc.ActivityFile.class, parent);
  }
}
