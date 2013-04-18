package ceip.boletines.index;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class NameProperty extends AttributeProperty {
  public NameProperty() {
    super();this._code = "mdzpx_q";
    this._name = "Name";
    this._label = "Name";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Name";
  }
}
