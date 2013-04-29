package ceip.studentsdoc;

import ceip.BasicInfo;
import ceip.CenterInformation;
import ceip.CentroInfo;
import ceip.Student;
import ceip.Students;
import ceip.centerinformation.Contact;
import ceip.students.Index;
import ceip.studentsdoc.Schema;
import ceip.studentsdoc.exportador.ExporterScope;
import ceip.studentsdoc.schema.Entry;
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
    Students ficha = ((Students) _scope);
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
    Iterable<Index> _all = ficha.getAll();
    for (final Index item : _all) {
      {
        Node _indexedNode = item.getIndexedNode();
        Student alumno = ((Student) _indexedNode);
        BasicInfo basicinfo = alumno.getBasicInfo();
        Entry _entry = new Entry();
        Entry entry = _entry;
        String _name = basicinfo.getName();
        entry.setStudentName(_name);
        String _surname = basicinfo.getSurname();
        entry.setStudentSurname(_surname);
        String _cial = basicinfo.getCial();
        entry.setCial(_cial);
        Date _date_of_Birth = basicinfo.getDate_of_Birth();
        entry.setBirthdate(_date_of_Birth);
        ArrayList<Entry> _entry_1 = i.getEntry();
        _entry_1.add(entry);
      }
    }
  }
  
  public void onExportItem(final org.monet.bpi.Schema item) {
    super.onExportItem(item);
    this.onExportItem((ceip.studentsdoc.Schema)item);
  }
  
  public static ExporterScope doExportOf(final Node node) {
    return (ceip.studentsdoc.exportador.ExporterScope)org.monet.bpi.ExporterService.get("ceip.StudentsDoc.Exportador").prepareExportOf(node);
  }
  
  public org.monet.bpi.ExporterScope prepareExportOf(final Node node) {
    return (org.monet.bpi.ExporterScope) new ceip.studentsdoc.exportador.ExporterScope(this, node);
  }
}
