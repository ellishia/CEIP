package direc.students.student;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class Date_of_BirthProperty extends DateFieldProperty {
  public Date_of_BirthProperty() {
    super();this._code = "mvaa1yq";
    this._name = "Date_of_Birth";
    this._precision = org.monet.metamodel.DateFieldPropertyBase.PrecisionEnumeration.DAYS;
    this._label = "Fecha de nacimiento";
    
  }
  
  public static String static_getName() {
    return "Date_of_Birth";
  }
}
