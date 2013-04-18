package ceip.applications.application;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class StudentSurnameProperty extends TextFieldProperty {
  public StudentSurnameProperty() {
    super();this._code = "mujyvta";
    this._name = "StudentSurname";
    this._label = "Apellidos de Alumno";
    
  }
  
  public static String static_getName() {
    return "StudentSurname";
  }
}
