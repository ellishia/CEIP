package direc;

import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSection;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;

@SuppressWarnings("all")
public class IntanceEjemplar extends NodeFormImpl {
  public FieldMultiple<FieldSection,Void> getEjemplaresSeccionField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSection, java.lang.Void>)this.getField("IntanceEjemplar", "EjemplaresSeccion"));
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static IntanceEjemplar createNew(final Node parent) {
    return (direc.IntanceEjemplar)org.monet.bpi.NodeService.create(direc.IntanceEjemplar.class, parent);
  }
}
