package direc.minutedoc;

import direc.minutedoc.Schema;
import direc.minutedoc.exportador.ExporterScope;
import direc.minutedoc.schema.Docente;
import direc.minutes.Acta;
import direc.teachers.Teacher;
import java.util.ArrayList;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;

@SuppressWarnings("all")
public class Exportador extends ExporterImpl {
  private void onExportItem(final Schema i) {
    Node _scope = this.getScope();
    Acta ficha = ((Acta) _scope);
    Date _date = ficha.getDate();
    i.setDateMeeting(_date);
    Link _room = ficha.getRoom();
    String _label = _room.getLabel();
    i.setRoom(_label);
    i.setDocumentType("Acta de reuni\u00F3n");
    i.setCity("Las Palmas de G.C.");
    i.setFirmante("La direcci\u00F3n");
    String _title = ficha.getTitle();
    i.setOrden(_title);
    String _description = ficha.getDescription();
    i.setDescription(_description);
    FieldMultiple<FieldLink,Link> _teachersField = ficha.getTeachersField();
    ArrayList<FieldLink> _allFields = _teachersField.getAllFields();
    for (final FieldLink item : _allFields) {
      {
        Node _node = item.getNode();
        Teacher teacher = ((Teacher) _node);
        Docente _docente = new Docente();
        Docente docente = _docente;
        String _name = teacher.getName();
        String _plus = (_name + " ");
        String _surname = teacher.getSurname();
        String _plus_1 = (_plus + _surname);
        docente.setDocente(_plus_1);
        String _specialty = teacher.getSpecialty();
        docente.setSubject(_specialty);
        ArrayList<Docente> _docente_1 = i.getDocente();
        _docente_1.add(docente);
      }
    }
  }
  
  public void onExportItem(final org.monet.bpi.Schema item) {
    super.onExportItem(item);
    this.onExportItem((direc.minutedoc.Schema)item);
  }
  
  public static ExporterScope doExportOf(final Node node) {
    return (direc.minutedoc.exportador.ExporterScope)org.monet.bpi.ExporterService.get("direc.MinuteDoc.Exportador").prepareExportOf(node);
  }
  
  public org.monet.bpi.ExporterScope prepareExportOf(final Node node) {
    return (org.monet.bpi.ExporterScope) new direc.minutedoc.exportador.ExporterScope(this, node);
  }
}
