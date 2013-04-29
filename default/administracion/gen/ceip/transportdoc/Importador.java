package ceip.transportdoc;

import ceip.ServiceApplications;
import ceip.TransportApplication;
import ceip.transportdoc.Schema;
import org.monet.bpi.ContestantRequest;
import org.monet.bpi.CustomerRequest;
import org.monet.bpi.ImporterScope;
import org.monet.bpi.NodeDocument;
import org.monet.bpi.ProviderResponse;
import org.monet.bpi.java.ImporterImpl;
import org.monet.bpi.types.File;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Importador extends ImporterImpl {
  public Class<?> getTargetSchemaClass() {
    return ceip.transportdoc.Schema.class;
  }
  
  private void onImportItem(final Schema i) {
    ServiceApplications servicios = ServiceApplications.getInstance();
    TransportApplication ficha = TransportApplication.createNew(servicios);
    String _studentName = i.getStudentName();
    ficha.setStudentName(_studentName);
    String _studentSurname = i.getStudentSurname();
    ficha.setStudentSurname(_studentSurname);
    Term _academicYear = i.getAcademicYear();
    ficha.setAcademicYear(_academicYear);
    String _address = i.getAddress();
    ficha.setAddress(_address);
    org.monet.bpi.types.Number _distance = i.getDistance();
    ficha.setDistance(_distance);
    String _trip = i.getTrip();
    ficha.setTrip(_trip);
    String _stop = i.getStop();
    ficha.setStop(_stop);
    String _leaveAt = i.getLeaveAt();
    ficha.setLeaveAt(_leaveAt);
    ficha.save();
  }
  
  public void onImportItem(final org.monet.bpi.Schema item) {
    super.onImportItem(item);
    this.onImportItem((ceip.transportdoc.Schema)item);
  }
  
  public static ImporterScope doImportOf(final NodeDocument node) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.TransportDoc.Importador").prepareImportOf(node);
  }
  
  public static ImporterScope doImportOf(final org.monet.bpi.Schema schema) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.TransportDoc.Importador").prepareImportOf(schema);
  }
  
  public static ImporterScope doImportOf(final File file) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.TransportDoc.Importador").prepareImportOf(file);
  }
  
  public static ImporterScope doImportOf(final String url) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.TransportDoc.Importador").prepareImportOf(url);
  }
  
  public static ImporterScope doImportOf(final String key, final CustomerRequest msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.TransportDoc.Importador").prepareImportOf(key, msg);
  }
  
  public static ImporterScope doImportOf(final String key, final ContestantRequest msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.TransportDoc.Importador").prepareImportOf(key, msg);
  }
  
  public static ImporterScope doImportOf(final String key, final ProviderResponse msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.TransportDoc.Importador").prepareImportOf(key, msg);
  }
}
