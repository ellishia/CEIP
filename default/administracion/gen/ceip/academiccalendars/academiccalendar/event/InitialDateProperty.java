package ceip.academiccalendars.academiccalendar.event;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class InitialDateProperty extends DateFieldProperty {
  public InitialDateProperty() {
    super();this._code = "m9qjoha";
    this._name = "InitialDate";
    this._label = "Fecha de Inicio";
    this._precision = org.monet.metamodel.DateFieldPropertyBase.PrecisionEnumeration.DAYS;
    
  }
  
  public static String static_getName() {
    return "InitialDate";
  }
}
