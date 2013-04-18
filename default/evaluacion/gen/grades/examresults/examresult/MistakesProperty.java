package grades.examresults.examresult;

import org.monet.metamodel.TextFieldProperty;

public class MistakesProperty extends TextFieldProperty {
  public MistakesProperty() {
    super();this._code = "mbcicgg";
    this._name = "Mistakes";
    this._label = "Errores";
    
  }
  
  public static String static_getName() {
    return "Mistakes";
  }
}
