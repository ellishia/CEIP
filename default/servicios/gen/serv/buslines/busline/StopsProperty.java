package serv.buslines.busline;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class StopsProperty extends SelectFieldProperty {
  public StopsProperty() {
    super();this._code = "mrryiqw";
    this._name = "Stops";
    this._label = "Paradas";
    this.setIsMultiple(true);
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty2 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty2.setSource(new org.monet.metamodel.internal.Ref("serv.shared.StopsName"));
    this.setUse(useProperty2);
    
  }
  
  public static String static_getName() {
    return "Stops";
  }
}
