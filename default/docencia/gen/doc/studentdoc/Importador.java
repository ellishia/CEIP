package doc.studentdoc;

import doc.Alumnado;
import doc.alumnado.Indice;
import doc.alumnado.Student;
import doc.studentdoc.Schema;
import doc.studentdoc.schema.Entry;
import java.util.ArrayList;
import org.monet.bpi.ContestantRequest;
import org.monet.bpi.CustomerRequest;
import org.monet.bpi.ImporterScope;
import org.monet.bpi.NodeDocument;
import org.monet.bpi.OperationExpression;
import org.monet.bpi.ProviderResponse;
import org.monet.bpi.java.ImporterImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.File;

@SuppressWarnings("all")
public class Importador extends ImporterImpl {
  public Class<?> getTargetSchemaClass() {
    return doc.studentdoc.Schema.class;
  }
  
  private void onImportItem(final Schema item) {
    Alumnado students = Alumnado.getInstance();
    ArrayList<Entry> _entry = item.getEntry();
    for (final Entry entry : _entry) {
      String _cial = entry.getCial();
      OperationExpression _Eq = Indice.Cial.Eq(_cial);
      long _count = students.getCount(_Eq);
      boolean _equals = (_count == 0);
      if (_equals) {
        Student student = Student.createNew(students);
        String _studentName = entry.getStudentName();
        student.setName(_studentName);
        String _studentSurname = entry.getStudentSurname();
        student.setSurname(_studentSurname);
        String _cial_1 = entry.getCial();
        student.setCial(_cial_1);
        Date _birthdate = entry.getBirthdate();
        student.setBirthDate(_birthdate);
        student.save();
      }
    }
  }
  
  public void onImportItem(final org.monet.bpi.Schema item) {
    super.onImportItem(item);
    this.onImportItem((doc.studentdoc.Schema)item);
  }
  
  public static ImporterScope doImportOf(final NodeDocument node) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("doc.StudentDoc.Importador").prepareImportOf(node);
  }
  
  public static ImporterScope doImportOf(final org.monet.bpi.Schema schema) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("doc.StudentDoc.Importador").prepareImportOf(schema);
  }
  
  public static ImporterScope doImportOf(final File file) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("doc.StudentDoc.Importador").prepareImportOf(file);
  }
  
  public static ImporterScope doImportOf(final String url) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("doc.StudentDoc.Importador").prepareImportOf(url);
  }
  
  public static ImporterScope doImportOf(final String key, final CustomerRequest msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("doc.StudentDoc.Importador").prepareImportOf(key, msg);
  }
  
  public static ImporterScope doImportOf(final String key, final ContestantRequest msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("doc.StudentDoc.Importador").prepareImportOf(key, msg);
  }
  
  public static ImporterScope doImportOf(final String key, final ProviderResponse msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("doc.StudentDoc.Importador").prepareImportOf(key, msg);
  }
}
