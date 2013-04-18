package direc.teacherasignations.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class TeacherProperty extends AttributeProperty {
  public TeacherProperty() {
    super();this._code = "im69logq";
    this._name = "Teacher";
    this._label = "Docente";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "Teacher";
  }
}
