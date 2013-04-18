package direc.teachers.teacher;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class SurnameProperty extends TextFieldProperty {
  public SurnameProperty() {
    super();this._code = "mdbi4_w";
    this._name = "Surname";
    this._label = "Apellidos";
    
  }
  
  public static String static_getName() {
    return "Surname";
  }
}
