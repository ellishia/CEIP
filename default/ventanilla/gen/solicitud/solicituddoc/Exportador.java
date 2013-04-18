package solicitud.solicituddoc;

import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Term;
import solicitud.Application;
import solicitud.ApplicationInfo;
import solicitud.solicituddoc.Schema;
import solicitud.solicituddoc.exportador.ExporterScope;
import solicitud.solicituddoc.schema.Address;

@SuppressWarnings("all")
public class Exportador extends ExporterImpl {
  private void onExportItem(final Schema i) {
    Node _scope = this.getScope();
    Application contenedor = ((Application) _scope);
    ApplicationInfo ficha = contenedor.getApplicationInfo();
    String _studentName = ficha.getStudentName();
    i.setStudentName(_studentName);
    String _studentSurname = ficha.getStudentSurname();
    i.setStudentSurname(_studentSurname);
    String _cial = ficha.getCial();
    i.setCial(_cial);
    Date _birthdate = ficha.getBirthdate();
    i.setBirthDate(_birthdate);
    Term _level = ficha.getLevel();
    i.setAcademicLevel(_level);
    Term _academicYear = ficha.getAcademicYear();
    i.setAcademicYear(_academicYear);
    String _nationality = ficha.getNationality();
    i.setNationality(_nationality);
    Term _gender = ficha.getGender();
    i.setGender(_gender);
    String _identifier = ficha.getIdentifier();
    i.setIdentifier(_identifier);
    String _siblings = ficha.getSiblings();
    i.setSiblings(_siblings);
    String _parentsInCenter = ficha.getParentsInCenter();
    i.setParents(_parentsInCenter);
    boolean _matriculable = ficha.getMatriculable();
    i.setMatriculable(Boolean.valueOf(_matriculable));
    Address _address = i.getAddress();
    solicitud.applicationinfo.Address _addressField = ficha.getAddressField();
    String _designation = _addressField.getDesignation();
    _address.setDesignation(_designation);
    Address _address_1 = i.getAddress();
    solicitud.applicationinfo.Address _addressField_1 = ficha.getAddressField();
    String _street_name = _addressField_1.getStreet_name();
    _address_1.setStreet_name(_street_name);
    Address _address_2 = i.getAddress();
    solicitud.applicationinfo.Address _addressField_2 = ficha.getAddressField();
    org.monet.bpi.types.Number _number = _addressField_2.getNumber();
    _address_2.setNumber(_number);
    Address _address_3 = i.getAddress();
    solicitud.applicationinfo.Address _addressField_3 = ficha.getAddressField();
    String _appartament = _addressField_3.getAppartament();
    _address_3.setAppartment(_appartament);
    Address _address_4 = i.getAddress();
    solicitud.applicationinfo.Address _addressField_4 = ficha.getAddressField();
    String _neigbourhood = _addressField_4.getNeigbourhood();
    _address_4.setNeigbourhood(_neigbourhood);
    Address _address_5 = i.getAddress();
    solicitud.applicationinfo.Address _addressField_5 = ficha.getAddressField();
    String _city = _addressField_5.getCity();
    _address_5.setCity(_city);
    Address _address_6 = i.getAddress();
    solicitud.applicationinfo.Address _addressField_6 = ficha.getAddressField();
    org.monet.bpi.types.Number _zip_code = _addressField_6.getZip_code();
    _address_6.setZip_code(_zip_code);
  }
  
  public void onExportItem(final org.monet.bpi.Schema item) {
    super.onExportItem(item);
    this.onExportItem((solicitud.solicituddoc.Schema)item);
  }
  
  public static ExporterScope doExportOf(final Node node) {
    return (solicitud.solicituddoc.exportador.ExporterScope)org.monet.bpi.ExporterService.get("solicitud.solicitudDoc.Exportador").prepareExportOf(node);
  }
  
  public org.monet.bpi.ExporterScope prepareExportOf(final Node node) {
    return (org.monet.bpi.ExporterScope) new solicitud.solicituddoc.exportador.ExporterScope(this, node);
  }
}
