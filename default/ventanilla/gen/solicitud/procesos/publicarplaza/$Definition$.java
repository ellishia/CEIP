package solicitud.procesos.publicarplaza;

import org.monet.metamodel.ActivityDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import solicitud.procesos.publicarplaza.PreinscripcionProperty;
import solicitud.procesos.publicarplaza.esperandorespuesta.DoorRespuestaProperty;

@SuppressWarnings("all")
public class $Definition$ extends ActivityDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mtwh1yw";
    this._name = "solicitud.procesos.PublicarPlaza";
    this._isAbstract = null;this._label = "Preinscripción";
    this._target = new org.monet.metamodel.internal.Ref("solicitud.Application");
    this._role = new org.monet.metamodel.internal.Ref("solicitud.shared.Padre");
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty3 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty3.setCode("mfdyzbq");
    activityPlaceProperty3.setName("Inicial");
    activityPlaceProperty3.setIsInitial(true);
    org.monet.metamodel.LineActionProperty lineActionProperty4 = new org.monet.metamodel.LineActionProperty();
    lineActionProperty4.setLabel("Decidir si generar o no");
    lineActionProperty4.setCode("mf8ajyq");
    org.monet.metamodel.LineActionProperty.LineStopProperty lineStopProperty4 = new org.monet.metamodel.LineActionProperty.LineStopProperty();
    lineStopProperty4.setHistory("Se generará la preinscripción");
    lineStopProperty4.setGoto(new org.monet.metamodel.internal.Ref("Generado","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.Generado"));
    lineStopProperty4.setLabel("Se enviará la preinscripción");
    lineStopProperty4.setCode("mea8i7g");
    lineStopProperty4.setName("Generar");
    lineActionProperty4.addStop(lineStopProperty4);
    org.monet.metamodel.LineActionProperty.LineStopProperty lineStopProperty8 = new org.monet.metamodel.LineActionProperty.LineStopProperty();
    lineStopProperty8.setHistory("Salir");
    lineStopProperty8.setGoto(new org.monet.metamodel.internal.Ref("Finalizado","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.Finalizado"));
    lineStopProperty8.setLabel("Salir");
    lineStopProperty8.setCode("mjpe8pw");
    lineStopProperty8.setName("Salir");
    lineActionProperty4.addStop(lineStopProperty8);
    activityPlaceProperty3.setLineActionProperty(lineActionProperty4);
    this.addPlace(activityPlaceProperty3);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty15 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty15.setCode("mmirmbg");
    activityPlaceProperty15.setName("Generado");
    org.monet.metamodel.DelegationActionProperty delegationActionProperty15 = new org.monet.metamodel.DelegationActionProperty();
    delegationActionProperty15.setHistory("Generada la preinscripción");
    delegationActionProperty15.setLabel("Generando Preinscripción");
    delegationActionProperty15.setGoto(new org.monet.metamodel.internal.Ref("Enviando","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.Enviando"));
    delegationActionProperty15.setProvider(new org.monet.metamodel.internal.Ref("Preinscripcion","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.Preinscripcion"));
    delegationActionProperty15.setCode("mmt0mag");
    activityPlaceProperty15.setDelegationActionProperty(delegationActionProperty15);
    this.addPlace(activityPlaceProperty15);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty22 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty22.setCode("mooct_q");
    activityPlaceProperty22.setName("Enviando");
    org.monet.metamodel.SendRequestActionProperty sendRequestActionProperty22 = new org.monet.metamodel.SendRequestActionProperty();
    sendRequestActionProperty22.setLabel("Enviando Documento");
    sendRequestActionProperty22.setHistory("Documento enviado");
    sendRequestActionProperty22.setRequest(new org.monet.metamodel.internal.Ref("Alumno","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.Preinscripcion.Alumno"));
    sendRequestActionProperty22.setProvider(new org.monet.metamodel.internal.Ref("Preinscripcion","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.Preinscripcion"));
    sendRequestActionProperty22.setGoto(new org.monet.metamodel.internal.Ref("EsperandoRespuesta","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.EsperandoRespuesta"));
    sendRequestActionProperty22.setCode("mmtnz5a");
    activityPlaceProperty22.setSendRequestActionProperty(sendRequestActionProperty22);
    this.addPlace(activityPlaceProperty22);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty29 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty29.setCode("mufdlfw");
    activityPlaceProperty29.setName("EsperandoRespuesta");
    activityPlaceProperty29.setDoorActionProperty(DoorRespuesta);
    this.addPlace(activityPlaceProperty29);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty31 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty31.setCode("m2nagkg");
    activityPlaceProperty31.setName("Finalizado");
    activityPlaceProperty31.setIsFinal(true);
    this.addPlace(activityPlaceProperty31);
    this.addTaskProviderProperty(Preinscripcion);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.procesos.publicarplaza.$Definition$.class,"solicitud.procesos.PublicarPlaza",null);
  }
  }
  
  public static String static_getName() {
    return "PublicarPlaza";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.procesos.PublicarPlaza.class;
  }
  
  public String getClientBehaviour() {
    return "var mtwh1yw = new Object();mtwh1yw.refresh = function (node) {if (!node.isEditable()) return;};mtwh1yw.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSubBehaviorClass(final String name) {
    int hash = name.hashCode();
     switch(hash) {
     case -1815753807 :
    return solicitud.procesos.publicarplaza.preinscripcion.ExternalBehavior.class;
    default: return null;
    }
  }
  
  private final DoorRespuestaProperty DoorRespuesta = new solicitud.procesos.publicarplaza.esperandorespuesta.DoorRespuestaProperty();
  
  private final PreinscripcionProperty Preinscripcion = new solicitud.procesos.publicarplaza.PreinscripcionProperty();
}
