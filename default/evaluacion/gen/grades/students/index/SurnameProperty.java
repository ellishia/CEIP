package grades.students.index;

import org.monet.metamodel.AttributeProperty;

public class SurnameProperty extends AttributeProperty {
  public SurnameProperty() {
    super();this._code = "mxxcmpg";
    this._name = "Surname";
    this._label = "Apellidos";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Surname";
  }
}
