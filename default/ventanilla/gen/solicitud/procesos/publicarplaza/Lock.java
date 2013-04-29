package solicitud.procesos.publicarplaza;

@SuppressWarnings("all")
public class Lock extends org.monet.metamodel.internal.Lock {
  public Lock(final String place, final String id) {
    super(place, id);
  }
  
  public static Lock Inicial_Generar = new Lock("mfdyzbq","mea8i7g");
  
  public static Lock Inicial_Salir = new Lock("mfdyzbq","mjpe8pw");
  
  public static Lock AnadirTrans_Add = new Lock("mtbyd1q","mozytya");
  
  public static Lock AnadirTrans_Seguir = new Lock("mtbyd1q","ma1unsg");
  
  public static Lock Anadir_Add = new Lock("m8xoz1a","mozytya");
  
  public static Lock Anadir_Seguir = new Lock("m8xoz1a","ma1unsg");
  
  public static Lock EsperandoRespuesta_ExitRespuesta = new Lock("mufdlfw","mkhczeg");
  
  public static Lock Recopilado = new Lock("mymsurw","mymsurw");
  
  public static Lock AnadirEscoge = new Lock("mri47fw","mri47fw");
  
  public static Lock RedirigidoTrans = new Lock("mlwztba","mlwztba");
  
  public static Lock Redirigido = new Lock("mfftfvq","mfftfvq");
  
  public static Lock Generado = new Lock("mmirmbg","mmirmbg");
  
  public static Lock Enviando = new Lock("mooct_q","mooct_q");
  
  public static Lock Finalizado = new Lock("m2nagkg","m2nagkg");
}
