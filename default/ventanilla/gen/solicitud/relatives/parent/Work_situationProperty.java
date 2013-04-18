package solicitud.relatives.parent;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class Work_situationProperty extends SelectFieldProperty {
  public Work_situationProperty() {
    super();this._code = "mpzcnfw";
    this._name = "Work_situation";
    this._label = "Situación Laboral";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("solicitud.shared.WorkSituation"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Work_situation";
  }
}
