package direc.creditcards.creditcard;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class BankProperty extends TextFieldProperty {
  public BankProperty() {
    super();this._code = "mdkmcig";
    this._name = "Bank";
    this._label = "Entidad bancaria";
    
  }
  
  public static String static_getName() {
    return "Bank";
  }
}
