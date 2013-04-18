package doc.procesos.studenttransfer;

import doc.procesos.StudentTransfer;
import doc.procesos.studenttransfer.Lock;
import doc.studentdoc.Importador;
import org.monet.bpi.CustomerRequest;
import org.monet.bpi.CustomerResponse;
import org.monet.bpi.ImporterScope;
import org.monet.bpi.java.BehaviorTaskCustomerImpl;

@SuppressWarnings("all")
public class CustomerBehavior extends BehaviorTaskCustomerImpl {
  public StudentTransfer getTask() {
    return (doc.procesos.StudentTransfer)this.getGenericTask();
  }
  
  private void import0(final CustomerRequest msg) {
    ImporterScope _doImportOf = Importador.doImportOf("Listado de Alumnos/as", msg);
    _doImportOf.atGlobalScope();
    StudentTransfer _task = this.getTask();
    _task.doUnlock(Lock.Inicial_StopName);
  }
  
  public void onRequest(final CustomerRequest msg) {
    StudentTransfer _task = this.getTask();
    _task.addLog("Llega el mensaje", "mensaje");
  }
  
  public void onImportRequest(final String code, final CustomerRequest p0) {
    int hash = code.hashCode();
    switch(hash) {case 2133319713 :
      import0((org.monet.bpi.CustomerRequest) p0);
    break;
    }
  }
  
  public void onConstructResponse(final String code, final CustomerResponse p0) {
    int hash = code.hashCode();
    switch(hash) {}
  }
}
