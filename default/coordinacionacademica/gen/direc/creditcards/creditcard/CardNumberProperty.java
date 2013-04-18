package direc.creditcards.creditcard;

import org.monet.metamodel.NumberFieldProperty;

@SuppressWarnings("all")
public class CardNumberProperty extends NumberFieldProperty {
  public CardNumberProperty() {
    super();this._code = "myavokw";
    this._name = "CardNumber";
    this._label = "Número tarjeta";
    this._format = "#16";
    
  }
  
  public static String static_getName() {
    return "CardNumber";
  }
}
