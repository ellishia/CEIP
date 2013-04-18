package ceip.medicalissues;

import ceip.medicalissues.allergies.EspecifyProperty;
import ceip.medicalissues.allergies.HasProperty;
import ceip.medicalissues.allergies.ObservationsProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

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
    return ceip.medicalissues.Allergies.class;
  }
  
  public static String static_getName() {
    return "Allergies";
  }
  
  private final HasProperty Has = new ceip.medicalissues.allergies.HasProperty();
  
  private final EspecifyProperty Especify = new ceip.medicalissues.allergies.EspecifyProperty();
  
  private final ObservationsProperty Observations = new ceip.medicalissues.allergies.ObservationsProperty();
}
