package solicitud.procesos.publicarplaza;

@SuppressWarnings("all")
public class Lock extends org.monet.metamodel.internal.Lock {
  public Lock(final String place, final String id) {
    super(place, id);
  }
  
  public static Lock Inicial_Generar = new Lock("mfdyzbq","mea8i7g");
  
  public static Lock Inicial_Salir = new Lock("mfdyzbq","mjpe8pw");
  
  public static Lock EsperandoRespuesta_ExitRespuesta = new Lock("mufdlfw","mkhczeg");
  
  public static Lock Generado = new Lock("mmirmbg","mmirmbg");
  
  public static Lock Enviando = new Lock("mooct_q","mooct_q");
  
  public static Lock Finalizado = new Lock("m2nagkg","m2nagkg");
}
