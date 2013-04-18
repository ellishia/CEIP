package direc.centerbook;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class PublicationYearProperty extends DateFieldProperty {
  public PublicationYearProperty() {
    super();this._code = "m4hgvha";
    this._name = "PublicationYear";
    this._precision = org.monet.metamodel.DateFieldPropertyBase.PrecisionEnumeration.YEARS;
    this._label = "Año de Publicación";
    
  }
  
  public static String static_getName() {
    return "PublicationYear";
  }
}
