package solicitud.applicationinfo;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class SiblingsProperty extends TextFieldProperty {
  public SiblingsProperty() {
    super();this._code = "maaymtw";
    this._name = "Siblings";
    this._label = "Hermanos/as en el centro";
    
  }
  
  public static String static_getName() {
    return "Siblings";
  }
}
