package solicitud.applicationinfo.appliedcenters;

import org.monet.metamodel.SerialFieldProperty;

@SuppressWarnings("all")
public class PreferenceProperty extends SerialFieldProperty {
  public PreferenceProperty() {
    super();this._code = "mlw356q";
    this._name = "Preference";
    this._label = "Preferencia";
    org.monet.metamodel.SerialFieldProperty.SerialProperty serialProperty1 = new org.monet.metamodel.SerialFieldProperty.SerialProperty();
    serialProperty1.setFormat("%2S");
    serialProperty1.setName("SerialName");
    this.setSerial(serialProperty1);
    
  }
  
  public static String static_getName() {
    return "Preference";
  }
}
