package ceip.centerinformation.contact;

import org.monet.metamodel.NumberFieldProperty;

@SuppressWarnings("all")
public class TelephoneProperty extends NumberFieldProperty {
  public TelephoneProperty() {
    super();this._code = "ma354tw";
    this._name = "Telephone";
    this.setIsMultiple(true);
    this._label = "Teléfono";
    
  }
  
  public static String static_getName() {
    return "Telephone";
  }
}
