package solicitud.medicalissues;

import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import solicitud.medicalissues.diabetes.HasProperty;
import solicitud.medicalissues.diabetes.ObservationsProperty;

@SuppressWarnings("all")
public class DiabetesProperty extends SectionFieldProperty implements HasBehaviour {
  public DiabetesProperty() {
    super();this._code = "mriye3g";
    this._name = "Diabetes";
    this._label = "Diabetes";
    this.addBooleanFieldProperty(Has);
    this.addTextFieldProperty(Observations);
    
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.medicalissues.Diabetes.class;
  }
  
  public static String static_getName() {
    return "Diabetes";
  }
  
  private final HasProperty Has = new solicitud.medicalissues.diabetes.HasProperty();
  
  private final ObservationsProperty Observations = new solicitud.medicalissues.diabetes.ObservationsProperty();
}
