package doc.parentvisits.parentvisit;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class TeacherProperty extends SelectFieldProperty {
  public TeacherProperty() {
    super();this._code = "mri_4iq";
    this._name = "Teacher";
    this._label = "Docentes";
    this.setIsMultiple(true);
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty2 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty2.setSource(new org.monet.metamodel.internal.Ref("doc.shared.Teachers"));
    this.setUse(useProperty2);
    
  }
  
  public static String static_getName() {
    return "Teacher";
  }
}
