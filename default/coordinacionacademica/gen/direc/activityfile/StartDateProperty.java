package direc.activityfile;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class StartDateProperty extends DateFieldProperty {
  public StartDateProperty() {
    super();this._code = "mqgbofw";
    this._name = "StartDate";
    this._precision = org.monet.metamodel.DateFieldPropertyBase.PrecisionEnumeration.MINUTES;
    this._label = "Día de Comienzo";
    
  }
  
  public static String static_getName() {
    return "StartDate";
  }
}
