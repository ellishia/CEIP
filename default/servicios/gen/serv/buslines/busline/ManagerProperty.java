package serv.buslines.busline;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class ManagerProperty extends TextFieldProperty {
  public ManagerProperty() {
    super();this._code = "mhjnkgg";
    this._name = "Manager";
    this._label = "Encargado";
    this.setIsMultiple(true);
    
  }
  
  public static String static_getName() {
    return "Manager";
  }
}
