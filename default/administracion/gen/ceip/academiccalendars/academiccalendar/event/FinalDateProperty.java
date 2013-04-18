package ceip.academiccalendars.academiccalendar.event;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class FinalDateProperty extends DateFieldProperty {
  public FinalDateProperty() {
    super();this._code = "mod0nlq";
    this._name = "FinalDate";
    this._label = "Fecha Final";
    this._precision = org.monet.metamodel.DateFieldPropertyBase.PrecisionEnumeration.DAYS;
    
  }
  
  public static String static_getName() {
    return "FinalDate";
  }
}
