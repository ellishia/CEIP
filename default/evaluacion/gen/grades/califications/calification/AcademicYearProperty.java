package grades.califications.calification;

import org.monet.metamodel.SelectFieldProperty;

public class AcademicYearProperty extends SelectFieldProperty {
  public AcademicYearProperty() {
    super();this._code = "mpza0cw";
    this._name = "AcademicYear";
    this._label = "Año Académico";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("grades.shared.AcademicYears"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "AcademicYear";
  }
}
