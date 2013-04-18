package serv.specialmenus.specialmenu;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class SuitableProperty extends TextFieldProperty {
  public SuitableProperty() {
    super();this._code = "msrvg_g";
    this._name = "Suitable";
    this._label = "Apto para";
    
  }
  
  public static String static_getName() {
    return "Suitable";
  }
}
