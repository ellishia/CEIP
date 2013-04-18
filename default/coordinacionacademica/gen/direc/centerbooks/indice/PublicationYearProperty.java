package direc.centerbooks.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class PublicationYearProperty extends AttributeProperty {
  public PublicationYearProperty() {
    super();this._code = "mcgr0eg";
    this._name = "PublicationYear";
    this._label = "Año de publicación";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "PublicationYear";
  }
}
