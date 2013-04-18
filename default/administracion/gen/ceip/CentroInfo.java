package ceip;

import ceip.AvailablePositions;
import ceip.CenterInformation;
import ceip.TotalPositions;
import org.monet.bpi.java.NodeContainerImpl;

@SuppressWarnings("all")
public class CentroInfo extends NodeContainerImpl {
  public static CentroInfo getInstance() {
    return (ceip.CentroInfo)org.monet.bpi.NodeService.locate("ceip.CentroInfo");
  }
  
  public AvailablePositions getAvailablePositions() {
    return (ceip.AvailablePositions)this.getChildNode("ceip.AvailablePositions");
  }
  
  public TotalPositions getTotalPositions() {
    return (ceip.TotalPositions)this.getChildNode("ceip.TotalPositions");
  }
  
  public CenterInformation getCenterInformation() {
    return (ceip.CenterInformation)this.getChildNode("ceip.CenterInformation");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
