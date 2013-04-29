package ceip;

import org.monet.bpi.Node;
import org.monet.bpi.java.NodeDesktopImpl;

@SuppressWarnings("all")
public class Inicio extends NodeDesktopImpl {
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Inicio createNew(final Node parent) {
    return (ceip.Inicio)org.monet.bpi.NodeService.create(ceip.Inicio.class, parent);
  }
}
