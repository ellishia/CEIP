package grades.students.student;

import org.monet.metamodel.SelectFieldProperty;

public class ParentAcademicLevelProperty extends SelectFieldProperty {
  public ParentAcademicLevelProperty() {
    super();this._code = "mrlbffg";
    this._name = "ParentAcademicLevel";
    this._label = "Nivel académico de padre";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("grades.shared.Levels"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "ParentAcademicLevel";
  }
}
