package direc.creditcards.creditcard;

import com.google.common.base.Objects;
import direc.creditcards.CreditCard;
import org.monet.bpi.Properties;
import org.monet.bpi.java.MappingImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class $Properties$ extends MappingImpl {
  public void calculateMapping() {
    this.calculate();
  }
  
  public Properties getProperties() {
    return (org.monet.bpi.Properties) this.genericGetReference();
  }
  
  public CreditCard getNode() {
    return (direc.creditcards.CreditCard) this.genericGetNode();
  }
  
  private void calculate() {
    CreditCard _node = this.getNode();
    String _bank = _node.getBank();
    String _plus = (_bank + " ");
    CreditCard _node_1 = this.getNode();
    org.monet.bpi.types.Number _cardNumber = _node_1.getCardNumber();
    String valor = (_plus + _cardNumber);
    CreditCard _node_2 = this.getNode();
    Term _academicYear = _node_2.getAcademicYear();
    boolean _notEquals = (!Objects.equal(_academicYear, null));
    if (_notEquals) {
      String _plus_1 = (valor + " ");
      CreditCard _node_3 = this.getNode();
      Term _academicYear_1 = _node_3.getAcademicYear();
      String _label = _academicYear_1.getLabel();
      String _plus_2 = (_plus_1 + _label);
      valor = _plus_2;
    }
    CreditCard _node_4 = this.getNode();
    _node_4.setLabel(valor);
  }
}
