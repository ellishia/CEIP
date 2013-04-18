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
  
  public static Place Generado = new Place("Generado");
  
  public static Place Enviando = new Place("Enviando");
  
  public static Place EsperandoRespuesta = new Place("EsperandoRespuesta");
  
  public static Place Finalizado = new Place("Finalizado");
}
