package direc.ejemplares.ejemplar;

import org.monet.metamodel.SerialFieldProperty;

@SuppressWarnings("all")
public class CodigoProperty extends SerialFieldProperty {
  public CodigoProperty() {
    super();this._code = "mp3xssa";
    this._name = "Codigo";
    this._label = "ISBN";
    org.monet.metamodel.SerialFieldProperty.SerialProperty serialProperty1 = new org.monet.metamodel.SerialFieldProperty.SerialProperty();
    serialProperty1.setFormat("L-%6S-%2Y");
    serialProperty1.setName("identificadorLibro");
    this.setSerial(serialProperty1);
    
  }
  
  public static String static_getName() {
    return "Codigo";
  }
}
