package solicitud.serviceapplications.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class StudentNameProperty extends AttributeProperty {
  public StudentNameProperty() {
    super();this._code = "mly34sg";
    this._name = "StudentName";
    this._label = "Nombre";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "StudentName";
  }
}
