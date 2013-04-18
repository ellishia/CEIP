package direc.groups.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class IdentifierProperty extends AttributeProperty {
  public IdentifierProperty() {
    super();this._code = "meodvlg";
    this._name = "Identifier";
    this._label = "Id";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Identifier";
  }
}
