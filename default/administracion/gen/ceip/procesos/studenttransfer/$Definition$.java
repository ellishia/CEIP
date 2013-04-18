package ceip.procesos.studenttransfer;

import ceip.procesos.studenttransfer.ProviderNameProperty;
import ceip.procesos.studenttransfer.bloqueo.DoorBloqueoProperty;
import org.monet.metamodel.ActivityDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ActivityDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "ms7xsyq";
    this._name = "ceip.procesos.StudentTransfer";
    this._isAbstract = null;this._label = "Transferir listado de alumnos/as";
    this._target = new org.monet.metamodel.internal.Ref("ceip.StudentsDoc");
    this._role = new org.monet.metamodel.internal.Ref("ceip.shared.Administrador");
    org.monet.metamodel.ActivityDefinition.ShortcutProperty shortcutProperty3 = new org.monet.metamodel.ActivityDefinition.ShortcutProperty();
    shortcutProperty3.setName("shIncidencia");
    this.addShortcut(shortcutProperty3);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty5 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty5.setCode("mqqdxza");
    activityPlaceProperty5.setName("Iniciado");
    activityPlaceProperty5.setIsInitial(true);
    org.monet.metamodel.LineActionProperty lineActionProperty6 = new org.monet.metamodel.LineActionProperty();
    lineActionProperty6.setLabel("Decidir si generar o no");
    lineActionProperty6.setCode("mf8ajyq");
    org.monet.metamodel.LineActionProperty.LineStopProperty lineStopProperty6 = new org.monet.metamodel.LineActionProperty.LineStopProperty();
    lineStopProperty6.setHistory("Se generará el listado de alumnos");
    lineStopProperty6.setGoto(new org.monet.metamodel.internal.Ref("Generado","ceip.procesos.StudentTransfer","ceip.procesos.StudentTransfer.Generado"));
    lineStopProperty6.setLabel("Se generará el listado de alumnos");
    lineStopProperty6.setCode("mea8i7g");
    lineStopProperty6.setName("Generar");
    lineActionProperty6.addStop(lineStopProperty6);
    org.monet.metamodel.LineActionProperty.LineStopProperty lineStopProperty10 = new org.monet.metamodel.LineActionProperty.LineStopProperty();
    lineStopProperty10.setHistory("Salir");
    lineStopProperty10.setGoto(new org.monet.metamodel.internal.Ref("Finalizado","ceip.procesos.StudentTransfer","ceip.procesos.StudentTransfer.Finalizado"));
    lineStopProperty10.setLabel("Salir");
    lineStopProperty10.setCode("mjpe8pw");
    lineStopProperty10.setName("Salir");
    lineActionProperty6.addStop(lineStopProperty10);
    activityPlaceProperty5.setLineActionProperty(lineActionProperty6);
    this.addPlace(activityPlaceProperty5);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty17 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty17.setCode("mqbx2ia");
    activityPlaceProperty17.setName("Generado");
    org.monet.metamodel.DelegationActionProperty delegationActionProperty17 = new org.monet.metamodel.DelegationActionProperty();
    delegationActionProperty17.setHistory("Generado el listado");
    delegationActionProperty17.setLabel("Generando Listado");
    delegationActionProperty17.setGoto(new org.monet.metamodel.internal.Ref("Enviando","ceip.procesos.StudentTransfer","ceip.procesos.StudentTransfer.Enviando"));
    delegationActionProperty17.setProvider(new org.monet.metamodel.internal.Ref("ProviderName","ceip.procesos.StudentTransfer","ceip.procesos.StudentTransfer.ProviderName"));
    delegationActionProperty17.setCode("mfyok5g");
    activityPlaceProperty17.setDelegationActionProperty(delegationActionProperty17);
    this.addPlace(activityPlaceProperty17);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty25 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty25.setCode("mujxbea");
    activityPlaceProperty25.setName("Enviando");
    org.monet.metamodel.SendRequestActionProperty sendRequestActionProperty25 = new org.monet.metamodel.SendRequestActionProperty();
    sendRequestActionProperty25.setLabel("Enviando Documento");
    sendRequestActionProperty25.setHistory("Documento enviado");
    sendRequestActionProperty25.setRequest(new org.monet.metamodel.internal.Ref("Alumnado","ceip.procesos.StudentTransfer","ceip.procesos.StudentTransfer.ProviderName.Alumnado"));
    sendRequestActionProperty25.setProvider(new org.monet.metamodel.internal.Ref("ProviderName","ceip.procesos.StudentTransfer","ceip.procesos.StudentTransfer.ProviderName"));
    sendRequestActionProperty25.setGoto(new org.monet.metamodel.internal.Ref("Bloqueo","ceip.procesos.StudentTransfer","ceip.procesos.StudentTransfer.Bloqueo"));
    sendRequestActionProperty25.setCode("m8i22bg");
    activityPlaceProperty25.setSendRequestActionProperty(sendRequestActionProperty25);
    this.addPlace(activityPlaceProperty25);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty32 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty32.setCode("mbc05gq");
    activityPlaceProperty32.setName("Bloqueo");
    activityPlaceProperty32.setDoorActionProperty(DoorBloqueo);
    this.addPlace(activityPlaceProperty32);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty34 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty34.setCode("mpaycha");
    activityPlaceProperty34.setName("MasRoles");
    this.addPlace(activityPlaceProperty34);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty36 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty36.setCode("mzbebbg");
    activityPlaceProperty36.setName("Finalizado");
    activityPlaceProperty36.setIsFinal(true);
    this.addPlace(activityPlaceProperty36);
    this.addTaskProviderProperty(ProviderName);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.procesos.studenttransfer.$Definition$.class,"ceip.procesos.StudentTransfer",null);
  }
  }
  
  public static String static_getName() {
    return "StudentTransfer";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.procesos.StudentTransfer.class;
  }
  
  public String getClientBehaviour() {
    return "var ms7xsyq = new Object();ms7xsyq.refresh = function (node) {if (!node.isEditable()) return;};ms7xsyq.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSubBehaviorClass(final String name) {
    int hash = name.hashCode();
     switch(hash) {
     case -466553977 :
    return ceip.procesos.studenttransfer.providername.ExternalBehavior.class;
    default: return null;
    }
  }
  
  private final DoorBloqueoProperty DoorBloqueo = new ceip.procesos.studenttransfer.bloqueo.DoorBloqueoProperty();
  
  private final ProviderNameProperty ProviderName = new ceip.procesos.studenttransfer.ProviderNameProperty();
}
