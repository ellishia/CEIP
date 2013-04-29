package ceip.applications;

import ceip.applications.Indice;
import java.util.ArrayList;
import org.monet.bpi.FieldBoolean;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldFile;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.File;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Application extends NodeFormImpl {
  public FieldText getIdentifierField() {
    return ((org.monet.bpi.FieldText)this.getField("Application", "Identifier"));
  }
  
  public String getIdentifier() {
    return ((org.monet.bpi.FieldText)this.getField("Application", "Identifier")).get();
  }
  
  public void setIdentifier(final String value) {
    this.getIdentifierField().set(value);
  }
  
  public FieldText getCialField() {
    return ((org.monet.bpi.FieldText)this.getField("Application", "Cial"));
  }
  
  public String getCial() {
    return ((org.monet.bpi.FieldText)this.getField("Application", "Cial")).get();
  }
  
  public void setCial(final String value) {
    this.getCialField().set(value);
  }
  
  public FieldText getStudentNameField() {
    return ((org.monet.bpi.FieldText)this.getField("Application", "StudentName"));
  }
  
  public String getStudentName() {
    return ((org.monet.bpi.FieldText)this.getField("Application", "StudentName")).get();
  }
  
  public void setStudentName(final String value) {
    this.getStudentNameField().set(value);
  }
  
  public FieldText getStudentSurnameField() {
    return ((org.monet.bpi.FieldText)this.getField("Application", "StudentSurname"));
  }
  
  public String getStudentSurname() {
    return ((org.monet.bpi.FieldText)this.getField("Application", "StudentSurname")).get();
  }
  
  public void setStudentSurname(final String value) {
    this.getStudentSurnameField().set(value);
  }
  
  public FieldDate getBirthDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("Application", "BirthDate"));
  }
  
  public Date getBirthDate() {
    return ((org.monet.bpi.FieldDate)this.getField("Application", "BirthDate")).get();
  }
  
  public void setBirthDate(final Date value) {
    this.getBirthDateField().set(value);
  }
  
  public FieldText getNationalityField() {
    return ((org.monet.bpi.FieldText)this.getField("Application", "Nationality"));
  }
  
  public String getNationality() {
    return ((org.monet.bpi.FieldText)this.getField("Application", "Nationality")).get();
  }
  
  public void setNationality(final String value) {
    this.getNationalityField().set(value);
  }
  
  public FieldSelect getLevelField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Application", "Level"));
  }
  
  public Term getLevel() {
    return ((org.monet.bpi.FieldSelect)this.getField("Application", "Level")).get();
  }
  
  public void setLevel(final Term value) {
    this.getLevelField().set(value);
  }
  
  public FieldSelect getGenderField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Application", "Gender"));
  }
  
  public Term getGender() {
    return ((org.monet.bpi.FieldSelect)this.getField("Application", "Gender")).get();
  }
  
  public void setGender(final Term value) {
    this.getGenderField().set(value);
  }
  
  public FieldSelect getAcademicYearField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Application", "AcademicYear"));
  }
  
  public Term getAcademicYear() {
    return ((org.monet.bpi.FieldSelect)this.getField("Application", "AcademicYear")).get();
  }
  
  public void setAcademicYear(final Term value) {
    this.getAcademicYearField().set(value);
  }
  
  public FieldText getSiblingsField() {
    return ((org.monet.bpi.FieldText)this.getField("Application", "Siblings"));
  }
  
  public String getSiblings() {
    return ((org.monet.bpi.FieldText)this.getField("Application", "Siblings")).get();
  }
  
  public void setSiblings(final String value) {
    this.getSiblingsField().set(value);
  }
  
  public FieldText getParentsInCenterField() {
    return ((org.monet.bpi.FieldText)this.getField("Application", "ParentsInCenter"));
  }
  
  public String getParentsInCenter() {
    return ((org.monet.bpi.FieldText)this.getField("Application", "ParentsInCenter")).get();
  }
  
  public void setParentsInCenter(final String value) {
    this.getParentsInCenterField().set(value);
  }
  
  public FieldMultiple<FieldFile,File> getDocumentsField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldFile, org.monet.bpi.types.File>)this.getField("Application", "Documents"));
  }
  
  public ArrayList<File> getDocuments() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldFile, org.monet.bpi.types.File>)this.getField("Application", "Documents")).getAll();
  }
  
  public FieldSection getAddressField() {
    return ((org.monet.bpi.FieldSection)this.getField("Application", "Address"));
  }
  
  public FieldBoolean getAdmitidoField() {
    return ((org.monet.bpi.FieldBoolean)this.getField("Application", "Admitido"));
  }
  
  public boolean getAdmitido() {
    return ((org.monet.bpi.FieldBoolean)this.getField("Application", "Admitido")).get();
  }
  
  public void setAdmitido(final boolean value) {
    this.getAdmitidoField().set(value);
  }
  
  public Indice getIndice() {
    return (ceip.applications.Indice)this.getIndexEntry("ceip.Applications.Indice");
  }
  
  public void constructor() {
    String nombreCompleto = this.getStudentName();
    String _plus = (nombreCompleto + " ");
    String _studentSurname = this.getStudentSurname();
    String _plus_1 = (_plus + _studentSurname);
    nombreCompleto = _plus_1;
    String _identifier = this.getIdentifier();
    String _plus_2 = (_identifier + " ");
    String _plus_3 = (_plus_2 + nombreCompleto);
    this.setLabel(_plus_3);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Application createNew(final Node parent) {
    return (ceip.applications.Application)org.monet.bpi.NodeService.create(ceip.applications.Application.class, parent);
  }
}
