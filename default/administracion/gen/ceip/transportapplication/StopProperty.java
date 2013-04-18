package ceip.transportapplication;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class StopProperty extends TextFieldProperty {
  public StopProperty() {
    super();this._code = "mscxqtw";
    this._name = "Stop";
    this._label = "Parada";
    
  }
  
  public static String static_getName() {
    return "Stop";
  }
}
