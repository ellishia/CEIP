package serv.buslines.busline;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class DirectionProperty extends TextFieldProperty {
  public DirectionProperty() {
    super();this._code = "mspsatw";
    this._name = "Direction";
    this._label = "Sentido";
    
  }
  
  public static String static_getName() {
    return "Direction";
  }
}
