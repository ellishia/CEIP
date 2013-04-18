package direc.asignationscards;

import direc.asignations.AsignationDefault;
import org.monet.bpi.FieldLink;
import org.monet.bpi.Node;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class AsignationCard extends AsignationDefault {
  public FieldLink getCreditCardField() {
    return ((org.monet.bpi.FieldLink)this.getField("AsignationCard", "CreditCard"));
  }
  
  public Link getCreditCard() {
    return ((org.monet.bpi.FieldLink)this.getField("AsignationCard", "CreditCard")).get();
  }
  
  public Term getCreditCardAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("AsignationCard", "CreditCard")).getAsTerm();
  }
  
  public void setCreditCard(final Link value) {
    this.getCreditCardField().set(value);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static AsignationCard createNew(final Node parent) {
    return (direc.asignationscards.AsignationCard)org.monet.bpi.NodeService.create(direc.asignationscards.AsignationCard.class, parent);
  }
}
