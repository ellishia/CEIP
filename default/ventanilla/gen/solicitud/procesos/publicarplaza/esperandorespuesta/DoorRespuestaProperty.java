package solicitud.procesos.publicarplaza.esperandorespuesta;

import org.monet.metamodel.DoorActionProperty;

@SuppressWarnings("all")
public class DoorRespuestaProperty extends DoorActionProperty {
  public DoorRespuestaProperty() {
    super();this._code = "mmbg7vw";
    this._name = "DoorRespuesta";
    this._label = "Esperando Respuesta";
    org.monet.metamodel.DoorActionProperty.ExitProperty exitProperty1 = new org.monet.metamodel.DoorActionProperty.ExitProperty();
    exitProperty1.setHistory("Respuesta recibida");
    exitProperty1.setGoto(new org.monet.metamodel.internal.Ref("Finalizado","solicitud.procesos.PublicarPlaza","solicitud.procesos.PublicarPlaza.Finalizado"));
    exitProperty1.setCode("mkhczeg");
    exitProperty1.setName("ExitRespuesta");
    this.addExit(exitProperty1);
    
  }
  
  public static String static_getName() {
    return "DoorRespuesta";
  }
}
