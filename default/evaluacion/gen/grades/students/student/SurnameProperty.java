package grades.students.student;

import org.monet.metamodel.TextFieldProperty;

public class SurnameProperty extends TextFieldProperty {
  public SurnameProperty() {
    super();this._code = "m_ixcva";
    this._name = "Surname";
    this._label = "Apellidos";
    
  }
  
  public static String static_getName() {
    return "Surname";
  }
}