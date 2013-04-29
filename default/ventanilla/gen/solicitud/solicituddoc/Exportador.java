package solicitud.solicituddoc;

import org.monet.bpi.FieldSection;
import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Term;
import solicitud.Application;
import solicitud.ApplicationInfo;
import solicitud.applicationinfo.Address;
import solicitud.solicituddoc.Schema;
import solicitud.solicituddoc.exportador.ExporterScope;

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
    FieldSection _addressField = ficha.getAddressField();
    Address address = ((Address) _addressField);
    solicitud.solicituddoc.schema.Address _address = i.getAddress();
    String _designation = address.getDesignation();
    _address.setDesignation(_designation);
    solicitud.solicituddoc.schema.Address _address_1 = i.getAddress();
    String _street_name = address.getStreet_name();
    _address_1.setStreet_name(_street_name);
    solicitud.solicituddoc.schema.Address _address_2 = i.getAddress();
    org.monet.bpi.types.Number _number = address.getNumber();
    _address_2.setNumber(_number);
    solicitud.solicituddoc.schema.Address _address_3 = i.getAddress();
    String _appartament = address.getAppartament();
    _address_3.setAppartment(_appartament);
    solicitud.solicituddoc.schema.Address _address_4 = i.getAddress();
    String _neigbourhood = address.getNeigbourhood();
    _address_4.setNeigbourhood(_neigbourhood);
    solicitud.solicituddoc.schema.Address _address_5 = i.getAddress();
    String _city = address.getCity();
    _address_5.setCity(_city);
    solicitud.solicituddoc.schema.Address _address_6 = i.getAddress();
    org.monet.bpi.types.Number _zip_code = address.getZip_code();
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
