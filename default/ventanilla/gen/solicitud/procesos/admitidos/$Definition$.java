package solicitud.procesos.admitidos;

import org.monet.metamodel.ServiceDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import solicitud.procesos.admitidos.initial.WaitingDoorProperty;

@SuppressWarnings("all")
public class $Definition$ extends ServiceDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m5vlwaq";
    this._name = "solicitud.procesos.Admitidos";
    this._isAbstract = null;this._label = "Listado de Admitidos/as";
    this._ontology = "ListadoDeAdmitidos";
    org.monet.metamodel.ServiceDefinition.CustomerProperty customerProperty2 = new org.monet.metamodel.ServiceDefinition.CustomerProperty();
    org.monet.metamodel.ServiceDefinition.CustomerProperty.CustomerRequestProperty customerRequestProperty2 = new org.monet.metamodel.ServiceDefinition.CustomerProperty.CustomerRequestProperty();
    customerRequestProperty2.setCode("Admitidos");
    customerRequestProperty2.setName("Alumnado");
    customerProperty2.addRequest(customerRequestProperty2);
    this.setCustomer(customerProperty2);
    org.monet.metamodel.ServiceDefinition.ServicePlaceProperty servicePlaceProperty7 = new org.monet.metamodel.ServiceDefinition.ServicePlaceProperty();
    servicePlaceProperty7.setCode("mgl6u2a");
    servicePlaceProperty7.setName("Initial");
    servicePlaceProperty7.setIsInitial(true);
    servicePlaceProperty7.setDoorActionProperty(WaitingDoor);
    this.addPlace(servicePlaceProperty7);
    org.monet.metamodel.ServiceDefinition.ServicePlaceProperty servicePlaceProperty10 = new org.monet.metamodel.ServiceDefinition.ServicePlaceProperty();
    servicePlaceProperty10.setCode("mohkwzw");
    servicePlaceProperty10.setName("Final");
    servicePlaceProperty10.setIsFinal(true);
    this.addPlace(servicePlaceProperty10);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.procesos.admitidos.$Definition$.class,"solicitud.procesos.Admitidos",null);
  }
  }
  
  public static String static_getName() {
    return "Admitidos";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.procesos.Admitidos.class;
  }
  
  public String getClientBehaviour() {
    return "var m5vlwaq = new Object();m5vlwaq.refresh = function (node) {if (!node.isEditable()) return;};m5vlwaq.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSubBehaviorClass(final String name) {
    int hash = name.hashCode();
     switch(hash) {
     case 606175198 :
    return solicitud.procesos.admitidos.CustomerBehavior.class;
    default: return null;
    }
  }
  
  private final WaitingDoorProperty WaitingDoor = new solicitud.procesos.admitidos.initial.WaitingDoorProperty();
}
