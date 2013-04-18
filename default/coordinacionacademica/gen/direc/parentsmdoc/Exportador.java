package direc.parentsmdoc;

import direc.parentsmdoc.Schema;
import direc.parentsmdoc.exportador.ExporterScope;
import direc.parentsmdoc.schema.Docente;
import direc.parentsmeetings.ParentsMeeting;
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
    ParentsMeeting parentmet = ((ParentsMeeting) _scope);
    String _title = parentmet.getTitle();
    i.setTitleMeet(_title);
    Date _date = parentmet.getDate();
    i.setDateMeeting(_date);
    Link _group = parentmet.getGroup();
    String _label = _group.getLabel();
    i.setGroup(_label);
    Link _room = parentmet.getRoom();
    String _label_1 = _room.getLabel();
    i.setRoom(_label_1);
    FieldMultiple<FieldLink,Link> _teachersField = parentmet.getTeachersField();
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
    this.onExportItem((direc.parentsmdoc.Schema)item);
  }
  
  public static ExporterScope doExportOf(final Node node) {
    return (direc.parentsmdoc.exportador.ExporterScope)org.monet.bpi.ExporterService.get("direc.ParentsMDoc.Exportador").prepareExportOf(node);
  }
  
  public org.monet.bpi.ExporterScope prepareExportOf(final Node node) {
    return (org.monet.bpi.ExporterScope) new direc.parentsmdoc.exportador.ExporterScope(this, node);
  }
}
