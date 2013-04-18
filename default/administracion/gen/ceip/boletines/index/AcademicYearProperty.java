package ceip.boletines.index;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class AcademicYearProperty extends AttributeProperty {
  public AcademicYearProperty() {
    super();this._code = "mviej6q";
    this._name = "AcademicYear";
    this._label = "Año Académico";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "AcademicYear";
  }
}
