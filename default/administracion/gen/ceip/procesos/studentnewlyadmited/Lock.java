package ceip.procesos.studentnewlyadmited;

@SuppressWarnings("all")
public class Lock extends org.monet.metamodel.internal.Lock {
  public Lock(final String place, final String id) {
    super(place, id);
  }
  
  public static Lock Iniciado_Generar = new Lock("mzqjoiw","mjlin2w");
  
  public static Lock Iniciado_Salir = new Lock("mzqjoiw","mjpe8pw");
  
  public static Lock Generado = new Lock("mqbx2ia","mqbx2ia");
  
  public static Lock Enviando = new Lock("mujxbea","mujxbea");
  
  public static Lock Finalizado = new Lock("mzbebbg","mzbebbg");
}
