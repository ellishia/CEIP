package direc.groups.group;

import org.monet.metamodel.SerialFieldProperty;

@SuppressWarnings("all")
public class IdentifierProperty extends SerialFieldProperty {
  public IdentifierProperty() {
    super();this._code = "my2hhbg";
    this._name = "Identifier";
    this._label = "Id";
    org.monet.metamodel.SerialFieldProperty.SerialProperty serialProperty1 = new org.monet.metamodel.SerialFieldProperty.SerialProperty();
    serialProperty1.setFormat("%2S/%4Y");
    serialProperty1.setName("SerialName");
    this.setSerial(serialProperty1);
    
  }
  
  public static String static_getName() {
    return "Identifier";
  }
}
