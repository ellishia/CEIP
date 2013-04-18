package grades.controls.indice;

import org.monet.metamodel.AttributeProperty;

public class TeacherProperty extends AttributeProperty {
  public TeacherProperty() {
    super();this._code = "m_gi5gg";
    this._name = "Teacher";
    this._label = "Docente";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "Teacher";
  }
}
