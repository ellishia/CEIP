package ceip.position;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class AcademicYearProperty extends SelectFieldProperty {
  public AcademicYearProperty() {
    super();this._code = "ma7dfnq";
    this._name = "AcademicYear";
    this._label = "Año académico";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("ceip.shared.AcademicYears"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "AcademicYear";
  }
}
