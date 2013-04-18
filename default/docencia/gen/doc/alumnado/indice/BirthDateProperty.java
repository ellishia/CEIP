package doc.alumnado.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class BirthDateProperty extends AttributeProperty {
  public BirthDateProperty() {
    super();this._code = "mbl7uda";
    this._name = "BirthDate";
    this._label = "Fecha de Nacimiento";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.DATE;
    
  }
  
  public static String static_getName() {
    return "BirthDate";
  }
}
