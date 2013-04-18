package doc.exams.examform;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class LevelProperty extends SelectFieldProperty {
  public LevelProperty() {
    super();this._code = "mibzjkg";
    this._name = "Level";
    this._label = "Nivel";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("doc.shared.Levels"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Level";
  }
}
