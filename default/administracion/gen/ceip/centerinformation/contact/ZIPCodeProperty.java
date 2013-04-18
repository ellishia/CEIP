package ceip.centerinformation.contact;

import org.monet.metamodel.NumberFieldProperty;

@SuppressWarnings("all")
public class ZIPCodeProperty extends NumberFieldProperty {
  public ZIPCodeProperty() {
    super();this._code = "md3_ecg";
    this._name = "ZIPCode";
    this._label = "Código Postal";
    
  }
  
  public static String static_getName() {
    return "ZIPCode";
  }
}
