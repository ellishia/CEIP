package ceip.medicalissues;

import ceip.medicalissues.diabetes.HasProperty;
import ceip.medicalissues.diabetes.ObservationsProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

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
    return ceip.medicalissues.Diabetes.class;
  }
  
  public static String static_getName() {
    return "Diabetes";
  }
  
  private final HasProperty Has = new ceip.medicalissues.diabetes.HasProperty();
  
  private final ObservationsProperty Observations = new ceip.medicalissues.diabetes.ObservationsProperty();
}
