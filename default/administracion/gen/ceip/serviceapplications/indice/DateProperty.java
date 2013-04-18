package ceip.serviceapplications.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class DateProperty extends AttributeProperty {
  public DateProperty() {
    super();this._code = "img7bi6g";
    this._name = "Date";
    this._label = "Fecha";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Date";
  }
}
