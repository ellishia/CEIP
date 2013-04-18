package direc;

import direc.ActivityFile;
import direc.ActivityGroups;
import direc.ActivityTeachers;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeContainerImpl;

@SuppressWarnings("all")
public class Activity extends NodeContainerImpl {
  public ActivityFile getActivityFile() {
    return (direc.ActivityFile)this.getChildNode("direc.ActivityFile");
  }
  
  public ActivityGroups getActivityGroups() {
    return (direc.ActivityGroups)this.getChildNode("direc.ActivityGroups");
  }
  
  public ActivityTeachers getActivityTeachers() {
    return (direc.ActivityTeachers)this.getChildNode("direc.ActivityTeachers");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Activity createNew(final Node parent) {
    return (direc.Activity)org.monet.bpi.NodeService.create(direc.Activity.class, parent);
  }
}
