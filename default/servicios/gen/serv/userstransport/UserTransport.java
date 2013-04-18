package serv.userstransport;

import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;
import serv.users.User;
import serv.userstransport.Indice;

@SuppressWarnings("all")
public class UserTransport extends User {
  public FieldText getMedicalIssuesField() {
    return ((org.monet.bpi.FieldText)this.getField("UserTransport", "MedicalIssues"));
  }
  
  public String getMedicalIssues() {
    return ((org.monet.bpi.FieldText)this.getField("UserTransport", "MedicalIssues")).get();
  }
  
  public void setMedicalIssues(final String value) {
    this.getMedicalIssuesField().set(value);
  }
  
  public FieldLink getBuslineField() {
    return ((org.monet.bpi.FieldLink)this.getField("UserTransport", "Busline"));
  }
  
  public Link getBusline() {
    return ((org.monet.bpi.FieldLink)this.getField("UserTransport", "Busline")).get();
  }
  
  public Term getBuslineAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("UserTransport", "Busline")).getAsTerm();
  }
  
  public void setBusline(final Link value) {
    this.getBuslineField().set(value);
  }
  
  public FieldSelect getStopField() {
    return ((org.monet.bpi.FieldSelect)this.getField("UserTransport", "Stop"));
  }
  
  public Term getStop() {
    return ((org.monet.bpi.FieldSelect)this.getField("UserTransport", "Stop")).get();
  }
  
  public void setStop(final Term value) {
    this.getStopField().set(value);
  }
  
  public Indice getIndice() {
    return (serv.userstransport.Indice)this.getIndexEntry("serv.UsersTransport.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static UserTransport createNew(final Node parent) {
    return (serv.userstransport.UserTransport)org.monet.bpi.NodeService.create(serv.userstransport.UserTransport.class, parent);
  }
}
