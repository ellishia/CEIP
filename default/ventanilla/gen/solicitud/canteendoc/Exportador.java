package solicitud.canteendoc;

import org.monet.bpi.FieldSection;
import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl;
import org.monet.bpi.types.Term;
import solicitud.CanteenApplication;
import solicitud.canteenapplication.Criteria;
import solicitud.canteendoc.Schema;
import solicitud.canteendoc.exportador.ExporterScope;

@SuppressWarnings("all")
public class Exportador extends ExporterImpl {
  private void onExportItem(final Schema i) {
    Node _scope = this.getScope();
    CanteenApplication ficha = ((CanteenApplication) _scope);
    Term _academicYear = ficha.getAcademicYear();
    i.setAcademicYear(_academicYear);
    String _studentName = ficha.getStudentName();
    i.setStudentName(_studentName);
    String _studentSurname = ficha.getStudentSurname();
    i.setStudentSurname(_studentSurname);
    String _cial = ficha.getCial();
    i.setCial(_cial);
    String _identifier = ficha.getIdentifier();
    i.setIdentifier(_identifier);
    String _schedule = ficha.getSchedule();
    i.setSchedule(_schedule);
    boolean _actualPosition = ficha.getActualPosition();
    i.setActualPosition(Boolean.valueOf(_actualPosition));
    boolean _subsidized = ficha.getSubsidized();
    i.setSubsidized(Boolean.valueOf(_subsidized));
    FieldSection _criteriaField = ficha.getCriteriaField();
    Criteria criteria = ((Criteria) _criteriaField);
    solicitud.canteendoc.schema.Criteria _criteria = i.getCriteria();
    boolean _anualIncome = criteria.getAnualIncome();
    _criteria.setAnualIncome(Boolean.valueOf(_anualIncome));
    solicitud.canteendoc.schema.Criteria _criteria_1 = i.getCriteria();
    boolean _workingPersonalLife = criteria.getWorkingPersonalLife();
    _criteria_1.setWorkingPersonalLife(Boolean.valueOf(_workingPersonalLife));
    solicitud.canteendoc.schema.Criteria _criteria_2 = i.getCriteria();
    boolean _siblings = criteria.getSiblings();
    _criteria_2.setSiblings(Boolean.valueOf(_siblings));
    solicitud.canteendoc.schema.Criteria _criteria_3 = i.getCriteria();
    boolean _parentsInSchool = criteria.getParentsInSchool();
    _criteria_3.setParentsInSchool(Boolean.valueOf(_parentsInSchool));
    String _observations = ficha.getObservations();
    i.setObservations(_observations);
  }
  
  public void onExportItem(final org.monet.bpi.Schema item) {
    super.onExportItem(item);
    this.onExportItem((solicitud.canteendoc.Schema)item);
  }
  
  public static ExporterScope doExportOf(final Node node) {
    return (solicitud.canteendoc.exportador.ExporterScope)org.monet.bpi.ExporterService.get("solicitud.canteenDoc.Exportador").prepareExportOf(node);
  }
  
  public org.monet.bpi.ExporterScope prepareExportOf(final Node node) {
    return (org.monet.bpi.ExporterScope) new solicitud.canteendoc.exportador.ExporterScope(this, node);
  }
}
