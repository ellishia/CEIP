package doc.incidents.incident;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class RatingProperty extends TextFieldProperty {
  public RatingProperty() {
    super();this._code = "mjuljea";
    this._name = "Rating";
    this._label = "Valoración";
    
  }
  
  public static String static_getName() {
    return "Rating";
  }
}
