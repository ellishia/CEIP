package serv.stops.stop;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class KmProperty extends TextFieldProperty {
  public KmProperty() {
    super();this._code = "m63lsgw";
    this._name = "Km";
    this._label = "Km al centro";
    
  }
  
  public static String static_getName() {
    return "Km";
  }
}
