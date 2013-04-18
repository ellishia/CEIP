package grades.students.student;

import org.monet.metamodel.SelectFieldProperty;

public class MotherAcademicLevelProperty extends SelectFieldProperty {
  public MotherAcademicLevelProperty() {
    super();this._code = "mu3svpg";
    this._name = "MotherAcademicLevel";
    this._label = "Nivel académico de madre";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("grades.shared.Levels"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "MotherAcademicLevel";
  }
}
