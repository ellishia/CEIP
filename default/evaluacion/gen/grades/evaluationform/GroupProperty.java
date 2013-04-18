package grades.evaluationform;

import org.monet.metamodel.SelectFieldProperty;

public class GroupProperty extends SelectFieldProperty {
  public GroupProperty() {
    super();this._code = "mpr7qxw";
    this._name = "Group";
    this._label = "Grupo";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("grades.shared.Grades"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Group";
  }
}
