package doc.parentvisits.parentvisit;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class AreasProperty extends SelectFieldProperty {
  public AreasProperty() {
    super();this._code = "mnfn6tq";
    this._name = "Areas";
    this._label = "Asignaturas";
    this.setIsMultiple(true);
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty2 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty2.setSource(new org.monet.metamodel.internal.Ref("doc.shared.Areas"));
    this.setUse(useProperty2);
    
  }
  
  public static String static_getName() {
    return "Areas";
  }
}
