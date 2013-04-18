package solicitud.medicalissues;

import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import solicitud.medicalissues.allergies.EspecifyProperty;
import solicitud.medicalissues.allergies.HasProperty;
import solicitud.medicalissues.allergies.ObservationsProperty;

@SuppressWarnings("all")
public class AllergiesProperty extends SectionFieldProperty implements HasBehaviour {
  public AllergiesProperty() {
    super();this._code = "mvq7lmg";
    this._name = "Allergies";
    this._label = "Alergias";
    this.addBooleanFieldProperty(Has);
    this.addTextFieldProperty(Especify);
    this.addTextFieldProperty(Observations);
    
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.medicalissues.Allergies.class;
  }
  
  public static String static_getName() {
    return "Allergies";
  }
  
  private final HasProperty Has = new solicitud.medicalissues.allergies.HasProperty();
  
  private final EspecifyProperty Especify = new solicitud.medicalissues.allergies.EspecifyProperty();
  
  private final ObservationsProperty Observations = new solicitud.medicalissues.allergies.ObservationsProperty();
}
