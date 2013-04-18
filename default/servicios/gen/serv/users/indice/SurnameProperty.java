package serv.users.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class SurnameProperty extends AttributeProperty {
  public SurnameProperty() {
    super();this._code = "mqkfmla";
    this._name = "Surname";
    this._label = "Apellidos";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Surname";
  }
}
