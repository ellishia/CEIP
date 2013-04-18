package ceip.medicalissues.epilepsia;

import org.monet.metamodel.BooleanFieldProperty;

@SuppressWarnings("all")
public class HasProperty extends BooleanFieldProperty {
  public HasProperty() {
    super();this._code = "my4isiw";
    this._name = "Has";
    this._label = "Padece";
    
  }
  
  public static String static_getName() {
    return "Has";
  }
}
