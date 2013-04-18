package solicitud.serviceapplications.serviceapplication;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class StudentNameProperty extends TextFieldProperty {
  public StudentNameProperty() {
    super();this._code = "mxdc0hw";
    this._name = "StudentName";
    this._label = "Nombre de Alumno/a";
    
  }
  
  public static String static_getName() {
    return "StudentName";
  }
}
