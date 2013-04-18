package doc.absences.absence;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class DateProperty extends DateFieldProperty {
  public DateProperty() {
    super();this._code = "mtcfakq";
    this._name = "Date";
    this._precision = org.monet.metamodel.DateFieldPropertyBase.PrecisionEnumeration.DAYS;
    this._label = "Fecha";
    
  }
  
  public static String static_getName() {
    return "Date";
  }
}
