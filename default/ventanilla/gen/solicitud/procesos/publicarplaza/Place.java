package solicitud.procesos.publicarplaza;

@SuppressWarnings("all")
public class Place {
  public Place(final String id) {
    this.id = id;
  }
  
  private String id;
  
  public String getId() {
    return this.id;
  }
  
  public static Place Inicial = new Place("Inicial");
  
  public static Place Recopilado = new Place("Recopilado");
  
  public static Place AnadirEscoge = new Place("AnadirEscoge");
  
  public static Place AnadirTrans = new Place("AnadirTrans");
  
  public static Place Anadir = new Place("Anadir");
  
  public static Place RedirigidoTrans = new Place("RedirigidoTrans");
  
  public static Place Redirigido = new Place("Redirigido");
  
  public static Place Generado = new Place("Generado");
  
  public static Place Enviando = new Place("Enviando");
  
  public static Place EsperandoRespuesta = new Place("EsperandoRespuesta");
  
  public static Place Finalizado = new Place("Finalizado");
}
