package solicitud.relatives.parent;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class Civil_stateProperty extends SelectFieldProperty {
  public Civil_stateProperty() {
    super();this._code = "mmbjizg";
    this._name = "Civil_state";
    this._label = "Estado civil";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("solicitud.shared.CivilState"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Civil_state";
  }
}
