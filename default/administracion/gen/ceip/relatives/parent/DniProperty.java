package ceip.relatives.parent;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class DniProperty extends TextFieldProperty {
  public DniProperty() {
    super();this._code = "mgmmrvw";
    this._name = "Dni";
    this._label = "DNI";
    
  }
  
  public static String static_getName() {
    return "Dni";
  }
}
