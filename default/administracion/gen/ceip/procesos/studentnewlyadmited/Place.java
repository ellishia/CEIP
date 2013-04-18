package ceip.procesos.studentnewlyadmited;

@SuppressWarnings("all")
public class Place {
  public Place(final String id) {
    this.id = id;
  }
  
  private String id;
  
  public String getId() {
    return this.id;
  }
  
  public static Place Iniciado = new Place("Iniciado");
  
  public static Place Generado = new Place("Generado");
  
  public static Place Enviando = new Place("Enviando");
  
  public static Place Finalizado = new Place("Finalizado");
}
