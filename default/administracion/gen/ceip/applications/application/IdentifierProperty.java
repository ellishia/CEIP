package ceip.applications.application;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class IdentifierProperty extends TextFieldProperty {
  public IdentifierProperty() {
    super();this._code = "mmxps8a";
    this._name = "Identifier";
    this._label = "Código de Solicitud";
    this.setIsReadonly(true);
    
  }
  
  public static String static_getName() {
    return "Identifier";
  }
}
