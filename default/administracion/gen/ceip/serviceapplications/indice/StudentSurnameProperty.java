package ceip.serviceapplications.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class StudentSurnameProperty extends AttributeProperty {
  public StudentSurnameProperty() {
    super();this._code = "mayyduq";
    this._name = "StudentSurname";
    this._label = "Apellidos";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "StudentSurname";
  }
}
