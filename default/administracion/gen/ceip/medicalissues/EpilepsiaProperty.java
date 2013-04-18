package ceip.medicalissues;

import ceip.medicalissues.epilepsia.HasProperty;
import ceip.medicalissues.epilepsia.ObservationsProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

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
    return ceip.medicalissues.Epilepsia.class;
  }
  
  public static String static_getName() {
    return "Epilepsia";
  }
  
  private final HasProperty Has = new ceip.medicalissues.epilepsia.HasProperty();
  
  private final ObservationsProperty Observations = new ceip.medicalissues.epilepsia.ObservationsProperty();
}
