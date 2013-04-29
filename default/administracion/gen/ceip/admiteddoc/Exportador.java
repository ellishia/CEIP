package ceip.admiteddoc;

import ceip.Applications;
import ceip.CenterInformation;
import ceip.CentroInfo;
import ceip.admiteddoc.Schema;
import ceip.admiteddoc.exportador.ExporterScope;
import ceip.admiteddoc.schema.Entry;
import ceip.applications.Application;
import ceip.applications.Indice;
import ceip.centerinformation.Contact;
import java.util.ArrayList;
import org.monet.bpi.FieldSection;
import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Exportador extends ExporterImpl {
  private void onExportItem(final Schema i) {
    Node _scope = this.getScope();
    Applications ficha = ((Applications) _scope);
    Date _date = new Date();
    i.setDate(_date);
    CentroInfo _instance = CentroInfo.getInstance();
    CenterInformation centroInformation = _instance.getCenterInformation();
    String _centerName = centroInformation.getCenterName();
    i.setCentroAcademico(_centerName);
    Term _academicYear = centroInformation.getAcademicYear();
    String _label = _academicYear.getLabel();
    i.setAnyoAcademico(_label);
    FieldSection _contactField = centroInformation.getContactField();
    Contact contacto = ((Contact) _contactField);
    String _town = contacto.getTown();
    i.setCity(_town);
    Iterable<Indice> _all = ficha.getAll();
    for (final Indice item : _all) {
      {
        Node _indexedNode = item.getIndexedNode();
        Application applic = ((Application) _indexedNode);
        Entry _entry = new Entry();
        Entry entry = _entry;
        boolean _admitido = applic.getAdmitido();
        if (_admitido) {
          String _studentName = applic.getStudentName();
          entry.setStudentName(_studentName);
          String _studentSurname = applic.getStudentSurname();
          entry.setStudentSurname(_studentSurname);
          String _cial = applic.getCial();
          entry.setCial(_cial);
          Term _level = applic.getLevel();
          entry.setLevel(_level);
          ArrayList<Entry> _entry_1 = i.getEntry();
          _entry_1.add(entry);
        }
      }
    }
  }
  
  public void onExportItem(final org.monet.bpi.Schema item) {
    super.onExportItem(item);
    this.onExportItem((ceip.admiteddoc.Schema)item);
  }
  
  public static ExporterScope doExportOf(final Node node) {
    return (ceip.admiteddoc.exportador.ExporterScope)org.monet.bpi.ExporterService.get("ceip.AdmitedDoc.Exportador").prepareExportOf(node);
  }
  
  public org.monet.bpi.ExporterScope prepareExportOf(final Node node) {
    return (org.monet.bpi.ExporterScope) new ceip.admiteddoc.exportador.ExporterScope(this, node);
  }
}
