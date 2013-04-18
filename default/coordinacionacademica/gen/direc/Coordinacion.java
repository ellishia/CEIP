package direc;

import org.monet.bpi.java.NodeDesktopImpl;

@SuppressWarnings("all")
public class Coordinacion extends NodeDesktopImpl {
  public static Coordinacion getInstance() {
    return (direc.Coordinacion)org.monet.bpi.NodeService.locate("direc.Coordinacion");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
