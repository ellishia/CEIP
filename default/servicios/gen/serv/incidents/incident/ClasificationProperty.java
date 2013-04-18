package serv.incidents.incident;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class ClasificationProperty extends SelectFieldProperty {
  public ClasificationProperty() {
    super();this._code = "myxigka";
    this._name = "Clasification";
    this._label = "Clasificación";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("serv.shared.Clasification"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Clasification";
  }
}
