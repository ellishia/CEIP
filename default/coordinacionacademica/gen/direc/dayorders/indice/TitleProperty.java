package direc.dayorders.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class TitleProperty extends AttributeProperty {
  public TitleProperty() {
    super();this._code = "imcb_1xq";
    this._name = "Title";
    this._label = "Título";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Title";
  }
}
