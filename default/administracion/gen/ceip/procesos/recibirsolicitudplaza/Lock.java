package ceip.procesos.recibirsolicitudplaza;

@SuppressWarnings("all")
public class Lock extends org.monet.metamodel.internal.Lock {
  public Lock(final String place, final String id) {
    super(place, id);
  }
  
  public static Lock Inicial_StopName = new Lock("m2x4p_g","mfxkz1w");
  
  public static Lock EnviarResultado = new Lock("mkh0efq","mkh0efq");
  
  public static Lock Finalizar = new Lock("muh7htq","muh7htq");
}
