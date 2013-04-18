package ceip.applications.application.address;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class AppartamentProperty extends TextFieldProperty {
  public AppartamentProperty() {
    super();this._code = "mmgptcw";
    this._name = "Appartament";
    this._label = "Piso, letra";
    
  }
  
  public static String static_getName() {
    return "Appartament";
  }
}
