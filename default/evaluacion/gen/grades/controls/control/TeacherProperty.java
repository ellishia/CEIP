package grades.controls.control;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class TeacherProperty extends SelectFieldProperty {
  public TeacherProperty() {
    super();this._code = "mmai_kq";
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
