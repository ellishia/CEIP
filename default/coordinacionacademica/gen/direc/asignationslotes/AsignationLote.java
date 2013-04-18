package direc.asignationslotes;

import direc.asignations.AsignationDefault;
import org.monet.bpi.FieldLink;
import org.monet.bpi.Node;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class AsignationLote extends AsignationDefault {
  public FieldLink getLoteField() {
    return ((org.monet.bpi.FieldLink)this.getField("AsignationLote", "Lote"));
  }
  
  public Link getLote() {
    return ((org.monet.bpi.FieldLink)this.getField("AsignationLote", "Lote")).get();
  }
  
  public Term getLoteAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("AsignationLote", "Lote")).getAsTerm();
  }
  
  public void setLote(final Link value) {
    this.getLoteField().set(value);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static AsignationLote createNew(final Node parent) {
    return (direc.asignationslotes.AsignationLote)org.monet.bpi.NodeService.create(direc.asignationslotes.AsignationLote.class, parent);
  }
}
