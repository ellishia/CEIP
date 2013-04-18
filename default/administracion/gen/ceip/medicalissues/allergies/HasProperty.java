package ceip.medicalissues.allergies;

import org.monet.metamodel.BooleanFieldProperty;

@SuppressWarnings("all")
public class HasProperty extends BooleanFieldProperty {
  public HasProperty() {
    super();this._code = "m_dybfw";
    this._name = "Has";
    this._label = "Padece";
    
  }
  
  public static String static_getName() {
    return "Has";
  }
}
