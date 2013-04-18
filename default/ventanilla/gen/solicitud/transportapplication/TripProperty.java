package solicitud.transportapplication;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class TripProperty extends TextFieldProperty {
  public TripProperty() {
    super();this._code = "mgy_5ha";
    this._name = "Trip";
    this._label = "Ruta";
    
  }
  
  public static String static_getName() {
    return "Trip";
  }
}
