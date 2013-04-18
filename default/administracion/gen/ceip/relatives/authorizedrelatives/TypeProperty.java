package ceip.relatives.authorizedrelatives;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class TypeProperty extends SelectFieldProperty {
  public TypeProperty() {
    super();this._code = "mepg7mg";
    this._name = "Type";
    this._label = "Lugar";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("ceip.shared.PhoneType"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Type";
  }
}
