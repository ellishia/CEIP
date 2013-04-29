package ceip.canteendoc;

import ceip.CanteenApplication;
import ceip.ServiceApplications;
import ceip.canteenapplication.Criteria;
import ceip.canteendoc.Schema;
import org.monet.bpi.ContestantRequest;
import org.monet.bpi.CustomerRequest;
import org.monet.bpi.FieldSection;
import org.monet.bpi.ImporterScope;
import org.monet.bpi.NodeDocument;
import org.monet.bpi.ProviderResponse;
import org.monet.bpi.java.ImporterImpl;
import org.monet.bpi.types.File;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Importador extends ImporterImpl {
  public Class<?> getTargetSchemaClass() {
    return ceip.canteendoc.Schema.class;
  }
  
  private void onImportItem(final Schema i) {
    ServiceApplications servicios = ServiceApplications.getInstance();
    CanteenApplication ficha = CanteenApplication.createNew(servicios);
    Term _academicYear = i.getAcademicYear();
    ficha.setAcademicYear(_academicYear);
    String _studentName = i.getStudentName();
    ficha.setStudentName(_studentName);
    String _studentSurname = i.getStudentSurname();
    ficha.setStudentSurname(_studentSurname);
    String _cial = i.getCial();
    ficha.setCial(_cial);
    String _schedule = i.getSchedule();
    ficha.setSchedule(_schedule);
    Boolean _actualPosition = i.getActualPosition();
    ficha.setActualPosition((_actualPosition).booleanValue());
    Boolean _subsidized = i.getSubsidized();
    ficha.setSubsidized((_subsidized).booleanValue());
    FieldSection _criteriaField = ficha.getCriteriaField();
    Criteria criteria = ((Criteria) _criteriaField);
    ceip.canteendoc.schema.Criteria _criteria = i.getCriteria();
    Boolean _anualIncome = _criteria.getAnualIncome();
    criteria.setAnualIncome((_anualIncome).booleanValue());
    ceip.canteendoc.schema.Criteria _criteria_1 = i.getCriteria();
    Boolean _workingPersonalLife = _criteria_1.getWorkingPersonalLife();
    criteria.setWorkingPersonalLife((_workingPersonalLife).booleanValue());
    ceip.canteendoc.schema.Criteria _criteria_2 = i.getCriteria();
    Boolean _siblings = _criteria_2.getSiblings();
    criteria.setSiblings((_siblings).booleanValue());
    ceip.canteendoc.schema.Criteria _criteria_3 = i.getCriteria();
    Boolean _parentsInSchool = _criteria_3.getParentsInSchool();
    criteria.setParentsInSchool((_parentsInSchool).booleanValue());
    ceip.canteendoc.schema.Criteria _criteria_4 = i.getCriteria();
    Boolean _handcaped = _criteria_4.getHandcaped();
    criteria.setHandcaped((_handcaped).booleanValue());
    String _observations = i.getObservations();
    ficha.setObservations(_observations);
    ficha.save();
  }
  
  public void onImportItem(final org.monet.bpi.Schema item) {
    super.onImportItem(item);
    this.onImportItem((ceip.canteendoc.Schema)item);
  }
  
  public static ImporterScope doImportOf(final NodeDocument node) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.CanteenDoc.Importador").prepareImportOf(node);
  }
  
  public static ImporterScope doImportOf(final org.monet.bpi.Schema schema) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.CanteenDoc.Importador").prepareImportOf(schema);
  }
  
  public static ImporterScope doImportOf(final File file) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.CanteenDoc.Importador").prepareImportOf(file);
  }
  
  public static ImporterScope doImportOf(final String url) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.CanteenDoc.Importador").prepareImportOf(url);
  }
  
  public static ImporterScope doImportOf(final String key, final CustomerRequest msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.CanteenDoc.Importador").prepareImportOf(key, msg);
  }
  
  public static ImporterScope doImportOf(final String key, final ContestantRequest msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.CanteenDoc.Importador").prepareImportOf(key, msg);
  }
  
  public static ImporterScope doImportOf(final String key, final ProviderResponse msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.CanteenDoc.Importador").prepareImportOf(key, msg);
  }
}
