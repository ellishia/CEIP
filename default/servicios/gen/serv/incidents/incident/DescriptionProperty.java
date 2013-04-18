package serv.incidents.incident;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class DescriptionProperty extends TextFieldProperty {
  public DescriptionProperty() {
    super();this._code = "mrheuna";
    this._name = "Description";
    this._label = "Descripción";
    
  }
  
  public static String static_getName() {
    return "Description";
  }
}
