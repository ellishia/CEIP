package ceip.applications.application;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class CialProperty extends TextFieldProperty {
  public CialProperty() {
    super();this._code = "mzcn8kg";
    this._name = "Cial";
    this._label = "CIAL";
    this.setIsReadonly(true);
    
  }
  
  public static String static_getName() {
    return "Cial";
  }
}
