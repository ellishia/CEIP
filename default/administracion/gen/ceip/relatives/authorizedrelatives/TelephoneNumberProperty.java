package ceip.relatives.authorizedrelatives;

import org.monet.metamodel.NumberFieldProperty;

@SuppressWarnings("all")
public class TelephoneNumberProperty extends NumberFieldProperty {
  public TelephoneNumberProperty() {
    super();this._code = "mp1ohiw";
    this._name = "TelephoneNumber";
    this._label = "Telefóno";
    
  }
  
  public static String static_getName() {
    return "TelephoneNumber";
  }
}
