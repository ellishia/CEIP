package doc.incidents.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class StudentProperty extends AttributeProperty {
  public StudentProperty() {
    super();this._code = "m21abnw";
    this._name = "Student";
    this._label = "Alumno/a";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.LINK;
    
  }
  
  public static String static_getName() {
    return "Student";
  }
}
