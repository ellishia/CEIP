package solicitud.registrationperiod;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class FinalDateProperty extends DateFieldProperty {
  public FinalDateProperty() {
    super();this._code = "mk_jm4w";
    this._name = "FinalDate";
    this._label = "Fin";
    this._precision = org.monet.metamodel.DateFieldPropertyBase.PrecisionEnumeration.DAYS;
    
  }
  
  public static String static_getName() {
    return "FinalDate";
  }
}
