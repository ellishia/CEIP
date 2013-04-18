package serv.incidents.incident;

import org.monet.metamodel.SerialFieldProperty;

@SuppressWarnings("all")
public class IdentifierProperty extends SerialFieldProperty {
  public IdentifierProperty() {
    super();this._code = "my8jdta";
    this._name = "Identifier";
    this._label = "Identificador";
    org.monet.metamodel.SerialFieldProperty.SerialProperty serialProperty1 = new org.monet.metamodel.SerialFieldProperty.SerialProperty();
    serialProperty1.setFormat("I-%4S");
    serialProperty1.setName("SerialName");
    this.setSerial(serialProperty1);
    
  }
  
  public static String static_getName() {
    return "Identifier";
  }
}
