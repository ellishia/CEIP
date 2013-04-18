package doc.examdocs.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class NameProperty extends AttributeProperty {
  public NameProperty() {
    super();this._code = "imlb9i_q";
    this._name = "Name";
    this._label = "Nombre";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Name";
  }
}
