package direc.creditcards.creditcard;

import org.monet.metamodel.NumberFieldProperty;

@SuppressWarnings("all")
public class MoneyCreditProperty extends NumberFieldProperty {
  public MoneyCreditProperty() {
    super();this._code = "mf2h3ha";
    this._name = "MoneyCredit";
    this._label = "Cantidad de dinero";
    
  }
  
  public static String static_getName() {
    return "MoneyCredit";
  }
}
