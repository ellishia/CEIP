package direc.schedule.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class DayHourProperty extends AttributeProperty {
  public DayHourProperty() {
    super();this._code = "mzilrsq";
    this._name = "DayHour";
    this._label = "hora";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "DayHour";
  }
}
