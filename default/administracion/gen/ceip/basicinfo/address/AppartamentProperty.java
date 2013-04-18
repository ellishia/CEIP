package ceip.basicinfo.address;

import org.monet.metamodel.NumberFieldProperty;

@SuppressWarnings("all")
public class AppartamentProperty extends NumberFieldProperty {
  public AppartamentProperty() {
    super();this._code = "mmgptcw";
    this._name = "Appartament";
    this._label = "Piso, letra";
    
  }
  
  public static String static_getName() {
    return "Appartament";
  }
}
