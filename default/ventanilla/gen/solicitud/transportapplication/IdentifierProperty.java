package solicitud.transportapplication;

import org.monet.metamodel.SerialFieldProperty;

@SuppressWarnings("all")
public class IdentifierProperty extends SerialFieldProperty {
  public IdentifierProperty() {
    super();this._code = "mni5_ug";
    this._name = "Identifier";
    this._label = "Código de Solicitud";
    org.monet.metamodel.SerialFieldProperty.SerialProperty serialProperty1 = new org.monet.metamodel.SerialFieldProperty.SerialProperty();
    serialProperty1.setFormat("Transportes-%4S/%2Y");
    serialProperty1.setName("IdName");
    this.setSerial(serialProperty1);
    
  }
  
  public static String static_getName() {
    return "Identifier";
  }
}
