package ceip.solicituddoc;

import ceip.Applications;
import ceip.applications.Application;
import ceip.applications.Indice;
import ceip.applications.application.Address;
import ceip.solicituddoc.Schema;
import com.google.common.base.Objects;
import org.monet.bpi.ContestantRequest;
import org.monet.bpi.CustomerRequest;
import org.monet.bpi.FieldSection;
import org.monet.bpi.ImporterScope;
import org.monet.bpi.Node;
import org.monet.bpi.NodeDocument;
import org.monet.bpi.OperationExpression;
import org.monet.bpi.ProviderResponse;
import org.monet.bpi.java.ImporterImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.File;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Importador extends ImporterImpl {
  public Class<?> getTargetSchemaClass() {
    return ceip.solicituddoc.Schema.class;
  }
  
  private void onImportItem(final Schema i) {
    Applications solicitudes = Applications.getInstance();
    Application solicitud = null;
    String _identifier = i.getIdentifier();
    OperationExpression _Eq = Indice.Identifier.Eq(_identifier);
    long _count = solicitudes.getCount(_Eq);
    boolean _notEquals = (_count != 0);
    if (_notEquals) {
      String _identifier_1 = i.getIdentifier();
      OperationExpression _Eq_1 = Indice.Identifier.Eq(_identifier_1);
      Indice appls = solicitudes.getFirst(_Eq_1);
      Node appl = appls.getIndexedNode();
      solicitud = ((Application) appl);
    } else {
      Application _createNew = Application.createNew(solicitudes);
      solicitud = _createNew;
    }
    String _identifier_2 = i.getIdentifier();
    solicitud.setIdentifier(_identifier_2);
    String _studentName = i.getStudentName();
    solicitud.setStudentName(_studentName);
    String _studentSurname = i.getStudentSurname();
    solicitud.setStudentSurname(_studentSurname);
    Date _birthDate = i.getBirthDate();
    solicitud.setBirthDate(_birthDate);
    String _cial = i.getCial();
    solicitud.setCial(_cial);
    Term _academicLevel = i.getAcademicLevel();
    solicitud.setLevel(_academicLevel);
    Term _academicYear = i.getAcademicYear();
    solicitud.setAcademicYear(_academicYear);
    Term _gender = i.getGender();
    solicitud.setGender(_gender);
    String _nationality = i.getNationality();
    solicitud.setNationality(_nationality);
    String _siblings = i.getSiblings();
    solicitud.setSiblings(_siblings);
    String _parents = i.getParents();
    solicitud.setParentsInCenter(_parents);
    FieldSection _addressField = solicitud.getAddressField();
    Address address = ((Address) _addressField);
    ceip.solicituddoc.schema.Address _address = i.getAddress();
    String _designation = _address.getDesignation();
    address.setDesignation(_designation);
    ceip.solicituddoc.schema.Address _address_1 = i.getAddress();
    String _street_name = _address_1.getStreet_name();
    address.setStreet_name(_street_name);
    ceip.solicituddoc.schema.Address _address_2 = i.getAddress();
    org.monet.bpi.types.Number _number = _address_2.getNumber();
    boolean _notEquals_1 = (!Objects.equal(_number, null));
    if (_notEquals_1) {
      ceip.solicituddoc.schema.Address _address_3 = i.getAddress();
      org.monet.bpi.types.Number _number_1 = _address_3.getNumber();
      address.setNumber(_number_1);
    } else {
      address.setNumber(0);
    }
    ceip.solicituddoc.schema.Address _address_4 = i.getAddress();
    String _appartment = _address_4.getAppartment();
    address.setAppartament(_appartment);
    ceip.solicituddoc.schema.Address _address_5 = i.getAddress();
    String _neigbourhood = _address_5.getNeigbourhood();
    address.setNeigbourhood(_neigbourhood);
    ceip.solicituddoc.schema.Address _address_6 = i.getAddress();
    String _city = _address_6.getCity();
    address.setCity(_city);
    ceip.solicituddoc.schema.Address _address_7 = i.getAddress();
    org.monet.bpi.types.Number _zip_code = _address_7.getZip_code();
    boolean _notEquals_2 = (!Objects.equal(_zip_code, null));
    if (_notEquals_2) {
      ceip.solicituddoc.schema.Address _address_8 = i.getAddress();
      org.monet.bpi.types.Number _zip_code_1 = _address_8.getZip_code();
      address.setZip_code(_zip_code_1);
    } else {
      address.setZip_code(0);
    }
    solicitud.save();
  }
  
  public void onImportItem(final org.monet.bpi.Schema item) {
    super.onImportItem(item);
    this.onImportItem((ceip.solicituddoc.Schema)item);
  }
  
  public static ImporterScope doImportOf(final NodeDocument node) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.solicitudDoc.Importador").prepareImportOf(node);
  }
  
  public static ImporterScope doImportOf(final org.monet.bpi.Schema schema) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.solicitudDoc.Importador").prepareImportOf(schema);
  }
  
  public static ImporterScope doImportOf(final File file) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.solicitudDoc.Importador").prepareImportOf(file);
  }
  
  public static ImporterScope doImportOf(final String url) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.solicitudDoc.Importador").prepareImportOf(url);
  }
  
  public static ImporterScope doImportOf(final String key, final CustomerRequest msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.solicitudDoc.Importador").prepareImportOf(key, msg);
  }
  
  public static ImporterScope doImportOf(final String key, final ContestantRequest msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.solicitudDoc.Importador").prepareImportOf(key, msg);
  }
  
  public static ImporterScope doImportOf(final String key, final ProviderResponse msg) {
    return (org.monet.bpi.ImporterScope)org.monet.bpi.ImporterService.get("ceip.solicitudDoc.Importador").prepareImportOf(key, msg);
  }
}
