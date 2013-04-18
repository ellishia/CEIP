package direc.creditcards.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class BankProperty extends AttributeProperty {
  public BankProperty() {
    super();this._code = "maumdtg";
    this._name = "Bank";
    this._label = "Entidad Bancaria";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Bank";
  }
}
