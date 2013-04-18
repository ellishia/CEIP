package serv.buslines.busline;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class NameProperty extends TextFieldProperty {
  public NameProperty() {
    super();this._code = "mylsbhg";
    this._name = "Name";
    this._label = "Nombre";
    
  }
  
  public static String static_getName() {
    return "Name";
  }
}
