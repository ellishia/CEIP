package doc.groups.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class NameProperty extends AttributeProperty {
  public NameProperty() {
    super();this._code = "im9nub3a";
    this._name = "Name";
    this._label = "Nombre";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Name";
  }
}
