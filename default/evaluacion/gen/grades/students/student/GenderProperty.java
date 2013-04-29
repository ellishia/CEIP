package grades.students.student;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class GenderProperty extends TextFieldProperty {
  public GenderProperty() {
    super();this._code = "mfngi0w";
    this._name = "Gender";
    this._label = "Sexo";
    
  }
  
  public static String static_getName() {
    return "Gender";
  }
}
