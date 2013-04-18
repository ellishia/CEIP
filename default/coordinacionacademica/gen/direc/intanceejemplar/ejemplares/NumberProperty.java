package direc.intanceejemplar.ejemplares;

import org.monet.metamodel.NumberFieldProperty;

@SuppressWarnings("all")
public class NumberProperty extends NumberFieldProperty {
  public NumberProperty() {
    super();this._code = "myfoxra";
    this._name = "Number";
    this._label = "Cantidad";
    
  }
  
  public static String static_getName() {
    return "Number";
  }
}
