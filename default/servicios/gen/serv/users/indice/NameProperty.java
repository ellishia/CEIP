package serv.users.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class NameProperty extends AttributeProperty {
  public NameProperty() {
    super();this._code = "imkufqig";
    this._name = "Name";
    this._label = "Nombre";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Name";
  }
}
