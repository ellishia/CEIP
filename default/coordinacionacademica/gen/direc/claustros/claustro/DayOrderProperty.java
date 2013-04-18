package direc.claustros.claustro;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class DayOrderProperty extends LinkFieldProperty {
  public DayOrderProperty() {
    super();this._code = "mys3hfg";
    this._name = "DayOrder";
    this._label = "Orden del día";
    this.setIsRequired(true);
    this.setAllowAdd(true);
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty3 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty3.setIndex(new org.monet.metamodel.internal.Ref("direc.DayOrders.Indice"));
    sourceProperty3.setCollection(new org.monet.metamodel.internal.Ref("direc.DayOrders"));
    this.setSource(sourceProperty3);
    
  }
  
  public static String static_getName() {
    return "DayOrder";
  }
}
