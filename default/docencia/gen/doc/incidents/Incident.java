package doc.incidents;

import java.util.ArrayList;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Incident extends NodeFormImpl {
  public FieldText getPlaceField() {
    return ((org.monet.bpi.FieldText)this.getField("Incident", "Place"));
  }
  
  public String getPlace() {
    return ((org.monet.bpi.FieldText)this.getField("Incident", "Place")).get();
  }
  
  public void setPlace(final String value) {
    this.getPlaceField().set(value);
  }
  
  public FieldDate getDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("Incident", "Date"));
  }
  
  public Date getDate() {
    return ((org.monet.bpi.FieldDate)this.getField("Incident", "Date")).get();
  }
  
  public void setDate(final Date value) {
    this.getDateField().set(value);
  }
  
  public FieldMultiple<FieldLink,Link> getStudentField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Incident", "Student"));
  }
  
  public ArrayList<Link> getStudent() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Incident", "Student")).getAll();
  }
  
  public ArrayList<Term> getStudentAsTerm() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Incident", "Student")).getAllAsTerm();
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
  
  public FieldText getRatingField() {
    return ((org.monet.bpi.FieldText)this.getField("Incident", "Rating"));
  }
  
  public String getRating() {
    return ((org.monet.bpi.FieldText)this.getField("Incident", "Rating")).get();
  }
  
  public void setRating(final String value) {
    this.getRatingField().set(value);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Incident createNew(final Node parent) {
    return (doc.incidents.Incident)org.monet.bpi.NodeService.create(doc.incidents.Incident.class, parent);
  }
}
