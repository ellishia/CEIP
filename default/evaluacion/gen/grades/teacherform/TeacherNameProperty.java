package grades.teacherform;

import org.monet.metamodel.SelectFieldProperty;

public class TeacherNameProperty extends SelectFieldProperty {
  public TeacherNameProperty() {
    super();this._code = "m_yybkq";
    this._name = "TeacherName";
    this._label = "Nombre de Docente";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("grades.shared.Teachers"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "TeacherName";
  }
}
