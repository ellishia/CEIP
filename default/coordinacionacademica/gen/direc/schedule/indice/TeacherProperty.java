package direc.schedule.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class TeacherProperty extends AttributeProperty {
  public TeacherProperty() {
    super();this._code = "makme0a";
    this._name = "Teacher";
    this._label = "Docente";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.LINK;
    
  }
  
  public static String static_getName() {
    return "Teacher";
  }
}
