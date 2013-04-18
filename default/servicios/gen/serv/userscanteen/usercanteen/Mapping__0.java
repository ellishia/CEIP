package serv.userscanteen.usercanteen;

import org.monet.bpi.java.MappingImpl;
import serv.userscanteen.Indice;
import serv.userscanteen.UserCanteen;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    serv.userscanteen.UserCanteen node = (serv.userscanteen.UserCanteen) this.genericGetNode();
    serv.userscanteen.Indice reference = (serv.userscanteen.Indice) this.genericGetReference();
    reference.setSchedule(node.getSchedule());
    
  }
  
  public Indice getReference() {
    return (serv.userscanteen.Indice) this.genericGetReference();
  }
  
  public UserCanteen getNode() {
    return (serv.userscanteen.UserCanteen) this.genericGetNode();
  }
}
