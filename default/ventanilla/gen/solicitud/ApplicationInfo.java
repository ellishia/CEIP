package solicitud;

import java.util.ArrayList;
import org.monet.bpi.ClientService;
import org.monet.bpi.FieldBoolean;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldFile;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldSerial;
import org.monet.bpi.FieldText;
import org.monet.bpi.MonetLink;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.File;
import org.monet.bpi.types.Term;
import solicitud.Application;
import solicitud.applicationinfo.Address;
import solicitud.applicationinfo.AppliedCenters;
import solicitud.applications.Indice;
import solicitud.procesos.PublicarPlaza;

@SuppressWarnings("all")
public class ApplicationInfo extends NodeFormImpl {
  public FieldBoolean getMatriculableField() {
    return ((org.monet.bpi.FieldBoolean)this.getField("ApplicationInfo", "Matriculable"));
  }
  
  public boolean getMatriculable() {
    return ((org.monet.bpi.FieldBoolean)this.getField("ApplicationInfo", "Matriculable")).get();
  }
  
  public void setMatriculable(final boolean value) {
    this.getMatriculableField().set(value);
  }
  
  public FieldSerial getIdentifierField() {
    return ((org.monet.bpi.FieldSerial)this.getField("ApplicationInfo", "Identifier"));
  }
  
  public String getIdentifier() {
    return ((org.monet.bpi.FieldSerial)this.getField("ApplicationInfo", "Identifier")).get();
  }
  
  public void setIdentifier(final String value) {
    this.getIdentifierField().set(value);
  }
  
  public FieldDate getDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("ApplicationInfo", "Date"));
  }
  
  public Date getDate() {
    return ((org.monet.bpi.FieldDate)this.getField("ApplicationInfo", "Date")).get();
  }
  
  public void setDate(final Date value) {
    this.getDateField().set(value);
  }
  
  public FieldText getStudentNameField() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "StudentName"));
  }
  
  public String getStudentName() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "StudentName")).get();
  }
  
  public void setStudentName(final String value) {
    this.getStudentNameField().set(value);
  }
  
  public FieldText getStudentSurnameField() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "StudentSurname"));
  }
  
  public String getStudentSurname() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "StudentSurname")).get();
  }
  
  public void setStudentSurname(final String value) {
    this.getStudentSurnameField().set(value);
  }
  
  public FieldText getCialField() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "Cial"));
  }
  
  public String getCial() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "Cial")).get();
  }
  
  public void setCial(final String value) {
    this.getCialField().set(value);
  }
  
  public FieldDate getBirthdateField() {
    return ((org.monet.bpi.FieldDate)this.getField("ApplicationInfo", "Birthdate"));
  }
  
  public Date getBirthdate() {
    return ((org.monet.bpi.FieldDate)this.getField("ApplicationInfo", "Birthdate")).get();
  }
  
  public void setBirthdate(final Date value) {
    this.getBirthdateField().set(value);
  }
  
  public FieldText getNationalityField() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "Nationality"));
  }
  
  public String getNationality() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "Nationality")).get();
  }
  
  public void setNationality(final String value) {
    this.getNationalityField().set(value);
  }
  
  public FieldSelect getGenderField() {
    return ((org.monet.bpi.FieldSelect)this.getField("ApplicationInfo", "Gender"));
  }
  
  public Term getGender() {
    return ((org.monet.bpi.FieldSelect)this.getField("ApplicationInfo", "Gender")).get();
  }
  
  public void setGender(final Term value) {
    this.getGenderField().set(value);
  }
  
  public Address getAddressField() {
    return ((solicitud.applicationinfo.Address)this.getField("ApplicationInfo", "Address"));
  }
  
  public FieldMultiple<AppliedCenters,Void> getAppliedCentersField() {
    return ((org.monet.bpi.FieldMultiple<solicitud.applicationinfo.AppliedCenters, java.lang.Void>)this.getField("ApplicationInfo", "AppliedCenters"));
  }
  
  public FieldSelect getLevelField() {
    return ((org.monet.bpi.FieldSelect)this.getField("ApplicationInfo", "Level"));
  }
  
  public Term getLevel() {
    return ((org.monet.bpi.FieldSelect)this.getField("ApplicationInfo", "Level")).get();
  }
  
  public void setLevel(final Term value) {
    this.getLevelField().set(value);
  }
  
  public FieldSelect getAcademicYearField() {
    return ((org.monet.bpi.FieldSelect)this.getField("ApplicationInfo", "AcademicYear"));
  }
  
  public Term getAcademicYear() {
    return ((org.monet.bpi.FieldSelect)this.getField("ApplicationInfo", "AcademicYear")).get();
  }
  
  public void setAcademicYear(final Term value) {
    this.getAcademicYearField().set(value);
  }
  
  public FieldText getSiblingsField() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "Siblings"));
  }
  
  public String getSiblings() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "Siblings")).get();
  }
  
  public void setSiblings(final String value) {
    this.getSiblingsField().set(value);
  }
  
  public FieldText getParentsInCenterField() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "ParentsInCenter"));
  }
  
  public String getParentsInCenter() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "ParentsInCenter")).get();
  }
  
  public void setParentsInCenter(final String value) {
    this.getParentsInCenterField().set(value);
  }
  
  public FieldMultiple<FieldFile,File> getDocumentsField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldFile, org.monet.bpi.types.File>)this.getField("ApplicationInfo", "Documents"));
  }
  
  public ArrayList<File> getDocuments() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldFile, org.monet.bpi.types.File>)this.getField("ApplicationInfo", "Documents")).getAll();
  }
  
  public Indice getIndice() {
    return (solicitud.applications.Indice)this.getIndexEntry("solicitud.Applications.Indice");
  }
  
  public void onPreinscripcion() {
    PublicarPlaza preinscripcion = PublicarPlaza.createNew();
    Node _owner = this.getOwner();
    Application contenedor = ((Application) _owner);
    preinscripcion.setTarget(contenedor);
    preinscripcion.save();
    preinscripcion.resume();
    String _id = preinscripcion.getId();
    MonetLink _forTask = MonetLink.forTask(_id);
    ClientService.redirectUserTo(_forTask);
  }
  
  public void constructor() {
    Date _date = new Date();
    this.setDate(_date);
  }
  
  public void executeCommand(final String operation) {
    if(operation.equals("Preinscripcion")) {
    	this.onPreinscripcion();
    }super.executeCommand(operation);
  }
  
  public static ApplicationInfo createNew(final Node parent) {
    return (solicitud.ApplicationInfo)org.monet.bpi.NodeService.create(solicitud.ApplicationInfo.class, parent);
  }
}
