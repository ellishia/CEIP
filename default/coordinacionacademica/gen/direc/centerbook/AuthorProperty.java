package direc.centerbook;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class AuthorProperty extends TextFieldProperty {
  public AuthorProperty() {
    super();this._code = "meagbsg";
    this._name = "Author";
    this._label = "Autor";
    
  }
  
  public static String static_getName() {
    return "Author";
  }
}
