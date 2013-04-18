package serv.buslines.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class IdProperty extends AttributeProperty {
  public IdProperty() {
    super();this._code = "menunpq";
    this._name = "Id";
    this._label = "Identifier";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Id";
  }
}
