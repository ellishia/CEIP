package grades.students.student;

import org.monet.metamodel.TextFieldProperty;

public class CityProperty extends TextFieldProperty {
  public CityProperty() {
    super();this._code = "m_sfxfa";
    this._name = "City";
    this._label = "Municipio";
    
  }
  
  public static String static_getName() {
    return "City";
  }
}
