package solicitud.admiteddoc;

import com.google.common.base.Objects;
import java.util.ArrayList;
import org.monet.bpi.ContestantRequest;
import org.monet.bpi.CustomerRequest;
import org.monet.bpi.ImporterScope;
import org.monet.bpi.Node;
import org.monet.bpi.NodeDocument;
import org.monet.bpi.OperationExpression;
import org.monet.bpi.ProviderResponse;
import org.monet.bpi.java.ImporterImpl;
import org.monet.bpi.types.File;
import solicitud.Application;
import solicitud.ApplicationInfo;
import solicitud.Applications;
import solicitud.admiteddoc.Schema;
import solicitud.admiteddoc.schema.Entry;
import solicitud.applications.Indice;

@SuppressWarnings("all")
public class Importador extends ImporterImpl {
  public Class<?> getTargetSchemaClass() {
    return solicitud.admiteddoc.Schema.class;
  }
  
  private void onImportItem(final Schema item) {
    Applications applications = Applications.getInstance();
    Iterable<Indice> _all = applications.getAll();
    for (final Indice app : _all) {
      {
        Node _indexedNode = app.getIndexedNode();
        Application appForm = ((Application) _indexedNode);
        ApplicationInfo _applicationInfo = appForm.getApplicationInfo();
        _applicationInfo.setMatriculable(false);
      }
    }
    ArrayList<Entry> _entry = item.getEntry();
    for (final Entry entry : _entry) {
      {
        String _cial = entry.getCial();
        OperationExpression _Eq = Indice.Cial.Eq(_cial);
        Indice appl = applications.getFirst(_Eq);
        boolean _notEquals = (!Objects.equal(appl, null));
        if (_notEquals) {
          Node _indexedNode = appl.getIndexedNode();
          Application applForm = ((Application) _indexedNode);
          ApplicationInfo _applicationInfo = applForm.getApplicationInfo();
          _applicationInfo.setMatriculable(true);
          applForm.save();
        }
      }
    }
  }
  
  public void onImportItem(final org.monet.bpi.Schema item) {
    super.onImportItem(item);
    this.onImportItem((solicitud.admiteddoc.Schema)item);
  }
  
  public static ImporterScope doImportOf(final NodeDocument node) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("solicitud.AdmitedDoc.Importador").prepareImportOf(node);
  }
  
  public static ImporterScope doImportOf(final org.monet.bpi.Schema schema) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("solicitud.AdmitedDoc.Importador").prepareImportOf(schema);
  }
  
  public static ImporterScope doImportOf(final File file) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("solicitud.AdmitedDoc.Importador").prepareImportOf(file);
  }
  
  public static ImporterScope doImportOf(final String url) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("solicitud.AdmitedDoc.Importador").prepareImportOf(url);
  }
  
  public static ImporterScope doImportOf(final String key, final CustomerRequest msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("solicitud.AdmitedDoc.Importador").prepareImportOf(key, msg);
  }
  
  public static ImporterScope doImportOf(final String key, final ContestantRequest msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("solicitud.AdmitedDoc.Importador").prepareImportOf(key, msg);
  }
  
  public static ImporterScope doImportOf(final String key, final ProviderResponse msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("solicitud.AdmitedDoc.Importador").prepareImportOf(key, msg);
  }
}
