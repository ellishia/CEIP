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
    org.monet.metamodel.ActivityDefinition.ShortcutProperty shortcutProperty2 = new org.monet.metamodel.ActivityDefinition.ShortcutProperty();
    shortcutProperty2.setName("shServiceApplications");
    this.addShortcut(shortcutProperty2);
    this._role = new org.monet.metamodel.internal.Ref("solicitud.shared.Padre");
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty5 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty5.setCode("mfdyzbq");
    activityPlaceProperty5.setName("Inicial");
    activityPlaceProperty5.setIsInitial(true);
    org.monet.metamodel.LineActionProperty lineActionProperty6 = new org.monet.metamodel.LineActionProperty();
    lineActionProperty6.setLabel("Decidir si generar o no");
    lineActionProperty6.setCode("mf8ajyq");
    org.monet.metamodel.LineActionProperty.LineStopProperty lineStopProperty6 = new org.monet.metamodel.LineActionProperty.LineStopProperty();
    lineStopProperty6.setHistory("Se generará la preinscripción");
    lineStopProperty6.setGoto(new org.monet.metamodel.internal.Ref("Recopilado","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.Recopilado"));
    lineStopProperty6.setLabel("Presentar la preinscripción");
    lineStopProperty6.setCode("mea8i7g");
    lineStopProperty6.setName("Generar");
    lineActionProperty6.addStop(lineStopProperty6);
    org.monet.metamodel.LineActionProperty.LineStopProperty lineStopProperty10 = new org.monet.metamodel.LineActionProperty.LineStopProperty();
    lineStopProperty10.setHistory("Salir");
    lineStopProperty10.setGoto(new org.monet.metamodel.internal.Ref("Finalizado","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.Finalizado"));
    lineStopProperty10.setLabel("Salir");
    lineStopProperty10.setCode("mjpe8pw");
    lineStopProperty10.setName("Salir");
    lineActionProperty6.addStop(lineStopProperty10);
    activityPlaceProperty5.setLineActionProperty(lineActionProperty6);
    this.addPlace(activityPlaceProperty5);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty17 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty17.setCode("mymsurw");
    activityPlaceProperty17.setName("Recopilado");
    this.addPlace(activityPlaceProperty17);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty19 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty19.setCode("mri47fw");
    activityPlaceProperty19.setName("AnadirEscoge");
    this.addPlace(activityPlaceProperty19);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty21 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty21.setCode("mtbyd1q");
    activityPlaceProperty21.setName("AnadirTrans");
    org.monet.metamodel.LineActionProperty lineActionProperty22 = new org.monet.metamodel.LineActionProperty();
    lineActionProperty22.setLabel("Decidir si añadir o no");
    lineActionProperty22.setCode("mcqfsjq");
    org.monet.metamodel.LineActionProperty.LineStopProperty lineStopProperty22 = new org.monet.metamodel.LineActionProperty.LineStopProperty();
    lineStopProperty22.setHistory("Se ha adjuntado una solicitud de transporte");
    lineStopProperty22.setGoto(new org.monet.metamodel.internal.Ref("RedirigidoTrans","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.RedirigidoTrans"));
    lineStopProperty22.setLabel("Se añadirá una solicitud de transporte");
    lineStopProperty22.setCode("mozytya");
    lineStopProperty22.setName("Add");
    lineActionProperty22.addStop(lineStopProperty22);
    org.monet.metamodel.LineActionProperty.LineStopProperty lineStopProperty26 = new org.monet.metamodel.LineActionProperty.LineStopProperty();
    lineStopProperty26.setHistory("Continuar");
    lineStopProperty26.setGoto(new org.monet.metamodel.internal.Ref("AnadirEscoge","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.AnadirEscoge"));
    lineStopProperty26.setLabel("Continuar");
    lineStopProperty26.setCode("ma1unsg");
    lineStopProperty26.setName("Seguir");
    lineActionProperty22.addStop(lineStopProperty26);
    activityPlaceProperty21.setLineActionProperty(lineActionProperty22);
    this.addPlace(activityPlaceProperty21);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty33 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty33.setCode("m8xoz1a");
    activityPlaceProperty33.setName("Anadir");
    org.monet.metamodel.LineActionProperty lineActionProperty34 = new org.monet.metamodel.LineActionProperty();
    lineActionProperty34.setLabel("Decidir si añadir o no");
    lineActionProperty34.setCode("mcqfsjq");
    org.monet.metamodel.LineActionProperty.LineStopProperty lineStopProperty34 = new org.monet.metamodel.LineActionProperty.LineStopProperty();
    lineStopProperty34.setHistory("Se ha adjuntado una solicitud");
    lineStopProperty34.setGoto(new org.monet.metamodel.internal.Ref("Redirigido","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.Redirigido"));
    lineStopProperty34.setLabel("Se añadirá una solicitud de comedor");
    lineStopProperty34.setCode("mozytya");
    lineStopProperty34.setName("Add");
    lineActionProperty34.addStop(lineStopProperty34);
    org.monet.metamodel.LineActionProperty.LineStopProperty lineStopProperty38 = new org.monet.metamodel.LineActionProperty.LineStopProperty();
    lineStopProperty38.setHistory("Continuar");
    lineStopProperty38.setGoto(new org.monet.metamodel.internal.Ref("AnadirEscoge","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.AnadirEscoge"));
    lineStopProperty38.setLabel("Continuar");
    lineStopProperty38.setCode("ma1unsg");
    lineStopProperty38.setName("Seguir");
    lineActionProperty34.addStop(lineStopProperty38);
    activityPlaceProperty33.setLineActionProperty(lineActionProperty34);
    this.addPlace(activityPlaceProperty33);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty45 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty45.setCode("mlwztba");
    activityPlaceProperty45.setName("RedirigidoTrans");
    org.monet.metamodel.EditionActionProperty editionActionProperty45 = new org.monet.metamodel.EditionActionProperty();
    editionActionProperty45.setGoto(new org.monet.metamodel.internal.Ref("AnadirEscoge","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.AnadirEscoge"));
    editionActionProperty45.setHistory("Se ha añadido solicitud");
    editionActionProperty45.setLabel("Añadir solicitud de transporte");
    editionActionProperty45.setCode("msacpda");
    org.monet.metamodel.EditionActionProperty.UseProperty useProperty48 = new org.monet.metamodel.EditionActionProperty.UseProperty();
    useProperty48.setForm(new org.monet.metamodel.internal.Ref("solicitud.TransportApplication"));
    useProperty48.setWithView(new org.monet.metamodel.internal.Ref("Vista","solicitud.TransportApplication","solicitud.TransportApplication.Vista"));
    editionActionProperty45.setUse(useProperty48);
    activityPlaceProperty45.setEditionActionProperty(editionActionProperty45);
    this.addPlace(activityPlaceProperty45);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty54 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty54.setCode("mfftfvq");
    activityPlaceProperty54.setName("Redirigido");
    org.monet.metamodel.EditionActionProperty editionActionProperty54 = new org.monet.metamodel.EditionActionProperty();
    editionActionProperty54.setGoto(new org.monet.metamodel.internal.Ref("AnadirEscoge","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.AnadirEscoge"));
    editionActionProperty54.setHistory("Se ha añadido solicitud");
    editionActionProperty54.setLabel("Añadir solicitud");
    editionActionProperty54.setCode("mta5arw");
    org.monet.metamodel.EditionActionProperty.UseProperty useProperty57 = new org.monet.metamodel.EditionActionProperty.UseProperty();
    useProperty57.setForm(new org.monet.metamodel.internal.Ref("solicitud.CanteenApplication"));
    useProperty57.setWithView(new org.monet.metamodel.internal.Ref("Vista","solicitud.CanteenApplication","solicitud.CanteenApplication.Vista"));
    editionActionProperty54.setUse(useProperty57);
    activityPlaceProperty54.setEditionActionProperty(editionActionProperty54);
    this.addPlace(activityPlaceProperty54);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty63 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty63.setCode("mmirmbg");
    activityPlaceProperty63.setName("Generado");
    org.monet.metamodel.DelegationActionProperty delegationActionProperty63 = new org.monet.metamodel.DelegationActionProperty();
    delegationActionProperty63.setHistory("Generada la preinscripción");
    delegationActionProperty63.setLabel("Generando Preinscripción");
    delegationActionProperty63.setGoto(new org.monet.metamodel.internal.Ref("Enviando","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.Enviando"));
    delegationActionProperty63.setProvider(new org.monet.metamodel.internal.Ref("Preinscripcion","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.Preinscripcion"));
    delegationActionProperty63.setCode("mmt0mag");
    activityPlaceProperty63.setDelegationActionProperty(delegationActionProperty63);
    this.addPlace(activityPlaceProperty63);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty70 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty70.setCode("mooct_q");
    activityPlaceProperty70.setName("Enviando");
    org.monet.metamodel.SendRequestActionProperty sendRequestActionProperty70 = new org.monet.metamodel.SendRequestActionProperty();
    sendRequestActionProperty70.setLabel("Enviando Documento");
    sendRequestActionProperty70.setHistory("Documento enviado");
    sendRequestActionProperty70.setRequest(new org.monet.metamodel.internal.Ref("Alumno","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.Preinscripcion.Alumno"));
    sendRequestActionProperty70.setProvider(new org.monet.metamodel.internal.Ref("Preinscripcion","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.Preinscripcion"));
    sendRequestActionProperty70.setGoto(new org.monet.metamodel.internal.Ref("EsperandoRespuesta","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.EsperandoRespuesta"));
    sendRequestActionProperty70.setCode("mmtnz5a");
    activityPlaceProperty70.setSendRequestActionProperty(sendRequestActionProperty70);
    this.addPlace(activityPlaceProperty70);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty77 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty77.setCode("mufdlfw");
    activityPlaceProperty77.setName("EsperandoRespuesta");
    activityPlaceProperty77.setDoorActionProperty(DoorRespuesta);
    this.addPlace(activityPlaceProperty77);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty79 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty79.setCode("m2nagkg");
    activityPlaceProperty79.setName("Finalizado");
    activityPlaceProperty79.setIsFinal(true);
    this.addPlace(activityPlaceProperty79);
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
