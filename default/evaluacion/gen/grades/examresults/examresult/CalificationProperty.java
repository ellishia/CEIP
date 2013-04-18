package grades.examresults.examresult;

import org.monet.metamodel.NumberFieldProperty;

public class CalificationProperty extends NumberFieldProperty {
  public CalificationProperty() {
    super();this._code = "metjbqq";
    this._name = "Calification";
    this._label = "Nota";
    
  }
  
  public static String static_getName() {
    return "Calification";
  }
}
