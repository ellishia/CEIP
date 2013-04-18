package serv.buslines.busline;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class ScheduleProperty extends TextFieldProperty {
  public ScheduleProperty() {
    super();this._code = "mp0_qyg";
    this._name = "Schedule";
    this._label = "Horario";
    
  }
  
  public static String static_getName() {
    return "Schedule";
  }
}
