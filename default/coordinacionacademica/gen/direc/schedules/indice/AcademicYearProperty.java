package direc.schedules.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class AcademicYearProperty extends AttributeProperty {
  public AcademicYearProperty() {
    super();this._code = "imci9utq";
    this._name = "AcademicYear";
    this._label = "Año Académico";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "AcademicYear";
  }
}
