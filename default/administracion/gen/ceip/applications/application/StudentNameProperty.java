package ceip.applications.application;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class StudentNameProperty extends TextFieldProperty {
  public StudentNameProperty() {
    super();this._code = "m_6vacw";
    this._name = "StudentName";
    this._label = "Nombre de Alumno";
    
  }
  
  public static String static_getName() {
    return "StudentName";
  }
}
