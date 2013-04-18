package ceip.relatives;

import ceip.relatives.authorizedrelatives.OrderProperty;
import ceip.relatives.authorizedrelatives.RelationProperty;
import ceip.relatives.authorizedrelatives.TelephoneNumberProperty;
import ceip.relatives.authorizedrelatives.TypeProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

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
    return ceip.relatives.AuthorizedRelatives.class;
  }
  
  public static String static_getName() {
    return "AuthorizedRelatives";
  }
  
  private final OrderProperty Order = new ceip.relatives.authorizedrelatives.OrderProperty();
  
  private final TelephoneNumberProperty TelephoneNumber = new ceip.relatives.authorizedrelatives.TelephoneNumberProperty();
  
  private final TypeProperty Type = new ceip.relatives.authorizedrelatives.TypeProperty();
  
  private final RelationProperty Relation = new ceip.relatives.authorizedrelatives.RelationProperty();
}
