package ceip.califications.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class TrimesterProperty extends AttributeProperty {
  public TrimesterProperty() {
    super();this._code = "mo9mzwg";
    this._name = "Trimester";
    this._label = "Trimestre";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "Trimester";
  }
}
