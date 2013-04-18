package grades.examresults.examresult;

import org.monet.metamodel.SelectFieldProperty;

public class TeacherProperty extends SelectFieldProperty {
  public TeacherProperty() {
    super();this._code = "mw0anxg";
    this._name = "Teacher";
    this._label = "Docente";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("grades.shared.Teachers"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Teacher";
  }
}
