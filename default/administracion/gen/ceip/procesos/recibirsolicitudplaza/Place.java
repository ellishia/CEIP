package ceip.procesos.recibirsolicitudplaza;

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
  
  public static Place EnviarResultado = new Place("EnviarResultado");
  
  public static Place Finalizar = new Place("Finalizar");
}
