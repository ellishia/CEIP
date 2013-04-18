package ceip.basicinfo.address;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class CityProperty extends TextFieldProperty {
  public CityProperty() {
    super();this._code = "m_sfxfa";
    this._name = "City";
    this._label = "Municipio";
    
  }
  
  public static String static_getName() {
    return "City";
  }
}
