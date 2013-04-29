package grades.califications.calification;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class SubjectProperty extends SelectFieldProperty {
  public SubjectProperty() {
    super();this._code = "mf1x_iw";
    this._name = "Subject";
    this._label = "Asignatura";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("grades.shared.Subjects"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Subject";
  }
}
