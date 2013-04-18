package solicitud.applicationinfo;

import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import solicitud.applicationinfo.appliedcenters.CenterNameProperty;
import solicitud.applicationinfo.appliedcenters.PreferenceProperty;

@SuppressWarnings("all")
public class AppliedCentersProperty extends SectionFieldProperty implements HasBehaviour {
  public AppliedCentersProperty() {
    super();this._code = "mnrz7cg";
    this._name = "AppliedCenters";
    this._label = "Centro Solicitado";
    this.setIsMultiple(true);
    this.addSerialFieldProperty(Preference);
    this.addTextFieldProperty(CenterName);
    
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.applicationinfo.AppliedCenters.class;
  }
  
  public static String static_getName() {
    return "AppliedCenters";
  }
  
  private final PreferenceProperty Preference = new solicitud.applicationinfo.appliedcenters.PreferenceProperty();
  
  private final CenterNameProperty CenterName = new solicitud.applicationinfo.appliedcenters.CenterNameProperty();
}
