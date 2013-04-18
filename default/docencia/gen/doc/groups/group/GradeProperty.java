package doc.groups.group;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class GradeProperty extends SelectFieldProperty {
  public GradeProperty() {
    super();this._code = "mkb6jmg";
    this._name = "Grade";
    this._label = "Curso Académico";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("doc.shared.Grades"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Grade";
  }
}
