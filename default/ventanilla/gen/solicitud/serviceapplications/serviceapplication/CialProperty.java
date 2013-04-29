package solicitud.serviceapplications.serviceapplication;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class CialProperty extends TextFieldProperty {
  public CialProperty() {
    super();this._code = "mkijrzg";
    this._name = "Cial";
    this._label = "CIAL";
    org.monet.metamodel.TextFieldProperty.DisplayProperty displayProperty1 = new org.monet.metamodel.TextFieldProperty.DisplayProperty();
    displayProperty1.setMessage("Debe coincidir con el código de identificación del alumno introducido en la solicitud de plaza");
    this.getDisplayList().add(displayProperty1);
    
  }
  
  public static String static_getName() {
    return "Cial";
  }
}
