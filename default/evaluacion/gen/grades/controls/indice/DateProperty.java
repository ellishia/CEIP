package grades.controls.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class DateProperty extends AttributeProperty {
  public DateProperty() {
    super();this._code = "mgypnuw";
    this._name = "Date";
    this._label = "Fecha";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.DATE;
    
  }
  
  public static String static_getName() {
    return "Date";
  }
}
