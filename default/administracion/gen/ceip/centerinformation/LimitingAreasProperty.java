package ceip.centerinformation;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class LimitingAreasProperty extends TextFieldProperty {
  public LimitingAreasProperty() {
    super();this._code = "msosdsa";
    this._name = "LimitingAreas";
    this._label = "Áreas Limítrofes";
    
  }
  
  public static String static_getName() {
    return "LimitingAreas";
  }
}
