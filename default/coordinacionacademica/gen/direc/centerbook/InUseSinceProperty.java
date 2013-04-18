package direc.centerbook;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class InUseSinceProperty extends SelectFieldProperty {
  public InUseSinceProperty() {
    super();this._code = "m87mrbg";
    this._name = "InUseSince";
    this._label = "En Uso desde";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("direc.shared.AcademicYears"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "InUseSince";
  }
}
