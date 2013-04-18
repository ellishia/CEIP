package direc;

import java.util.ArrayList;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class ActivityTeachers extends NodeFormImpl {
  public FieldMultiple<FieldLink,Link> getTeachersField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("ActivityTeachers", "Teachers"));
  }
  
  public ArrayList<Link> getTeachers() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("ActivityTeachers", "Teachers")).getAll();
  }
  
  public ArrayList<Term> getTeachersAsTerm() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("ActivityTeachers", "Teachers")).getAllAsTerm();
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static ActivityTeachers createNew(final Node parent) {
    return (direc.ActivityTeachers)org.monet.bpi.NodeService.create(direc.ActivityTeachers.class, parent);
  }
}
