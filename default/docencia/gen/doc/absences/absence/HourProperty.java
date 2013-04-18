package doc.absences.absence;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class HourProperty extends TextFieldProperty {
  public HourProperty() {
    super();this._code = "mem7pkq";
    this._name = "Hour";
    this._label = "Hora";
    this.setIsMultiple(true);
    
  }
  
  public static String static_getName() {
    return "Hour";
  }
}
