package doc;

import org.monet.bpi.java.NodeDesktopImpl;

@SuppressWarnings("all")
public class Docencia extends NodeDesktopImpl {
  public static Docencia getInstance() {
    return (doc.Docencia)org.monet.bpi.NodeService.locate("doc.Docencia");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
