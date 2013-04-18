package solicitud.relatives.parent;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class EmailProperty extends TextFieldProperty {
  public EmailProperty() {
    super();this._code = "m6hliza";
    this._name = "Email";
    this._label = "Correo electrónico";
    
  }
  
  public static String static_getName() {
    return "Email";
  }
}
