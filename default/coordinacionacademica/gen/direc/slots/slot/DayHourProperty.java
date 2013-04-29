package direc.slots.slot;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class DayHourProperty extends TextFieldProperty {
  public DayHourProperty() {
    super();this._code = "mar2pmq";
    this._name = "DayHour";
    this._label = "Hora del día";
    
  }
  
  public static String static_getName() {
    return "DayHour";
  }
}
