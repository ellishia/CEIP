package solicitud.applicationinfo;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class BirthdateProperty extends DateFieldProperty {
  public BirthdateProperty() {
    super();this._code = "mtq27ow";
    this._name = "Birthdate";
    this._precision = org.monet.metamodel.DateFieldPropertyBase.PrecisionEnumeration.DAYS;
    this._label = "Fecha de nacimiento";
    
  }
  
  public static String static_getName() {
    return "Birthdate";
  }
}
