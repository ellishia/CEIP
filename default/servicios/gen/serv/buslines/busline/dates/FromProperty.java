package serv.buslines.busline.dates;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class FromProperty extends DateFieldProperty {
  public FromProperty() {
    super();this._code = "mb24dfw";
    this._name = "From";
    this._label = "Desde";
    
  }
  
  public static String static_getName() {
    return "From";
  }
}
