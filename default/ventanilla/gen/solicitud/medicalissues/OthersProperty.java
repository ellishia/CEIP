package solicitud.medicalissues;

import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import solicitud.medicalissues.others.EspecifyProperty;
import solicitud.medicalissues.others.HasProperty;
import solicitud.medicalissues.others.ObservationsProperty;

@SuppressWarnings("all")
public class OthersProperty extends SectionFieldProperty implements HasBehaviour {
  public OthersProperty() {
    super();this._code = "mknlj_a";
    this._name = "Others";
    this._label = "Otros";
    this.addBooleanFieldProperty(Has);
    this.addTextFieldProperty(Especify);
    this.addTextFieldProperty(Observations);
    
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.medicalissues.Others.class;
  }
  
  public static String static_getName() {
    return "Others";
  }
  
  private final HasProperty Has = new solicitud.medicalissues.others.HasProperty();
  
  private final EspecifyProperty Especify = new solicitud.medicalissues.others.EspecifyProperty();
  
  private final ObservationsProperty Observations = new solicitud.medicalissues.others.ObservationsProperty();
}
