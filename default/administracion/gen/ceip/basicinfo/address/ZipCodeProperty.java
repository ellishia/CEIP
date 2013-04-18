package ceip.basicinfo.address;

import org.monet.metamodel.NumberFieldProperty;

@SuppressWarnings("all")
public class ZipCodeProperty extends NumberFieldProperty {
  public ZipCodeProperty() {
    super();this._code = "mnzounw";
    this._name = "ZipCode";
    this._label = "Código Postal";
    
  }
  
  public static String static_getName() {
    return "ZipCode";
  }
}
