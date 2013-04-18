package solicitud.procesos.publicarplaza.preinscripcion;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.monet.bpi.NewsService;
import org.monet.bpi.Post;
import org.monet.bpi.ProviderRequest;
import org.monet.bpi.ProviderResponse;
import org.monet.bpi.java.BehaviorTaskProviderExternalImpl;
import solicitud.Application;
import solicitud.SolicitudDoc;
import solicitud.procesos.PublicarPlaza;
import solicitud.procesos.publicarplaza.Lock;
import solicitud.solicituddoc.Exportador;
import solicitud.solicituddoc.exportador.ExporterScope;

@SuppressWarnings("all")
public class ExternalBehavior extends BehaviorTaskProviderExternalImpl {
  public PublicarPlaza getTask() {
    return (solicitud.procesos.PublicarPlaza)this.getGenericTask();
  }
  
  private void constructor0(final ProviderRequest msg) {
    try {
      PublicarPlaza _task = this.getTask();
      Application preinscripcion = _task.getTarget();
      ExporterScope _doExportOf = Exportador.doExportOf(preinscripcion);
      SolicitudDoc solicitud = _doExportOf.toNewDocument();
      msg.attachSchema("Preinscripcion", solicitud);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        PublicarPlaza _task_1 = this.getTask();
        String _message = ex.getMessage();
        _task_1.addLog("exception", _message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private void import1(final ProviderResponse msg) {
    String mess = msg.getString("Preinscripcion");
    Post post = Post.createRequest();
    post.setTitle("Aviso de Preinscripci\u00F3n");
    post.setBody(mess);
    NewsService.postAndNotifyToAll(post);
    PublicarPlaza _task = this.getTask();
    _task.doUnlock(Lock.EsperandoRespuesta_ExitRespuesta);
  }
  
  public void onConstructRequest(final String code, final ProviderRequest p0) {
    int hash = code.hashCode();
    switch(hash) {case -1896237059 :
      constructor0((org.monet.bpi.ProviderRequest) p0);
    break;
    }
  }
  
  public void onImportResponse(final String code, final ProviderResponse p0) {
    int hash = code.hashCode();
    switch(hash) {case -508218284 :
      import1((org.monet.bpi.ProviderResponse) p0);
    break;
    }
  }
}
