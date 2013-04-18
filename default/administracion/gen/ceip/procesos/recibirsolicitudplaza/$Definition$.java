package ceip.procesos.recibirsolicitudplaza;

import ceip.procesos.recibirsolicitudplaza.inicial.WaitingDoorProperty;
import org.monet.metamodel.ServiceDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ServiceDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mrhsbha";
    this._name = "ceip.procesos.RecibirSolicitudPlaza";
    this._isAbstract = null;this._label = "RecibirPlaza";
    this._ontology = "SolicitudPlaza";
    org.monet.metamodel.ServiceDefinition.CustomerProperty customerProperty2 = new org.monet.metamodel.ServiceDefinition.CustomerProperty();
    org.monet.metamodel.ServiceDefinition.CustomerProperty.CustomerRequestProperty customerRequestProperty2 = new org.monet.metamodel.ServiceDefinition.CustomerProperty.CustomerRequestProperty();
    customerRequestProperty2.setCode("Premat");
    customerRequestProperty2.setName("Alumno");
    customerProperty2.addRequest(customerRequestProperty2);
    org.monet.metamodel.ServiceDefinition.CustomerProperty.CustomerResponseProperty customerResponseProperty5 = new org.monet.metamodel.ServiceDefinition.CustomerProperty.CustomerResponseProperty();
    customerResponseProperty5.setCode("PrematCorrecta");
    customerResponseProperty5.setName("Procesada");
    customerProperty2.addResponse(customerResponseProperty5);
    this.setCustomer(customerProperty2);
    org.monet.metamodel.ServiceDefinition.ServicePlaceProperty servicePlaceProperty10 = new org.monet.metamodel.ServiceDefinition.ServicePlaceProperty();
    servicePlaceProperty10.setCode("m2x4p_g");
    servicePlaceProperty10.setName("Inicial");
    servicePlaceProperty10.setIsInitial(true);
    servicePlaceProperty10.setDoorActionProperty(WaitingDoor);
    this.addPlace(servicePlaceProperty10);
    org.monet.metamodel.ServiceDefinition.ServicePlaceProperty servicePlaceProperty14 = new org.monet.metamodel.ServiceDefinition.ServicePlaceProperty();
    servicePlaceProperty14.setCode("mkh0efq");
    servicePlaceProperty14.setName("EnviarResultado");
    org.monet.metamodel.SendResponseActionProperty sendResponseActionProperty14 = new org.monet.metamodel.SendResponseActionProperty();
    sendResponseActionProperty14.setHistory("Recibida su solicitud");
    sendResponseActionProperty14.setResponse(new org.monet.metamodel.internal.Ref("Procesada","ceip.procesos.RecibirSolicitudPlaza","ceip.procesos.RecibirSolicitudPlaza.Procesada"));
    sendResponseActionProperty14.setLabel("Recibiendo solicitud");
    sendResponseActionProperty14.setGoto(new org.monet.metamodel.internal.Ref("Finalizar","ceip.procesos.RecibirSolicitudPlaza","ceip.procesos.RecibirSolicitudPlaza.Finalizar"));
    sendResponseActionProperty14.setCode("mq6avqq");
    servicePlaceProperty14.setSendResponseActionProperty(sendResponseActionProperty14);
    this.addPlace(servicePlaceProperty14);
    org.monet.metamodel.ServiceDefinition.ServicePlaceProperty servicePlaceProperty20 = new org.monet.metamodel.ServiceDefinition.ServicePlaceProperty();
    servicePlaceProperty20.setCode("muh7htq");
    servicePlaceProperty20.setName("Finalizar");
    servicePlaceProperty20.setIsFinal(true);
    this.addPlace(servicePlaceProperty20);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.procesos.recibirsolicitudplaza.$Definition$.class,"ceip.procesos.RecibirSolicitudPlaza",null);
  }
  }
  
  public static String static_getName() {
    return "RecibirSolicitudPlaza";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.procesos.RecibirSolicitudPlaza.class;
  }
  
  public String getClientBehaviour() {
    return "var mrhsbha = new Object();mrhsbha.refresh = function (node) {if (!node.isEditable()) return;};mrhsbha.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSubBehaviorClass(final String name) {
    int hash = name.hashCode();
     switch(hash) {
     case 606175198 :
    return ceip.procesos.recibirsolicitudplaza.CustomerBehavior.class;
    default: return null;
    }
  }
  
  private final WaitingDoorProperty WaitingDoor = new ceip.procesos.recibirsolicitudplaza.inicial.WaitingDoorProperty();
}
