package doc.alumnado.student;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class BirthDateProperty extends DateFieldProperty {
  public BirthDateProperty() {
    super();this._code = "mnkozoa";
    this._name = "BirthDate";
    this._label = "Fecha de Nacimiento";
    
  }
  
  public static String static_getName() {
    return "BirthDate";
  }
}
