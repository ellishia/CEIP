package solicitud.procesos.admitidos.initial;

import org.monet.metamodel.DoorActionProperty;

@SuppressWarnings("all")
public class WaitingDoorProperty extends DoorActionProperty {
  public WaitingDoorProperty() {
    super();this._code = "mf2ypwg";
    this._name = "WaitingDoor";
    org.monet.metamodel.DoorActionProperty.ExitProperty exitProperty0 = new org.monet.metamodel.DoorActionProperty.ExitProperty();
    exitProperty0.setHistory("Se ha recibido el listado");
    exitProperty0.setGoto(new org.monet.metamodel.internal.Ref("Final","solicitud.procesos.Admitidos","solicitud.procesos.Admitidos.Final"));
    exitProperty0.setCode("mfxkz1w");
    exitProperty0.setName("Parada");
    this.addExit(exitProperty0);
    this._label = "Procesar Listado de Admitidos/as";
    
  }
  
  public static String static_getName() {
    return "WaitingDoor";
  }
}
