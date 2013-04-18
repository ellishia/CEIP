package serv;

import org.monet.bpi.java.NodeDesktopImpl;

@SuppressWarnings("all")
public class Servicios extends NodeDesktopImpl {
  public static Servicios getInstance() {
    return (serv.Servicios)org.monet.bpi.NodeService.locate("serv.Servicios");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
