package direc.schedule.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class WeekdayProperty extends AttributeProperty {
  public WeekdayProperty() {
    super();this._code = "m1pfonq";
    this._name = "Weekday";
    this._label = "Día de la semana";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "Weekday";
  }
}
