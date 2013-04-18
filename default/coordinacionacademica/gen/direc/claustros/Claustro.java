package direc.claustros;

import direc.ClaustroDoc;
import direc.claustrodoc.Exportador;
import direc.claustrodoc.exportador.ExporterScope;
import direc.claustros.Indice;
import java.util.ArrayList;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldNode;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Claustro extends NodeFormImpl {
  public FieldText getTitleField() {
    return ((org.monet.bpi.FieldText)this.getField("Claustro", "Title"));
  }
  
  public String getTitle() {
    return ((org.monet.bpi.FieldText)this.getField("Claustro", "Title")).get();
  }
  
  public void setTitle(final String value) {
    this.getTitleField().set(value);
  }
  
  public FieldDate getDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("Claustro", "Date"));
  }
  
  public Date getDate() {
    return ((org.monet.bpi.FieldDate)this.getField("Claustro", "Date")).get();
  }
  
  public void setDate(final Date value) {
    this.getDateField().set(value);
  }
  
  public FieldSelect getTrimesterField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Claustro", "Trimester"));
  }
  
  public Term getTrimester() {
    return ((org.monet.bpi.FieldSelect)this.getField("Claustro", "Trimester")).get();
  }
  
  public void setTrimester(final Term value) {
    this.getTrimesterField().set(value);
  }
  
  public FieldLink getRoomField() {
    return ((org.monet.bpi.FieldLink)this.getField("Claustro", "Room"));
  }
  
  public Link getRoom() {
    return ((org.monet.bpi.FieldLink)this.getField("Claustro", "Room")).get();
  }
  
  public Term getRoomAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("Claustro", "Room")).getAsTerm();
  }
  
  public void setRoom(final Link value) {
    this.getRoomField().set(value);
  }
  
  public FieldLink getDayOrderField() {
    return ((org.monet.bpi.FieldLink)this.getField("Claustro", "DayOrder"));
  }
  
  public Link getDayOrder() {
    return ((org.monet.bpi.FieldLink)this.getField("Claustro", "DayOrder")).get();
  }
  
  public Term getDayOrderAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("Claustro", "DayOrder")).getAsTerm();
  }
  
  public void setDayOrder(final Link value) {
    this.getDayOrderField().set(value);
  }
  
  public FieldLink getMinuteField() {
    return ((org.monet.bpi.FieldLink)this.getField("Claustro", "Minute"));
  }
  
  public Link getMinute() {
    return ((org.monet.bpi.FieldLink)this.getField("Claustro", "Minute")).get();
  }
  
  public Term getMinuteAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("Claustro", "Minute")).getAsTerm();
  }
  
  public void setMinute(final Link value) {
    this.getMinuteField().set(value);
  }
  
  public FieldMultiple<FieldLink,Link> getTeachersField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Claustro", "Teachers"));
  }
  
  public ArrayList<Link> getTeachers() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Claustro", "Teachers")).getAll();
  }
  
  public ArrayList<Term> getTeachersAsTerm() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Claustro", "Teachers")).getAllAsTerm();
  }
  
  public FieldNode getClaustroDocField() {
    return ((org.monet.bpi.FieldNode)this.getField("Claustro", "ClaustroDoc"));
  }
  
  public Link getClaustroDoc() {
    return ((org.monet.bpi.FieldNode)this.getField("Claustro", "ClaustroDoc")).get();
  }
  
  public Term getClaustroDocAsTerm() {
    return ((org.monet.bpi.FieldNode)this.getField("Claustro", "ClaustroDoc")).getAsTerm();
  }
  
  public void setClaustroDoc(final Link value) {
    this.getClaustroDocField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.claustros.Indice)this.getIndexEntry("direc.Claustros.Indice");
  }
  
  public void onOperationName() {
    ExporterScope _doExportOf = Exportador.doExportOf(this);
    FieldNode _claustroDocField = this.getClaustroDocField();
    ClaustroDoc _node = _claustroDocField.<ClaustroDoc>getNode();
    _doExportOf.toDocument(_node);
  }
  
  public void executeCommand(final String operation) {
    if(operation.equals("OperationName")) {
    	this.onOperationName();
    }super.executeCommand(operation);
  }
  
  public static Claustro createNew(final Node parent) {
    return (direc.claustros.Claustro)org.monet.bpi.NodeService.create(direc.claustros.Claustro.class, parent);
  }
}
