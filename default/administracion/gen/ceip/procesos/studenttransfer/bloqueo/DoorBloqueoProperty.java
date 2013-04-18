package ceip.procesos.studenttransfer.bloqueo;

import org.monet.metamodel.DoorActionProperty;

@SuppressWarnings("all")
public class DoorBloqueoProperty extends DoorActionProperty {
  public DoorBloqueoProperty() {
    super();this._code = "mmfocfg";
    this._name = "DoorBloqueo";
    this._label = "Enviando Listado de Alumnos";
    org.monet.metamodel.DoorActionProperty.ExitProperty exitProperty1 = new org.monet.metamodel.DoorActionProperty.ExitProperty();
    exitProperty1.setGoto(new org.monet.metamodel.internal.Ref("MasRoles","ceip.procesos.StudentTransfer","ceip.procesos.StudentTransfer.MasRoles"));
    exitProperty1.setHistory("Listado enviado");
    exitProperty1.setCode("mhyolxg");
    exitProperty1.setName("ExitBloqueo");
    this.addExit(exitProperty1);
    
  }
  
  public static String static_getName() {
    return "DoorBloqueo";
  }
}
