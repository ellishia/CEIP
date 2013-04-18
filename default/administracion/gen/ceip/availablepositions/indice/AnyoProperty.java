package ceip.availablepositions.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class AnyoProperty extends AttributeProperty {
  public AnyoProperty() {
    super();this._code = "imljgmza";
    this._name = "Anyo";
    this._label = "Año Académico";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Anyo";
  }
}
