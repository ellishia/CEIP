package ceip.califications.calification;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class TrimesterProperty extends SelectFieldProperty {
  public TrimesterProperty() {
    super();this._code = "mbcp1yg";
    this._name = "Trimester";
    this._label = "Trimestre";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("ceip.shared.Trimester"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Trimester";
  }
}
