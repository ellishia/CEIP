package serv.userscanteen;

import org.monet.bpi.FieldBoolean;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import serv.users.User;
import serv.userscanteen.Indice;

@SuppressWarnings("all")
public class UserCanteen extends User {
  public FieldText getAllergiesField() {
    return ((org.monet.bpi.FieldText)this.getField("UserCanteen", "Allergies"));
  }
  
  public String getAllergies() {
    return ((org.monet.bpi.FieldText)this.getField("UserCanteen", "Allergies")).get();
  }
  
  public void setAllergies(final String value) {
    this.getAllergiesField().set(value);
  }
  
  public FieldBoolean getDiabetesField() {
    return ((org.monet.bpi.FieldBoolean)this.getField("UserCanteen", "Diabetes"));
  }
  
  public boolean getDiabetes() {
    return ((org.monet.bpi.FieldBoolean)this.getField("UserCanteen", "Diabetes")).get();
  }
  
  public void setDiabetes(final boolean value) {
    this.getDiabetesField().set(value);
  }
  
  public FieldText getScheduleField() {
    return ((org.monet.bpi.FieldText)this.getField("UserCanteen", "Schedule"));
  }
  
  public String getSchedule() {
    return ((org.monet.bpi.FieldText)this.getField("UserCanteen", "Schedule")).get();
  }
  
  public void setSchedule(final String value) {
    this.getScheduleField().set(value);
  }
  
  public Indice getIndice() {
    return (serv.userscanteen.Indice)this.getIndexEntry("serv.UsersCanteen.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static UserCanteen createNew(final Node parent) {
    return (serv.userscanteen.UserCanteen)org.monet.bpi.NodeService.create(serv.userscanteen.UserCanteen.class, parent);
  }
}
