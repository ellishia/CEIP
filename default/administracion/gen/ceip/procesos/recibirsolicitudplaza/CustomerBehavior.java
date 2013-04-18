package ceip.procesos.recibirsolicitudplaza;

import ceip.procesos.RecibirSolicitudPlaza;
import ceip.procesos.recibirsolicitudplaza.Lock;
import ceip.solicituddoc.Importador;
import org.monet.bpi.CustomerRequest;
import org.monet.bpi.CustomerResponse;
import org.monet.bpi.ImporterScope;
import org.monet.bpi.java.BehaviorTaskCustomerImpl;

@SuppressWarnings("all")
public class CustomerBehavior extends BehaviorTaskCustomerImpl {
  public RecibirSolicitudPlaza getTask() {
    return (ceip.procesos.RecibirSolicitudPlaza)this.getGenericTask();
  }
  
  private void import0(final CustomerRequest msg) {
    ImporterScope _doImportOf = Importador.doImportOf("Preinscripcion", msg);
    _doImportOf.atGlobalScope();
    RecibirSolicitudPlaza _task = this.getTask();
    _task.doUnlock(Lock.Inicial_StopName);
  }
  
  private void constructor1(final CustomerResponse msg) {
    msg.attachString("Preinscripcion", "Su preinscripci\u00F3n ha sido recibida correctamente");
  }
  
  public void onRequest(final CustomerRequest msg) {
    RecibirSolicitudPlaza _task = this.getTask();
    _task.addLog("Llega el mensaje", "mensaje");
  }
  
  public void onImportRequest(final String code, final CustomerRequest p0) {
    int hash = code.hashCode();
    switch(hash) {case -1896237059 :
      import0((org.monet.bpi.CustomerRequest) p0);
    break;
    }
  }
  
  public void onConstructResponse(final String code, final CustomerResponse p0) {
    int hash = code.hashCode();
    switch(hash) {case -508218284 :
      constructor1((org.monet.bpi.CustomerResponse) p0);
    break;
    }
  }
}
