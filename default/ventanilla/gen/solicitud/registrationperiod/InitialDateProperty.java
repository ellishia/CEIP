package solicitud.registrationperiod;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class InitialDateProperty extends DateFieldProperty {
  public InitialDateProperty() {
    super();this._code = "mwz3yea";
    this._name = "InitialDate";
    this._label = "Inicio";
    this._precision = org.monet.metamodel.DateFieldPropertyBase.PrecisionEnumeration.DAYS;
    
  }
  
  public static String static_getName() {
    return "InitialDate";
  }
}
