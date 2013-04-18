package ceip.procesos.studenttransfer.providername;

import ceip.StudentsDoc;
import ceip.procesos.StudentTransfer;
import ceip.procesos.studenttransfer.Lock;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.monet.bpi.ProviderRequest;
import org.monet.bpi.ProviderResponse;
import org.monet.bpi.java.BehaviorTaskProviderExternalImpl;

@SuppressWarnings("all")
public class ExternalBehavior extends BehaviorTaskProviderExternalImpl {
  public StudentTransfer getTask() {
    return (ceip.procesos.StudentTransfer)this.getGenericTask();
  }
  
  private void constructor0(final ProviderRequest msg) {
    try {
      StudentTransfer _task = this.getTask();
      StudentsDoc _target = _task.getTarget();
      msg.attachSchema("Listado de Alumnos/as", _target);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        StudentTransfer _task_1 = this.getTask();
        String _message = ex.getMessage();
        _task_1.addLog("excepcion", _message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public void onTerminate() {
    Lock bloq = Lock.Bloqueo_ExitBloqueo;
    StudentTransfer _task = this.getTask();
    _task.doUnlock(bloq);
  }
  
  public void onConstructRequest(final String code, final ProviderRequest p0) {
    int hash = code.hashCode();
    switch(hash) {case 2133319713 :
      constructor0((org.monet.bpi.ProviderRequest) p0);
    break;
    }
  }
  
  public void onImportResponse(final String code, final ProviderResponse p0) {
    int hash = code.hashCode();
    switch(hash) {}
  }
}
