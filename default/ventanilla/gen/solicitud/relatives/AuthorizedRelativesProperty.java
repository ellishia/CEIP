package solicitud.relatives;

import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import solicitud.relatives.authorizedrelatives.OrderProperty;
import solicitud.relatives.authorizedrelatives.RelationProperty;
import solicitud.relatives.authorizedrelatives.TelephoneNumberProperty;
import solicitud.relatives.authorizedrelatives.TypeProperty;

@SuppressWarnings("all")
public class AuthorizedRelativesProperty extends SectionFieldProperty implements HasBehaviour {
  public AuthorizedRelativesProperty() {
    super();this._code = "msddxzw";
    this._name = "AuthorizedRelatives";
    this._label = "Familiares autorizados";
    this.setIsMultiple(true);
    this.addNumberFieldProperty(Order);
    this.addNumberFieldProperty(TelephoneNumber);
    this.addSelectFieldProperty(Type);
    this.addSelectFieldProperty(Relation);
    
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.relatives.AuthorizedRelatives.class;
  }
  
  public static String static_getName() {
    return "AuthorizedRelatives";
  }
  
  private final OrderProperty Order = new solicitud.relatives.authorizedrelatives.OrderProperty();
  
  private final TelephoneNumberProperty TelephoneNumber = new solicitud.relatives.authorizedrelatives.TelephoneNumberProperty();
  
  private final TypeProperty Type = new solicitud.relatives.authorizedrelatives.TypeProperty();
  
  private final RelationProperty Relation = new solicitud.relatives.authorizedrelatives.RelationProperty();
}
