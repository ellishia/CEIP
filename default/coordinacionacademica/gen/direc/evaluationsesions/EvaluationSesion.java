package direc.evaluationsesions;

import direc.EvaluationDoc;
import direc.evaluationdoc.Exportador;
import direc.evaluationdoc.exportador.ExporterScope;
import direc.evaluationsesions.Indice;
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
public class EvaluationSesion extends NodeFormImpl {
  public FieldText getTitleField() {
    return ((org.monet.bpi.FieldText)this.getField("EvaluationSesion", "Title"));
  }
  
  public String getTitle() {
    return ((org.monet.bpi.FieldText)this.getField("EvaluationSesion", "Title")).get();
  }
  
  public void setTitle(final String value) {
    this.getTitleField().set(value);
  }
  
  public FieldDate getDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("EvaluationSesion", "Date"));
  }
  
  public Date getDate() {
    return ((org.monet.bpi.FieldDate)this.getField("EvaluationSesion", "Date")).get();
  }
  
  public void setDate(final Date value) {
    this.getDateField().set(value);
  }
  
  public FieldSelect getTrimesterField() {
    return ((org.monet.bpi.FieldSelect)this.getField("EvaluationSesion", "Trimester"));
  }
  
  public Term getTrimester() {
    return ((org.monet.bpi.FieldSelect)this.getField("EvaluationSesion", "Trimester")).get();
  }
  
  public void setTrimester(final Term value) {
    this.getTrimesterField().set(value);
  }
  
  public FieldLink getRoomField() {
    return ((org.monet.bpi.FieldLink)this.getField("EvaluationSesion", "Room"));
  }
  
  public Link getRoom() {
    return ((org.monet.bpi.FieldLink)this.getField("EvaluationSesion", "Room")).get();
  }
  
  public Term getRoomAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("EvaluationSesion", "Room")).getAsTerm();
  }
  
  public void setRoom(final Link value) {
    this.getRoomField().set(value);
  }
  
  public FieldLink getGroupField() {
    return ((org.monet.bpi.FieldLink)this.getField("EvaluationSesion", "Group"));
  }
  
  public Link getGroup() {
    return ((org.monet.bpi.FieldLink)this.getField("EvaluationSesion", "Group")).get();
  }
  
  public Term getGroupAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("EvaluationSesion", "Group")).getAsTerm();
  }
  
  public void setGroup(final Link value) {
    this.getGroupField().set(value);
  }
  
  public FieldMultiple<FieldLink,Link> getTeachersField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("EvaluationSesion", "Teachers"));
  }
  
  public ArrayList<Link> getTeachers() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("EvaluationSesion", "Teachers")).getAll();
  }
  
  public ArrayList<Term> getTeachersAsTerm() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("EvaluationSesion", "Teachers")).getAllAsTerm();
  }
  
  public FieldNode getEvaluationDocField() {
    return ((org.monet.bpi.FieldNode)this.getField("EvaluationSesion", "EvaluationDoc"));
  }
  
  public Link getEvaluationDoc() {
    return ((org.monet.bpi.FieldNode)this.getField("EvaluationSesion", "EvaluationDoc")).get();
  }
  
  public Term getEvaluationDocAsTerm() {
    return ((org.monet.bpi.FieldNode)this.getField("EvaluationSesion", "EvaluationDoc")).getAsTerm();
  }
  
  public void setEvaluationDoc(final Link value) {
    this.getEvaluationDocField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.evaluationsesions.Indice)this.getIndexEntry("direc.EvaluationSesions.Indice");
  }
  
  public void onOperationName() {
    ExporterScope _doExportOf = Exportador.doExportOf(this);
    FieldNode _evaluationDocField = this.getEvaluationDocField();
    EvaluationDoc _node = _evaluationDocField.<EvaluationDoc>getNode();
    _doExportOf.toDocument(_node);
  }
  
  public void executeCommand(final String operation) {
    if(operation.equals("OperationName")) {
    	this.onOperationName();
    }super.executeCommand(operation);
  }
  
  public static EvaluationSesion createNew(final Node parent) {
    return (direc.evaluationsesions.EvaluationSesion)org.monet.bpi.NodeService.create(direc.evaluationsesions.EvaluationSesion.class, parent);
  }
}
