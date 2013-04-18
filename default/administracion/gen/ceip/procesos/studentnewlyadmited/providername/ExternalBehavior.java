package ceip.procesos.studentnewlyadmited.providername;

import ceip.AdmitedDoc;
import ceip.procesos.StudentNewlyAdmited;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.monet.bpi.ProviderRequest;
import org.monet.bpi.ProviderResponse;
import org.monet.bpi.java.BehaviorTaskProviderExternalImpl;

@SuppressWarnings("all")
public class ExternalBehavior extends BehaviorTaskProviderExternalImpl {
  public StudentNewlyAdmited getTask() {
    return (ceip.procesos.StudentNewlyAdmited)this.getGenericTask();
  }
  
  private void constructor0(final ProviderRequest msg) {
    try {
      StudentNewlyAdmited _task = this.getTask();
      AdmitedDoc _target = _task.getTarget();
      msg.attachSchema("Listado de Admitidos/as", _target);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        StudentNewlyAdmited _task_1 = this.getTask();
        String _message = ex.getMessage();
        _task_1.addLog("excepcion", _message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public void onConstructRequest(final String code, final ProviderRequest p0) {
    int hash = code.hashCode();
    switch(hash) {case 2031988980 :
      constructor0((org.monet.bpi.ProviderRequest) p0);
    break;
    }
  }
  
  public void onImportResponse(final String code, final ProviderResponse p0) {
    int hash = code.hashCode();
    switch(hash) {}
  }
}
