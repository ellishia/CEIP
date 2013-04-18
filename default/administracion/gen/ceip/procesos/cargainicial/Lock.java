package ceip.procesos.cargainicial;

@SuppressWarnings("all")
public class Lock extends org.monet.metamodel.internal.Lock {
  public Lock(final String place, final String id) {
    super(place, id);
  }
  
  public static Lock Inicial = new Lock("mq_x8va","mq_x8va");
  
  public static Lock Final = new Lock("mnqwjiq","mnqwjiq");
}
