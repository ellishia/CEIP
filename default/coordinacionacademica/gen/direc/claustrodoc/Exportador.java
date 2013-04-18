package direc.claustrodoc;

import direc.claustrodoc.Schema;
import direc.claustrodoc.exportador.ExporterScope;
import direc.claustrodoc.schema.Docente;
import direc.claustros.Claustro;
import direc.dayorders.DayOrder;
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
    Claustro ficha = ((Claustro) _scope);
    Date _date = ficha.getDate();
    i.setDateMeeting(_date);
    Link _room = ficha.getRoom();
    String _label = _room.getLabel();
    i.setRoom(_label);
    i.setDocumentType("Convocatoria de Claustro");
    i.setCity("Las Palmas de G.C.");
    i.setFirmante("La direcci\u00F3n");
    FieldLink _dayOrderField = ficha.getDayOrderField();
    Node _node = _dayOrderField.getNode();
    DayOrder dayOrder = ((DayOrder) _node);
    String _topics = dayOrder.getTopics();
    i.setOrder(_topics);
    FieldMultiple<FieldLink,Link> _teachersField = ficha.getTeachersField();
    ArrayList<FieldLink> _allFields = _teachersField.getAllFields();
    for (final FieldLink item : _allFields) {
      {
        Node _node_1 = item.getNode();
        Teacher teacher = ((Teacher) _node_1);
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
    this.onExportItem((direc.claustrodoc.Schema)item);
  }
  
  public static ExporterScope doExportOf(final Node node) {
    return (direc.claustrodoc.exportador.ExporterScope)org.monet.bpi.ExporterService.get("direc.ClaustroDoc.Exportador").prepareExportOf(node);
  }
  
  public org.monet.bpi.ExporterScope prepareExportOf(final Node node) {
    return (org.monet.bpi.ExporterScope) new direc.claustrodoc.exportador.ExporterScope(this, node);
  }
}
