package direc.students.index;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class NameProperty extends AttributeProperty {
  public NameProperty() {
    super();this._code = "imphcdia";
    this._name = "Name";
    this._label = "Nombre";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Name";
  }
}
