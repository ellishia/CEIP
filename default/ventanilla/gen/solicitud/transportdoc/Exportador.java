package solicitud.transportdoc;

import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl;
import org.monet.bpi.types.Term;
import solicitud.TransportApplication;
import solicitud.transportdoc.Schema;
import solicitud.transportdoc.exportador.ExporterScope;

@SuppressWarnings("all")
public class Exportador extends ExporterImpl {
  private void onExportItem(final Schema i) {
    Node _scope = this.getScope();
    TransportApplication ficha = ((TransportApplication) _scope);
    String _studentName = ficha.getStudentName();
    i.setStudentName(_studentName);
    String _studentSurname = ficha.getStudentSurname();
    i.setStudentSurname(_studentSurname);
    String _cial = ficha.getCial();
    i.setCial(_cial);
    String _identifier = ficha.getIdentifier();
    i.setIdentifier(_identifier);
    Term _academicYear = ficha.getAcademicYear();
    i.setAcademicYear(_academicYear);
    String _address = ficha.getAddress();
    i.setAddress(_address);
    org.monet.bpi.types.Number _distance = ficha.getDistance();
    i.setDistance(_distance);
    String _trip = ficha.getTrip();
    i.setTrip(_trip);
    String _stop = ficha.getStop();
    i.setStop(_stop);
    String _leaveAt = ficha.getLeaveAt();
    i.setLeaveAt(_leaveAt);
  }
  
  public void onExportItem(final org.monet.bpi.Schema item) {
    super.onExportItem(item);
    this.onExportItem((solicitud.transportdoc.Schema)item);
  }
  
  public static ExporterScope doExportOf(final Node node) {
    return (solicitud.transportdoc.exportador.ExporterScope)org.monet.bpi.ExporterService.get("solicitud.transportDoc.Exportador").prepareExportOf(node);
  }
  
  public org.monet.bpi.ExporterScope prepareExportOf(final Node node) {
    return (org.monet.bpi.ExporterScope) new solicitud.transportdoc.exportador.ExporterScope(this, node);
  }
}
