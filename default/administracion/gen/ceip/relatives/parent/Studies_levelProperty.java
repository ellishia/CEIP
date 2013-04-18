package ceip.relatives.parent;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class Studies_levelProperty extends SelectFieldProperty {
  public Studies_levelProperty() {
    super();this._code = "mdaq3kq";
    this._name = "Studies_level";
    this._label = "Estudios";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("ceip.shared.StudiesLevel"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Studies_level";
  }
}
