package grades.evaluationform;

import org.monet.metamodel.SelectFieldProperty;

public class TutorProperty extends SelectFieldProperty {
  public TutorProperty() {
    super();this._code = "mbnmssg";
    this._name = "Tutor";
    this._label = "Tutor";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("grades.shared.Teachers"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Tutor";
  }
}
