package direc.minutes;

import direc.MinuteDoc;
import direc.minutedoc.Exportador;
import direc.minutedoc.exportador.ExporterScope;
import direc.minutes.Indice;
import java.util.ArrayList;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldNode;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Acta extends NodeFormImpl {
  public FieldText getTitleField() {
    return ((org.monet.bpi.FieldText)this.getField("Acta", "Title"));
  }
  
  public String getTitle() {
    return ((org.monet.bpi.FieldText)this.getField("Acta", "Title")).get();
  }
  
  public void setTitle(final String value) {
    this.getTitleField().set(value);
  }
  
  public FieldDate getDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("Acta", "Date"));
  }
  
  public Date getDate() {
    return ((org.monet.bpi.FieldDate)this.getField("Acta", "Date")).get();
  }
  
  public void setDate(final Date value) {
    this.getDateField().set(value);
  }
  
  public FieldLink getRoomField() {
    return ((org.monet.bpi.FieldLink)this.getField("Acta", "Room"));
  }
  
  public Link getRoom() {
    return ((org.monet.bpi.FieldLink)this.getField("Acta", "Room")).get();
  }
  
  public Term getRoomAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("Acta", "Room")).getAsTerm();
  }
  
  public void setRoom(final Link value) {
    this.getRoomField().set(value);
  }
  
  public FieldMultiple<FieldLink,Link> getTeachersField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Acta", "Teachers"));
  }
  
  public ArrayList<Link> getTeachers() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Acta", "Teachers")).getAll();
  }
  
  public ArrayList<Term> getTeachersAsTerm() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Acta", "Teachers")).getAllAsTerm();
  }
  
  public FieldText getDescriptionField() {
    return ((org.monet.bpi.FieldText)this.getField("Acta", "Description"));
  }
  
  public String getDescription() {
    return ((org.monet.bpi.FieldText)this.getField("Acta", "Description")).get();
  }
  
  public void setDescription(final String value) {
    this.getDescriptionField().set(value);
  }
  
  public FieldText getAuthorField() {
    return ((org.monet.bpi.FieldText)this.getField("Acta", "Author"));
  }
  
  public String getAuthor() {
    return ((org.monet.bpi.FieldText)this.getField("Acta", "Author")).get();
  }
  
  public void setAuthor(final String value) {
    this.getAuthorField().set(value);
  }
  
  public FieldNode getMinuteDocField() {
    return ((org.monet.bpi.FieldNode)this.getField("Acta", "MinuteDoc"));
  }
  
  public Link getMinuteDoc() {
    return ((org.monet.bpi.FieldNode)this.getField("Acta", "MinuteDoc")).get();
  }
  
  public Term getMinuteDocAsTerm() {
    return ((org.monet.bpi.FieldNode)this.getField("Acta", "MinuteDoc")).getAsTerm();
  }
  
  public void setMinuteDoc(final Link value) {
    this.getMinuteDocField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.minutes.Indice)this.getIndexEntry("direc.Minutes.Indice");
  }
  
  public void onCreateMinute() {
    ExporterScope _doExportOf = Exportador.doExportOf(this);
    FieldNode _minuteDocField = this.getMinuteDocField();
    MinuteDoc _node = _minuteDocField.<MinuteDoc>getNode();
    _doExportOf.toDocument(_node);
  }
  
  public void executeCommand(final String operation) {
    if(operation.equals("CreateMinute")) {
    	this.onCreateMinute();
    }super.executeCommand(operation);
  }
  
  public static Acta createNew(final Node parent) {
    return (direc.minutes.Acta)org.monet.bpi.NodeService.create(direc.minutes.Acta.class, parent);
  }
}
