package solicitud.relatives.authorizedrelatives;

import org.monet.metamodel.NumberFieldProperty;

@SuppressWarnings("all")
public class OrderProperty extends NumberFieldProperty {
  public OrderProperty() {
    super();this._code = "mipanqa";
    this._name = "Order";
    this._label = "Orden";
    
  }
  
  public static String static_getName() {
    return "Order";
  }
}
