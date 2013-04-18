package ceip.applications.application;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class GenderProperty extends SelectFieldProperty {
  public GenderProperty() {
    super();this._code = "m23kg4q";
    this._name = "Gender";
    this._label = "Sexo";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("ceip.shared.Gender"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Gender";
  }
}
