package ceip.califications.calification;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class LevelProperty extends SelectFieldProperty {
  public LevelProperty() {
    super();this._code = "mi6koxa";
    this._name = "Level";
    this._label = "Curso";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("ceip.shared.Levels"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Level";
  }
}
