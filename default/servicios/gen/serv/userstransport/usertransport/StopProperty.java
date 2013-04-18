package serv.userstransport.usertransport;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class StopProperty extends SelectFieldProperty {
  public StopProperty() {
    super();this._code = "miy5p4g";
    this._name = "Stop";
    this._label = "Parada";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("serv.shared.StopsName"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Stop";
  }
}
