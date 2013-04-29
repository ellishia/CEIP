package ceip.procesos.recibirsolicitudplaza;

import ceip.CanteenDoc;
import ceip.TransportDoc;
import ceip.procesos.RecibirSolicitudPlaza;
import ceip.procesos.recibirsolicitudplaza.Lock;
import ceip.solicituddoc.Importador;
import com.google.common.base.Objects;
import org.monet.bpi.CustomerRequest;
import org.monet.bpi.CustomerResponse;
import org.monet.bpi.ImporterScope;
import org.monet.bpi.NodeDocument;
import org.monet.bpi.java.BehaviorTaskCustomerImpl;

@SuppressWarnings("all")
public class CustomerBehavior extends BehaviorTaskCustomerImpl {
  public RecibirSolicitudPlaza getTask() {
    return (ceip.procesos.RecibirSolicitudPlaza)this.getGenericTask();
  }
  
  private void import0(final CustomerRequest msg) {
    ImporterScope _doImportOf = Importador.doImportOf("Preinscripcion", msg);
    _doImportOf.atGlobalScope();
    NodeDocument transport = msg.getDocument("Transporte", TransportDoc.class);
    boolean _notEquals = (!Objects.equal(transport, null));
    if (_notEquals) {
      ImporterScope _doImportOf_1 = ceip.transportdoc.Importador.doImportOf("Transporte", msg);
      _doImportOf_1.atGlobalScope();
    }
    NodeDocument canteen = msg.getDocument("Comedor", CanteenDoc.class);
    boolean _notEquals_1 = (!Objects.equal(canteen, null));
    if (_notEquals_1) {
      ImporterScope _doImportOf_2 = ceip.canteendoc.Importador.doImportOf("Comedor", msg);
      _doImportOf_2.atGlobalScope();
    }
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
