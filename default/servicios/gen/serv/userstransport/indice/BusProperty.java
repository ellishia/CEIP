package serv.userstransport.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class BusProperty extends AttributeProperty {
  public BusProperty() {
    super();this._code = "mnjokeq";
    this._name = "Bus";
    this._label = "Ruta";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.LINK;
    
  }
  
  public static String static_getName() {
    return "Bus";
  }
}
