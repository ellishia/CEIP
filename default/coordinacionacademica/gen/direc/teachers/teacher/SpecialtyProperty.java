package direc.teachers.teacher;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class SpecialtyProperty extends TextFieldProperty {
  public SpecialtyProperty() {
    super();this._code = "mhh80tq";
    this._name = "Specialty";
    this._label = "Especialidad";
    
  }
  
  public static String static_getName() {
    return "Specialty";
  }
}
