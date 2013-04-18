package direc.procesos.studenttransfer;

import direc.procesos.studenttransfer.inicial.WaitingDoorProperty;
import org.monet.metamodel.ServiceDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ServiceDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mzellkg";
    this._name = "direc.procesos.StudentTransfer";
    this._isAbstract = null;this._label = "Listado de Alumnado";
    this._ontology = "1b095c4e-021d-4d36-998e-6d493757d4c9";
    org.monet.metamodel.ServiceDefinition.CustomerProperty customerProperty2 = new org.monet.metamodel.ServiceDefinition.CustomerProperty();
    org.monet.metamodel.ServiceDefinition.CustomerProperty.CustomerRequestProperty customerRequestProperty2 = new org.monet.metamodel.ServiceDefinition.CustomerProperty.CustomerRequestProperty();
    customerRequestProperty2.setCode("Alumnado");
    customerRequestProperty2.setName("Alumnado");
    customerProperty2.addRequest(customerRequestProperty2);
    this.setCustomer(customerProperty2);
    org.monet.metamodel.ServiceDefinition.ServicePlaceProperty servicePlaceProperty7 = new org.monet.metamodel.ServiceDefinition.ServicePlaceProperty();
    servicePlaceProperty7.setCode("m2x4p_g");
    servicePlaceProperty7.setName("Inicial");
    servicePlaceProperty7.setIsInitial(true);
    servicePlaceProperty7.setDoorActionProperty(WaitingDoor);
    this.addPlace(servicePlaceProperty7);
    org.monet.metamodel.ServiceDefinition.ServicePlaceProperty servicePlaceProperty11 = new org.monet.metamodel.ServiceDefinition.ServicePlaceProperty();
    servicePlaceProperty11.setCode("muh7htq");
    servicePlaceProperty11.setName("Finalizar");
    servicePlaceProperty11.setIsFinal(true);
    this.addPlace(servicePlaceProperty11);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.procesos.studenttransfer.$Definition$.class,"direc.procesos.StudentTransfer",null);
  }
  }
  
  public static String static_getName() {
    return "StudentTransfer";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.procesos.StudentTransfer.class;
  }
  
  public String getClientBehaviour() {
    return "var mzellkg = new Object();mzellkg.refresh = function (node) {if (!node.isEditable()) return;};mzellkg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSubBehaviorClass(final String name) {
    int hash = name.hashCode();
     switch(hash) {
     case 606175198 :
    return direc.procesos.studenttransfer.CustomerBehavior.class;
    default: return null;
    }
  }
  
  private final WaitingDoorProperty WaitingDoor = new direc.procesos.studenttransfer.inicial.WaitingDoorProperty();
}
