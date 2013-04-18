package solicitud.relatives.parent;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class NameProperty extends TextFieldProperty {
  public NameProperty() {
    super();this._code = "mwe2dva";
    this._name = "Name";
    this._label = "Nombre";
    
  }
  
  public static String static_getName() {
    return "Name";
  }
}
