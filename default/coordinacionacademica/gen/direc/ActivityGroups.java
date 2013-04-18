package direc;

import java.util.ArrayList;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class ActivityGroups extends NodeFormImpl {
  public FieldMultiple<FieldLink,Link> getGroupsField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("ActivityGroups", "Groups"));
  }
  
  public ArrayList<Link> getGroups() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("ActivityGroups", "Groups")).getAll();
  }
  
  public ArrayList<Term> getGroupsAsTerm() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("ActivityGroups", "Groups")).getAllAsTerm();
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static ActivityGroups createNew(final Node parent) {
    return (direc.ActivityGroups)org.monet.bpi.NodeService.create(direc.ActivityGroups.class, parent);
  }
}
