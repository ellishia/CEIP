package direc;

import direc.Schedule;
import direc.ScheduleYear;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeContainerImpl;

@SuppressWarnings("all")
public class AnualSchedule extends NodeContainerImpl {
  public Schedule getSchedule() {
    return (direc.Schedule)this.getChildNode("direc.Schedule");
  }
  
  public ScheduleYear getScheduleYear() {
    return (direc.ScheduleYear)this.getChildNode("direc.ScheduleYear");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static AnualSchedule createNew(final Node parent) {
    return (direc.AnualSchedule)org.monet.bpi.NodeService.create(direc.AnualSchedule.class, parent);
  }
}
