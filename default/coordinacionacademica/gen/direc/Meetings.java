package direc;

import direc.Claustros;
import direc.EvaluationSesions;
import direc.ParentsMeetings;
import org.monet.bpi.java.NodeContainerImpl;

@SuppressWarnings("all")
public class Meetings extends NodeContainerImpl {
  public static Meetings getInstance() {
    return (direc.Meetings)org.monet.bpi.NodeService.locate("direc.Meetings");
  }
  
  public EvaluationSesions getEvaluationSesions() {
    return (direc.EvaluationSesions)this.getChildNode("direc.EvaluationSesions");
  }
  
  public Claustros getClaustros() {
    return (direc.Claustros)this.getChildNode("direc.Claustros");
  }
  
  public ParentsMeetings getParentsMeetings() {
    return (direc.ParentsMeetings)this.getChildNode("direc.ParentsMeetings");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
