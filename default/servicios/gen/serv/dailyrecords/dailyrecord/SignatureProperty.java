package serv.dailyrecords.dailyrecord;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class SignatureProperty extends TextFieldProperty {
  public SignatureProperty() {
    super();this._code = "mspsatw";
    this._name = "Signature";
    this._label = "Firma";
    
  }
  
  public static String static_getName() {
    return "Signature";
  }
}
