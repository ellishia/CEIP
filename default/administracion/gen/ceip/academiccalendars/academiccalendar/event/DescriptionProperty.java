package ceip.academiccalendars.academiccalendar.event;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class DescriptionProperty extends TextFieldProperty {
  public DescriptionProperty() {
    super();this._code = "maaulsw";
    this._name = "Description";
    this._label = "Descripcion";
    
  }
  
  public static String static_getName() {
    return "Description";
  }
}
