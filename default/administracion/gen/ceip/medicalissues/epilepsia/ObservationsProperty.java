package ceip.medicalissues.epilepsia;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class ObservationsProperty extends TextFieldProperty {
  public ObservationsProperty() {
    super();this._code = "mdt8ssq";
    this._name = "Observations";
    this._label = "Observaciones";
    
  }
  
  public static String static_getName() {
    return "Observations";
  }
}
