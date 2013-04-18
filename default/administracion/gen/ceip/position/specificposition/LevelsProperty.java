package ceip.position.specificposition;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class LevelsProperty extends SelectFieldProperty {
  public LevelsProperty() {
    super();this._code = "mnog8_a";
    this._name = "Levels";
    this._label = "Nivel";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("ceip.shared.Levels"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Levels";
  }
}
