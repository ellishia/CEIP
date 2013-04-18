package direc.activityfile;

import direc.ActivityFile;
import direc.activities.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.ActivityFile node = (direc.ActivityFile) this.genericGetNode();
    direc.activities.Indice reference = (direc.activities.Indice) this.genericGetReference();
    reference.setName(node.getName());
    
  }
  
  public Indice getReference() {
    return (direc.activities.Indice) this.genericGetReference();
  }
  
  public ActivityFile getNode() {
    return (direc.ActivityFile) this.genericGetNode();
  }
}
