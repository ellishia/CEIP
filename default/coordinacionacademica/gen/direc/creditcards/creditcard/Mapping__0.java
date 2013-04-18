package direc.creditcards.creditcard;

import direc.creditcards.CreditCard;
import direc.creditcards.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.creditcards.CreditCard node = (direc.creditcards.CreditCard) this.genericGetNode();
    direc.creditcards.Indice reference = (direc.creditcards.Indice) this.genericGetReference();
    reference.setBank(node.getBank());
    reference.setAcademicYear(node.getAcademicYear());
    
  }
  
  public Indice getReference() {
    return (direc.creditcards.Indice) this.genericGetReference();
  }
  
  public CreditCard getNode() {
    return (direc.creditcards.CreditCard) this.genericGetNode();
  }
}
