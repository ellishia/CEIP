package ceip.academiccalendars.academiccalendar;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class AcademicYearProperty extends SelectFieldProperty {
  public AcademicYearProperty() {
    super();this._code = "m7hqppa";
    this._name = "AcademicYear";
    this._label = "Año Académico";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("ceip.shared.AcademicYears"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "AcademicYear";
  }
}
