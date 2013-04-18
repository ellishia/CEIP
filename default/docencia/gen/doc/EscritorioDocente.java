package doc;

import org.monet.bpi.java.NodeDesktopImpl;

@SuppressWarnings("all")
public class EscritorioDocente extends NodeDesktopImpl {
  public static EscritorioDocente getInstance() {
    return (doc.EscritorioDocente)org.monet.bpi.NodeService.locate("doc.EscritorioDocente");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
