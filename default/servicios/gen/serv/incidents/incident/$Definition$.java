package serv.incidents.incident;

import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import serv.incidents.incident.BusLineProperty;
import serv.incidents.incident.ClasificationProperty;
import serv.incidents.incident.DateProperty;
import serv.incidents.incident.DescriptionProperty;
import serv.incidents.incident.IdentifierProperty;
import serv.incidents.incident.ManagerProperty;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "ms3tapg";
    this._name = "serv.Incidents.Incident";
    this._isAbstract = null;this._label = "Incidencia";
    this.addDateFieldProperty(Date);
    this.addSerialFieldProperty(Identifier);
    this.addLinkFieldProperty(BusLine);
    this.addTextFieldProperty(Manager);
    this.addTextFieldProperty(Description);
    this.addSelectFieldProperty(Clasification);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.incidents.incident.$Definition$.class,"serv.Incidents.Incident",null);
  }
  }
  
  public static String static_getName() {
    return "Incident";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.incidents.Incident.class;
  }
  
  public String getClientBehaviour() {
    return "var ms3tapg = new Object();ms3tapg.refresh = function (node) {if (!node.isEditable()) return;};ms3tapg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final DateProperty Date = new serv.incidents.incident.DateProperty();
  
  private final IdentifierProperty Identifier = new serv.incidents.incident.IdentifierProperty();
  
  private final BusLineProperty BusLine = new serv.incidents.incident.BusLineProperty();
  
  private final ManagerProperty Manager = new serv.incidents.incident.ManagerProperty();
  
  private final DescriptionProperty Description = new serv.incidents.incident.DescriptionProperty();
  
  private final ClasificationProperty Clasification = new serv.incidents.incident.ClasificationProperty();
}
