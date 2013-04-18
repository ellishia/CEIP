package ceip.applications.application;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class BirthDateProperty extends DateFieldProperty {
  public BirthDateProperty() {
    super();this._code = "muijfjg";
    this._name = "BirthDate";
    this._label = "Fecha de Nacimiento";
    this._precision = org.monet.metamodel.DateFieldPropertyBase.PrecisionEnumeration.DAYS;
    
  }
  
  public static String static_getName() {
    return "BirthDate";
  }
}
