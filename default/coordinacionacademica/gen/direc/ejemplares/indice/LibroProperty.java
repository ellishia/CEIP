package direc.ejemplares.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class LibroProperty extends AttributeProperty {
  public LibroProperty() {
    super();this._code = "mhetbgq";
    this._name = "Libro";
    this._label = "Libro";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "Libro";
  }
}
