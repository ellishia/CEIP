package direc.teachers.teacher;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class TeachingSinceProperty extends DateFieldProperty {
  public TeachingSinceProperty() {
    super();this._code = "m_ybwew";
    this._name = "TeachingSince";
    this._label = "En la docencia desde";
    this._precision = org.monet.metamodel.DateFieldPropertyBase.PrecisionEnumeration.MONTHS;
    
  }
  
  public static String static_getName() {
    return "TeachingSince";
  }
}
