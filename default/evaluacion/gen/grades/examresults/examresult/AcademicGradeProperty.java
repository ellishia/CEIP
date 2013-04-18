package grades.examresults.examresult;

import org.monet.metamodel.SelectFieldProperty;

public class AcademicGradeProperty extends SelectFieldProperty {
  public AcademicGradeProperty() {
    super();this._code = "mozedcw";
    this._name = "AcademicGrade";
    this._label = "Curso";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("grades.shared.Grades"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "AcademicGrade";
  }
}
