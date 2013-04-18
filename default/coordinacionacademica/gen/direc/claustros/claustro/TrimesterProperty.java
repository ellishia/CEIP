package direc.claustros.claustro;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class TrimesterProperty extends SelectFieldProperty {
  public TrimesterProperty() {
    super();this._code = "mxv85va";
    this._name = "Trimester";
    this._label = "Trimestre";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("direc.shared.Trimester"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Trimester";
  }
}
