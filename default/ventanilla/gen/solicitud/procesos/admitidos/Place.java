package solicitud.procesos.admitidos;

@SuppressWarnings("all")
public class Place {
  public Place(final String id) {
    this.id = id;
  }
  
  private String id;
  
  public String getId() {
    return this.id;
  }
  
  public static Place Initial = new Place("Initial");
  
  public static Place Final = new Place("Final");
}
