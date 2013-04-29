package serv.dailyrecords;

import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;
import serv.dailyrecords.Indice;

@SuppressWarnings("all")
public class DailyRecord extends NodeFormImpl {
  public FieldDate getDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("DailyRecord", "Date"));
  }
  
  public Date getDate() {
    return ((org.monet.bpi.FieldDate)this.getField("DailyRecord", "Date")).get();
  }
  
  public void setDate(final Date value) {
    this.getDateField().set(value);
  }
  
  public FieldLink getBusLineField() {
    return ((org.monet.bpi.FieldLink)this.getField("DailyRecord", "BusLine"));
  }
  
  public Link getBusLine() {
    return ((org.monet.bpi.FieldLink)this.getField("DailyRecord", "BusLine")).get();
  }
  
  public Term getBusLineAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("DailyRecord", "BusLine")).getAsTerm();
  }
  
  public void setBusLine(final Link value) {
    this.getBusLineField().set(value);
  }
  
  public FieldText getManagerField() {
    return ((org.monet.bpi.FieldText)this.getField("DailyRecord", "Manager"));
  }
  
  public String getManager() {
    return ((org.monet.bpi.FieldText)this.getField("DailyRecord", "Manager")).get();
  }
  
  public void setManager(final String value) {
    this.getManagerField().set(value);
  }
  
  public FieldMultiple<FieldSection,Void> getAbsencesField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSection, java.lang.Void>)this.getField("DailyRecord", "Absences"));
  }
  
  public FieldText getSignatureField() {
    return ((org.monet.bpi.FieldText)this.getField("DailyRecord", "Signature"));
  }
  
  public String getSignature() {
    return ((org.monet.bpi.FieldText)this.getField("DailyRecord", "Signature")).get();
  }
  
  public void setSignature(final String value) {
    this.getSignatureField().set(value);
  }
  
  public Indice getIndice() {
    return (serv.dailyrecords.Indice)this.getIndexEntry("serv.DailyRecords.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static DailyRecord createNew(final Node parent) {
    return (serv.dailyrecords.DailyRecord)org.monet.bpi.NodeService.create(serv.dailyrecords.DailyRecord.class, parent);
  }
}
