package doc.procesos.studenttransfer;

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
  
  public static Place Finalizar = new Place("Finalizar");
}
