package solicitud.procesos.admitidos;

import org.monet.bpi.CustomerRequest;
import org.monet.bpi.CustomerResponse;
import org.monet.bpi.ImporterScope;
import org.monet.bpi.java.BehaviorTaskCustomerImpl;
import solicitud.admiteddoc.Importador;
import solicitud.procesos.Admitidos;
import solicitud.procesos.admitidos.Lock;

@SuppressWarnings("all")
public class CustomerBehavior extends BehaviorTaskCustomerImpl {
  public Admitidos getTask() {
    return (solicitud.procesos.Admitidos)this.getGenericTask();
  }
  
  private void import0(final CustomerRequest msg) {
    ImporterScope _doImportOf = Importador.doImportOf("Listado de Admitidos/as", msg);
    _doImportOf.atGlobalScope();
    Admitidos _task = this.getTask();
    _task.doUnlock(Lock.Initial_Parada);
  }
  
  public void onRequest(final CustomerRequest msg) {
    Admitidos _task = this.getTask();
    _task.addLog("Llega el Listado", "Alumnos/as admitidos/as");
  }
  
  public void onImportRequest(final String code, final CustomerRequest p0) {
    int hash = code.hashCode();
    switch(hash) {case 2031988980 :
      import0((org.monet.bpi.CustomerRequest) p0);
    break;
    }
  }
  
  public void onConstructResponse(final String code, final CustomerResponse p0) {
    int hash = code.hashCode();
    switch(hash) {}
  }
}
