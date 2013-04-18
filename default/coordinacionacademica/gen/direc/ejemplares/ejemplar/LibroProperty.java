package direc.ejemplares.ejemplar;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class LibroProperty extends LinkFieldProperty {
  public LibroProperty() {
    super();this._code = "m8pawmw";
    this._name = "Libro";
    this._label = "Libro";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty1 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty1.setIndex(new org.monet.metamodel.internal.Ref("direc.CenterBooks.Indice"));
    this.setSource(sourceProperty1);
    
  }
  
  public static String static_getName() {
    return "Libro";
  }
}
