package ceip.canteendoc;

import ceip.CanteenApplication;
import ceip.ServiceApplications;
import ceip.canteenapplication.Criteria;
import ceip.canteendoc.Schema;
import ceip.serviceapplications.Indice;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.monet.bpi.ContestantRequest;
import org.monet.bpi.CustomerRequest;
import org.monet.bpi.FieldSection;
import org.monet.bpi.ImporterScope;
import org.monet.bpi.Node;
import org.monet.bpi.NodeDocument;
import org.monet.bpi.OperationExpression;
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
    CanteenApplication ficha = null;
    String _identifier = i.getIdentifier();
    OperationExpression _Eq = Indice.Identifier.Eq(_identifier);
    long _count = servicios.getCount(_Eq);
    boolean _notEquals = (_count != 0);
    if (_notEquals) {
      String _identifier_1 = i.getIdentifier();
      OperationExpression _Eq_1 = Indice.Identifier.Eq(_identifier_1);
      Indice serv = servicios.getFirst(_Eq_1);
      Node comedor = serv.getIndexedNode();
      ficha = ((CanteenApplication) comedor);
    } else {
      CanteenApplication _createNew = CanteenApplication.createNew(servicios);
      ficha = _createNew;
    }
    Term _academicYear = i.getAcademicYear();
    ficha.setAcademicYear(_academicYear);
    String _studentName = i.getStudentName();
    ficha.setStudentName(_studentName);
    String _studentSurname = i.getStudentSurname();
    ficha.setStudentSurname(_studentSurname);
    String _cial = i.getCial();
    ficha.setCial(_cial);
    String _identifier_2 = i.getIdentifier();
    ficha.setIdentifier(_identifier_2);
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
    Boolean _handicaped = _criteria_4.getHandicaped();
    criteria.setHandicaped((_handicaped).booleanValue());
    try {
      String _observations = i.getObservations();
      ficha.setObservations(_observations);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        ficha.setObservations("");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
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
