package ceip;

import org.monet.bpi.java.NodeDesktopImpl;

@SuppressWarnings("all")
public class Administracion extends NodeDesktopImpl {
  public static Administracion getInstance() {
    return (ceip.Administracion)org.monet.bpi.NodeService.locate("ceip.Administracion");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
