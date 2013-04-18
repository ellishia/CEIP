package direc.parentsmeetings.parentsmeeting;

import direc.parentsmeetings.Indice;
import direc.parentsmeetings.ParentsMeeting;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.parentsmeetings.ParentsMeeting node = (direc.parentsmeetings.ParentsMeeting) this.genericGetNode();
    direc.parentsmeetings.Indice reference = (direc.parentsmeetings.Indice) this.genericGetReference();
    reference.setTitle(node.getTitle());
    reference.setDate(node.getDate());
    
  }
  
  public Indice getReference() {
    return (direc.parentsmeetings.Indice) this.genericGetReference();
  }
  
  public ParentsMeeting getNode() {
    return (direc.parentsmeetings.ParentsMeeting) this.genericGetNode();
  }
}
