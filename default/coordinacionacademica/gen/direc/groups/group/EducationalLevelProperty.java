package direc.groups.group;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class EducationalLevelProperty extends SelectFieldProperty {
  public EducationalLevelProperty() {
    super();this._code = "mkb6jmg";
    this._name = "EducationalLevel";
    this._label = "Nivel Educativo";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("direc.shared.Levels"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "EducationalLevel";
  }
}
