package direc.minutes.acta;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class DateProperty extends DateFieldProperty {
  public DateProperty() {
    super();this._code = "mcsmaug";
    this._name = "Date";
    this._label = "Fecha";
    
  }
  
  public static String static_getName() {
    return "Date";
  }
}
