package serv.incidents.incident;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class DateProperty extends DateFieldProperty {
  public DateProperty() {
    super();this._code = "mjlmexa";
    this._name = "Date";
    this._label = "Fecha de Registro";
    
  }
  
  public static String static_getName() {
    return "Date";
  }
}
