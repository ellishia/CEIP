package solicitud.medicalissues;

import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import solicitud.medicalissues.epilepsia.HasProperty;
import solicitud.medicalissues.epilepsia.ObservationsProperty;

@SuppressWarnings("all")
public class EpilepsiaProperty extends SectionFieldProperty implements HasBehaviour {
  public EpilepsiaProperty() {
    super();this._code = "m4erfca";
    this._name = "Epilepsia";
    this._label = "Epilepsia";
    this.addBooleanFieldProperty(Has);
    this.addTextFieldProperty(Observations);
    
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.medicalissues.Epilepsia.class;
  }
  
  public static String static_getName() {
    return "Epilepsia";
  }
  
  private final HasProperty Has = new solicitud.medicalissues.epilepsia.HasProperty();
  
  private final ObservationsProperty Observations = new solicitud.medicalissues.epilepsia.ObservationsProperty();
}
