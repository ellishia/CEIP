package direc.activityfile;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class EndDateProperty extends DateFieldProperty {
  public EndDateProperty() {
    super();this._code = "mkqrbkg";
    this._name = "EndDate";
    this._precision = org.monet.metamodel.DateFieldPropertyBase.PrecisionEnumeration.MINUTES;
    this._label = "Día de Fin";
    
  }
  
  public static String static_getName() {
    return "EndDate";
  }
}
