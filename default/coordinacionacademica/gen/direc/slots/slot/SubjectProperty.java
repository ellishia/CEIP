package direc.slots.slot;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class SubjectProperty extends TextFieldProperty {
  public SubjectProperty() {
    super();this._code = "m_bszeq";
    this._name = "Subject";
    this._label = "Asignatura";
    
  }
  
  public static String static_getName() {
    return "Subject";
  }
}
