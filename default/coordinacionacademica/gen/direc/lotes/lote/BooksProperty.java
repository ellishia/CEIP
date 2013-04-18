package direc.lotes.lote;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class BooksProperty extends LinkFieldProperty {
  public BooksProperty() {
    super();this._code = "mpr5ogg";
    this._name = "Books";
    this._label = "Libros";
    this.setIsMultiple(true);
    this.setAllowAdd(true);
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty3 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty3.setIndex(new org.monet.metamodel.internal.Ref("direc.Ejemplares.Indice"));
    sourceProperty3.setCollection(new org.monet.metamodel.internal.Ref("direc.Ejemplares"));
    this.setSource(sourceProperty3);
    
  }
  
  public static String static_getName() {
    return "Books";
  }
}
