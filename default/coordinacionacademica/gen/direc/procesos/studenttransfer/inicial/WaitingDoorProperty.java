package direc.procesos.studenttransfer.inicial;

import org.monet.metamodel.DoorActionProperty;

@SuppressWarnings("all")
public class WaitingDoorProperty extends DoorActionProperty {
  public WaitingDoorProperty() {
    super();this._code = "mf2ypwg";
    this._name = "WaitingDoor";
    org.monet.metamodel.DoorActionProperty.ExitProperty exitProperty0 = new org.monet.metamodel.DoorActionProperty.ExitProperty();
    exitProperty0.setHistory("Se ha recibido el listado de alumnos/as");
    exitProperty0.setGoto(new org.monet.metamodel.internal.Ref("Finalizar","direc.procesos.StudentTransfer","direc.procesos.StudentTransfer.Finalizar"));
    exitProperty0.setCode("mfxkz1w");
    exitProperty0.setName("StopName");
    this.addExit(exitProperty0);
    this._label = "Generar alumnos/as";
    
  }
  
  public static String static_getName() {
    return "WaitingDoor";
  }
}
