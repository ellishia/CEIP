package ceip.califications.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class StudentProperty extends AttributeProperty {
  public StudentProperty() {
    super();this._code = "mh5h9sw";
    this._name = "Student";
    this._label = "Alumno";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "Student";
  }
}
