package serv.dailyrecords.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class BuslineProperty extends AttributeProperty {
  public BuslineProperty() {
    super();this._code = "m9bkhmq";
    this._name = "Busline";
    this._label = "Ruta";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.LINK;
    
  }
  
  public static String static_getName() {
    return "Busline";
  }
}
