package direc.creditcards.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class CardNumberProperty extends AttributeProperty {
  public CardNumberProperty() {
    super();this._code = "myfgj_a";
    this._name = "CardNumber";
    this._label = "Tarjeta de Crédito";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "CardNumber";
  }
}
