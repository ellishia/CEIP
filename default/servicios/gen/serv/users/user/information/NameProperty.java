package serv.users.user.information;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class NameProperty extends TextFieldProperty {
  public NameProperty() {
    super();this._code = "miwsa4g";
    this._name = "Name";
    this._label = "Nombre";
    
  }
  
  public static String static_getName() {
    return "Name";
  }
}
