package ceip.centerinformation;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class SpecificsProperty extends TextFieldProperty {
  public SpecificsProperty() {
    super();this._code = "mf24nmq";
    this._name = "Specifics";
    this.setIsMultiple(true);
    this._label = "Especificidades";
    
  }
  
  public static String static_getName() {
    return "Specifics";
  }
}
