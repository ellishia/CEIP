package doc.parentvisits.parentvisit;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class TitleProperty extends TextFieldProperty {
  public TitleProperty() {
    super();this._code = "my2knda";
    this._name = "Title";
    this._label = "Título";
    
  }
  
  public static String static_getName() {
    return "Title";
  }
}
