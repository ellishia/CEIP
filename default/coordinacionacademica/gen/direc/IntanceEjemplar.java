package direc;

import direc.intanceejemplar.Ejemplares;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;

@SuppressWarnings("all")
public class IntanceEjemplar extends NodeFormImpl {
  public FieldMultiple<Ejemplares,Void> getEjemplaresField() {
    return ((org.monet.bpi.FieldMultiple<direc.intanceejemplar.Ejemplares, java.lang.Void>)this.getField("IntanceEjemplar", "Ejemplares"));
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static IntanceEjemplar createNew(final Node parent) {
    return (direc.IntanceEjemplar)org.monet.bpi.NodeService.create(direc.IntanceEjemplar.class, parent);
  }
}
