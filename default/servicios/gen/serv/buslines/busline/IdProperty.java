package serv.buslines.busline;

import org.monet.metamodel.SerialFieldProperty;

@SuppressWarnings("all")
public class IdProperty extends SerialFieldProperty {
  public IdProperty() {
    super();this._code = "mm_pvtg";
    this._name = "Id";
    this._label = "Identificador";
    org.monet.metamodel.SerialFieldProperty.SerialProperty serialProperty1 = new org.monet.metamodel.SerialFieldProperty.SerialProperty();
    serialProperty1.setFormat("Ruta-%2S");
    serialProperty1.setName("Serial");
    this.setSerial(serialProperty1);
    
  }
  
  public static String static_getName() {
    return "Id";
  }
}
