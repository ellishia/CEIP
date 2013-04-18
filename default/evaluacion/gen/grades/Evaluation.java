package grades;

import org.monet.bpi.java.NodeDesktopImpl;

@SuppressWarnings(value = "all")
public class Evaluation extends NodeDesktopImpl {
  public static Evaluation getInstance() {
    return (grades.Evaluation)org.monet.bpi.NodeService.locate("grades.Evaluation");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
