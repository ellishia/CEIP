package ceip.procesos.studenttransfer;

@SuppressWarnings("all")
public class Lock extends org.monet.metamodel.internal.Lock {
  public Lock(final String place, final String id) {
    super(place, id);
  }
  
  public static Lock Iniciado_Generar = new Lock("mqqdxza","mea8i7g");
  
  public static Lock Iniciado_Salir = new Lock("mqqdxza","mjpe8pw");
  
  public static Lock Bloqueo_ExitBloqueo = new Lock("mbc05gq","mhyolxg");
  
  public static Lock Generado = new Lock("mqbx2ia","mqbx2ia");
  
  public static Lock Enviando = new Lock("mujxbea","mujxbea");
  
  public static Lock MasRoles = new Lock("mpaycha","mpaycha");
  
  public static Lock Finalizado = new Lock("mzbebbg","mzbebbg");
}
