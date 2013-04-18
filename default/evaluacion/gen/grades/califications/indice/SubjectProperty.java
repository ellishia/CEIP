package grades.califications.indice;

import org.monet.metamodel.AttributeProperty;

public class SubjectProperty extends AttributeProperty {
  public SubjectProperty() {
    super();this._code = "iminbk5w";
    this._name = "Subject";
    this._label = "Asignatura";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "Subject";
  }
}
