package solicitud.applicationinfo;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class GenderProperty extends SelectFieldProperty {
  public GenderProperty() {
    super();this._code = "m_joqwq";
    this._name = "Gender";
    this._label = "Sexo";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("solicitud.shared.Genders"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Gender";
  }
}
