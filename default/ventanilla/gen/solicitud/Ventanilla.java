package solicitud;

import org.monet.bpi.java.NodeDesktopImpl;

@SuppressWarnings("all")
public class Ventanilla extends NodeDesktopImpl {
  public static Ventanilla getInstance() {
    return (solicitud.Ventanilla)org.monet.bpi.NodeService.locate("solicitud.Ventanilla");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
