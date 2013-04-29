package ceip.boletin;

import ceip.BasicInfo;
import ceip.Califications;
import ceip.CenterInformation;
import ceip.CentroInfo;
import ceip.boletin.Schema;
import ceip.boletin.exportador.ExporterScope;
import ceip.boletin.schema.Entry;
import ceip.califications.Indice;
import ceip.centerinformation.Contact;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.monet.bpi.Expression;
import org.monet.bpi.FieldSection;
import org.monet.bpi.Node;
import org.monet.bpi.OperationExpression;
import org.monet.bpi.java.ExporterImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Exportador extends ExporterImpl {
  private void onExportItem(final Schema i) {
    Node _scope = this.getScope();
    BasicInfo ficha = ((BasicInfo) _scope);
    CentroInfo _instance = CentroInfo.getInstance();
    CenterInformation centroInformation = _instance.getCenterInformation();
    String centerName = centroInformation.getCenterName();
    FieldSection _contactField = centroInformation.getContactField();
    Contact contacto = ((Contact) _contactField);
    String centerTown = contacto.getTown();
    Term academicYear = centroInformation.getAcademicYear();
    String documentType = "Bolet\u00EDn de notas";
    i.setCentroAcademico(centerName);
    i.setCity(centerTown);
    Date _date = new Date();
    i.setDate(_date);
    String _string = academicYear.toString();
    i.setAnyoAcademico(_string);
    i.setDocumentType(documentType);
    String _name = ficha.getName();
    i.setStudentName(_name);
    String _surname = ficha.getSurname();
    i.setStudentSurname(_surname);
    String cial = ficha.getCial();
    i.setCial(cial);
    HashMap<String,Entry> _hashMap = new HashMap<String,Entry>();
    HashMap<String,Entry> hash = _hashMap;
    OperationExpression _Eq = Indice.Cial.Eq(cial);
    OperationExpression _Eq_1 = Indice.AcademicYear.Eq(academicYear);
    Expression _filter = Expression.And(_Eq, _Eq_1);
    Califications _instance_1 = Califications.getInstance();
    Iterable<Indice> _get = _instance_1.get(_filter);
    for (final Indice calificationEntry : _get) {
      {
        Term _subject = calificationEntry.getSubject();
        String caliKey = _subject.getKey();
        Entry entryItem = null;
        Entry _get_1 = hash.get(caliKey);
        entryItem = ((Entry) _get_1);
        boolean _equals = Objects.equal(entryItem, null);
        if (_equals) {
          Entry _entry = new Entry();
          entryItem = _entry;
          Term _subject_1 = calificationEntry.getSubject();
          String _string_1 = _subject_1.toString();
          entryItem.setSubject(_string_1);
          ArrayList<Entry> _entry_1 = i.getEntry();
          _entry_1.add(entryItem);
        }
        Term _trimester = calificationEntry.getTrimester();
        final Term _switchValue = _trimester;
        boolean _matched = false;
        if (!_matched) {
          if (Objects.equal(_switchValue,"1")) {
            _matched=true;
            String _grade = calificationEntry.getGrade();
            entryItem.setPrimerTrim(_grade);
          }
        }
        if (!_matched) {
          if (Objects.equal(_switchValue,"2")) {
            _matched=true;
            String _grade_1 = calificationEntry.getGrade();
            entryItem.setSegundoTrim(_grade_1);
          }
        }
        if (!_matched) {
          if (Objects.equal(_switchValue,"3")) {
            _matched=true;
            String _grade_2 = calificationEntry.getGrade();
            entryItem.setTercerTrim(_grade_2);
          }
        }
        if (!_matched) {
          if (Objects.equal(_switchValue,"4")) {
            _matched=true;
            String _grade_3 = calificationEntry.getGrade();
            entryItem.setGlobal(_grade_3);
          }
        }
        hash.put(caliKey, entryItem);
      }
    }
  }
  
  public void onExportItem(final org.monet.bpi.Schema item) {
    super.onExportItem(item);
    this.onExportItem((ceip.boletin.Schema)item);
  }
  
  public static ExporterScope doExportOf(final Node node) {
    return (ceip.boletin.exportador.ExporterScope)org.monet.bpi.ExporterService.get("ceip.Boletin.Exportador").prepareExportOf(node);
  }
  
  public org.monet.bpi.ExporterScope prepareExportOf(final Node node) {
    return (org.monet.bpi.ExporterScope) new ceip.boletin.exportador.ExporterScope(this, node);
  }
}
