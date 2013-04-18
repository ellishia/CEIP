package direc.slots.slot;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class WeekdayProperty extends SelectFieldProperty {
  public WeekdayProperty() {
    super();this._code = "mp00m7a";
    this._name = "Weekday";
    this._label = "Día de la semana";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("direc.shared.Weekdays"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Weekday";
  }
}
