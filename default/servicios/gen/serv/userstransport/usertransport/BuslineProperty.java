package serv.userstransport.usertransport;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class BuslineProperty extends LinkFieldProperty {
  public BuslineProperty() {
    super();this._code = "mh_nnbw";
    this._name = "Busline";
    this._label = "Ruta";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty1 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty1.setIndex(new org.monet.metamodel.internal.Ref("serv.Buslines.Indice"));
    this.setSource(sourceProperty1);
    
  }
  
  public static String static_getName() {
    return "Busline";
  }
}
