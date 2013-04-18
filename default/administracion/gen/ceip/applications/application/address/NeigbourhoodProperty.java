package ceip.applications.application.address;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class NeigbourhoodProperty extends TextFieldProperty {
  public NeigbourhoodProperty() {
    super();this._code = "m1lxdka";
    this._name = "Neigbourhood";
    this._label = "Localidad/Barrio";
    
  }
  
  public static String static_getName() {
    return "Neigbourhood";
  }
}
