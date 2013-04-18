package ceip.centerinformation;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class RelatedPreeschoolsProperty extends TextFieldProperty {
  public RelatedPreeschoolsProperty() {
    super();this._code = "mtzgfpa";
    this._name = "RelatedPreeschools";
    this.setIsMultiple(true);
    this._label = "Centros de Infantil adscritos";
    
  }
  
  public static String static_getName() {
    return "RelatedPreeschools";
  }
}
