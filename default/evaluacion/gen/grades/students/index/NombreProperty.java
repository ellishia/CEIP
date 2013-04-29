package grades.students.index;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class NombreProperty extends AttributeProperty {
  public NombreProperty() {
    super();this._code = "imphcdia";
    this._name = "Nombre";
    this._label = "Nombre";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Nombre";
  }
}
