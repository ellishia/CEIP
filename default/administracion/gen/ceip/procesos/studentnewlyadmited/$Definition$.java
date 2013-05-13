package ceip.procesos.studentnewlyadmited;

import ceip.procesos.studentnewlyadmited.ProviderNameProperty;
import org.monet.metamodel.ActivityDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ActivityDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mbtuuja";
    this._name = "ceip.procesos.StudentNewlyAdmited";
    this._isAbstract = null;this._label = "Transferir listado de nuevos admitidos/as";
    this._target = new org.monet.metamodel.internal.Ref("ceip.AdmitedDoc");
    this._role = new org.monet.metamodel.internal.Ref("ceip.shared.Administrador");
    org.monet.metamodel.ActivityDefinition.ShortcutProperty shortcutProperty3 = new org.monet.metamodel.ActivityDefinition.ShortcutProperty();
    shortcutProperty3.setName("shIncidencia");
    this.addShortcut(shortcutProperty3);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty5 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty5.setCode("mzqjoiw");
    activityPlaceProperty5.setName("Iniciado");
    activityPlaceProperty5.setIsInitial(true);
    org.monet.metamodel.LineActionProperty lineActionProperty6 = new org.monet.metamodel.LineActionProperty();
    lineActionProperty6.setLabel("Decidir si generar o no");
    lineActionProperty6.setCode("mgblztw");
    org.monet.metamodel.LineActionProperty.LineStopProperty lineStopProperty6 = new org.monet.metamodel.LineActionProperty.LineStopProperty();
    lineStopProperty6.setHistory("Se generará el listado de admitidos");
    lineStopProperty6.setGoto(new org.monet.metamodel.internal.Ref("Generado","ceip.procesos.StudentNewlyAdmited","ceip.procesos.StudentNewlyAdmited.Generado"));
    lineStopProperty6.setLabel("Se generará el listado de admitidos");
    lineStopProperty6.setCode("mjlin2w");
    lineStopProperty6.setName("Generar");
    lineActionProperty6.addStop(lineStopProperty6);
    org.monet.metamodel.LineActionProperty.LineStopProperty lineStopProperty10 = new org.monet.metamodel.LineActionProperty.LineStopProperty();
    lineStopProperty10.setHistory("Salir");
    lineStopProperty10.setGoto(new org.monet.metamodel.internal.Ref("Finalizado","ceip.procesos.StudentNewlyAdmited","ceip.procesos.StudentNewlyAdmited.Finalizado"));
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
    delegationActionProperty17.setGoto(new org.monet.metamodel.internal.Ref("Enviando","ceip.procesos.StudentNewlyAdmited","ceip.procesos.StudentNewlyAdmited.Enviando"));
    delegationActionProperty17.setProvider(new org.monet.metamodel.internal.Ref("ProviderName","ceip.procesos.StudentNewlyAdmited","ceip.procesos.StudentNewlyAdmited.ProviderName"));
    delegationActionProperty17.setCode("mmnkhjw");
    activityPlaceProperty17.setDelegationActionProperty(delegationActionProperty17);
    this.addPlace(activityPlaceProperty17);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty24 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty24.setCode("mujxbea");
    activityPlaceProperty24.setName("Enviando");
    org.monet.metamodel.SendRequestActionProperty sendRequestActionProperty24 = new org.monet.metamodel.SendRequestActionProperty();
    sendRequestActionProperty24.setLabel("Enviando Documento");
    sendRequestActionProperty24.setHistory("Documento enviado");
    sendRequestActionProperty24.setRequest(new org.monet.metamodel.internal.Ref("Admitidos","ceip.procesos.StudentNewlyAdmited","ceip.procesos.StudentNewlyAdmited.ProviderName.Admitidos"));
    sendRequestActionProperty24.setProvider(new org.monet.metamodel.internal.Ref("ProviderName","ceip.procesos.StudentNewlyAdmited","ceip.procesos.StudentNewlyAdmited.ProviderName"));
    sendRequestActionProperty24.setGoto(new org.monet.metamodel.internal.Ref("Finalizado","ceip.procesos.StudentNewlyAdmited","ceip.procesos.StudentNewlyAdmited.Finalizado"));
    sendRequestActionProperty24.setCode("m8i22bg");
    activityPlaceProperty24.setSendRequestActionProperty(sendRequestActionProperty24);
    this.addPlace(activityPlaceProperty24);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty31 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty31.setCode("mzbebbg");
    activityPlaceProperty31.setName("Finalizado");
    activityPlaceProperty31.setIsFinal(true);
    this.addPlace(activityPlaceProperty31);
    this.addTaskProviderProperty(ProviderName);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.procesos.studentnewlyadmited.$Definition$.class,"ceip.procesos.StudentNewlyAdmited",null);
  }
  }
  
  public static String static_getName() {
    return "StudentNewlyAdmited";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.procesos.StudentNewlyAdmited.class;
  }
  
  public String getClientBehaviour() {
    return "var mbtuuja = new Object();mbtuuja.refresh = function (node) {if (!node.isEditable()) return;};mbtuuja.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSubBehaviorClass(final String name) {
    int hash = name.hashCode();
     switch(hash) {
     case -466553977 :
    return ceip.procesos.studentnewlyadmited.providername.ExternalBehavior.class;
    default: return null;
    }
  }
  
  private final ProviderNameProperty ProviderName = new ceip.procesos.studentnewlyadmited.ProviderNameProperty();
}
