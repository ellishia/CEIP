package direc.parentsmeetings;

import direc.ParentsMDoc;
import direc.parentsmdoc.Exportador;
import direc.parentsmdoc.exportador.ExporterScope;
import direc.parentsmeetings.Indice;
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
public class ParentsMeeting extends NodeFormImpl {
  public FieldText getTitleField() {
    return ((org.monet.bpi.FieldText)this.getField("ParentsMeeting", "Title"));
  }
  
  public String getTitle() {
    return ((org.monet.bpi.FieldText)this.getField("ParentsMeeting", "Title")).get();
  }
  
  public void setTitle(final String value) {
    this.getTitleField().set(value);
  }
  
  public FieldDate getDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("ParentsMeeting", "Date"));
  }
  
  public Date getDate() {
    return ((org.monet.bpi.FieldDate)this.getField("ParentsMeeting", "Date")).get();
  }
  
  public void setDate(final Date value) {
    this.getDateField().set(value);
  }
  
  public FieldLink getGroupField() {
    return ((org.monet.bpi.FieldLink)this.getField("ParentsMeeting", "Group"));
  }
  
  public Link getGroup() {
    return ((org.monet.bpi.FieldLink)this.getField("ParentsMeeting", "Group")).get();
  }
  
  public Term getGroupAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("ParentsMeeting", "Group")).getAsTerm();
  }
  
  public void setGroup(final Link value) {
    this.getGroupField().set(value);
  }
  
  public FieldLink getRoomField() {
    return ((org.monet.bpi.FieldLink)this.getField("ParentsMeeting", "Room"));
  }
  
  public Link getRoom() {
    return ((org.monet.bpi.FieldLink)this.getField("ParentsMeeting", "Room")).get();
  }
  
  public Term getRoomAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("ParentsMeeting", "Room")).getAsTerm();
  }
  
  public void setRoom(final Link value) {
    this.getRoomField().set(value);
  }
  
  public FieldMultiple<FieldLink,Link> getTeachersField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("ParentsMeeting", "Teachers"));
  }
  
  public ArrayList<Link> getTeachers() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("ParentsMeeting", "Teachers")).getAll();
  }
  
  public ArrayList<Term> getTeachersAsTerm() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("ParentsMeeting", "Teachers")).getAllAsTerm();
  }
  
  public FieldText getDescriptionField() {
    return ((org.monet.bpi.FieldText)this.getField("ParentsMeeting", "Description"));
  }
  
  public String getDescription() {
    return ((org.monet.bpi.FieldText)this.getField("ParentsMeeting", "Description")).get();
  }
  
  public void setDescription(final String value) {
    this.getDescriptionField().set(value);
  }
  
  public FieldText getObservationsField() {
    return ((org.monet.bpi.FieldText)this.getField("ParentsMeeting", "Observations"));
  }
  
  public String getObservations() {
    return ((org.monet.bpi.FieldText)this.getField("ParentsMeeting", "Observations")).get();
  }
  
  public void setObservations(final String value) {
    this.getObservationsField().set(value);
  }
  
  public FieldNode getReunionDocField() {
    return ((org.monet.bpi.FieldNode)this.getField("ParentsMeeting", "ReunionDoc"));
  }
  
  public Link getReunionDoc() {
    return ((org.monet.bpi.FieldNode)this.getField("ParentsMeeting", "ReunionDoc")).get();
  }
  
  public Term getReunionDocAsTerm() {
    return ((org.monet.bpi.FieldNode)this.getField("ParentsMeeting", "ReunionDoc")).getAsTerm();
  }
  
  public void setReunionDoc(final Link value) {
    this.getReunionDocField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.parentsmeetings.Indice)this.getIndexEntry("direc.ParentsMeetings.Indice");
  }
  
  public void onOperationName() {
    ExporterScope _doExportOf = Exportador.doExportOf(this);
    FieldNode _reunionDocField = this.getReunionDocField();
    ParentsMDoc _node = _reunionDocField.<ParentsMDoc>getNode();
    _doExportOf.toDocument(_node);
  }
  
  public void executeCommand(final String operation) {
    if(operation.equals("OperationName")) {
    	this.onOperationName();
    }super.executeCommand(operation);
  }
  
  public static ParentsMeeting createNew(final Node parent) {
    return (direc.parentsmeetings.ParentsMeeting)org.monet.bpi.NodeService.create(direc.parentsmeetings.ParentsMeeting.class, parent);
  }
}
