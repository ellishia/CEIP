package ceip.medicalissues;

import ceip.medicalissues.others.EspecifyProperty;
import ceip.medicalissues.others.HasProperty;
import ceip.medicalissues.others.ObservationsProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

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
    return ceip.medicalissues.Others.class;
  }
  
  public static String static_getName() {
    return "Others";
  }
  
  private final HasProperty Has = new ceip.medicalissues.others.HasProperty();
  
  private final EspecifyProperty Especify = new ceip.medicalissues.others.EspecifyProperty();
  
  private final ObservationsProperty Observations = new ceip.medicalissues.others.ObservationsProperty();
}
