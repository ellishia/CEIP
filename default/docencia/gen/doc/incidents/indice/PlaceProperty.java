package doc.incidents.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class PlaceProperty extends AttributeProperty {
  public PlaceProperty() {
    super();this._code = "imqtitkw";
    this._name = "Place";
    this._label = "Lugar";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Place";
  }
}
