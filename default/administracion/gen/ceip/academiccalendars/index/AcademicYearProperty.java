package ceip.academiccalendars.index;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class AcademicYearProperty extends AttributeProperty {
  public AcademicYearProperty() {
    super();this._code = "mbqd4gw";
    this._name = "academicYear";
    this._label = "Año Académico";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "academicYear";
  }
}
