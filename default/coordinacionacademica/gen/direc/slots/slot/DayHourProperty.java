package direc.slots.slot;

import org.monet.metamodel.NumberFieldProperty;

@SuppressWarnings("all")
public class DayHourProperty extends NumberFieldProperty {
  public DayHourProperty() {
    super();this._code = "mar2pmq";
    this._name = "DayHour";
    this._label = "Hora del día";
    
  }
  
  public static String static_getName() {
    return "DayHour";
  }
}
