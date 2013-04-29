package solicitud.serviceapplications;

import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Term;
import solicitud.serviceapplications.Indice;

@SuppressWarnings("all")
public abstract class ServiceApplication extends NodeFormImpl {
  public FieldText getStudentNameField() {
    return ((org.monet.bpi.FieldText)this.getField("ServiceApplication", "StudentName"));
  }
  
  public String getStudentName() {
    return ((org.monet.bpi.FieldText)this.getField("ServiceApplication", "StudentName")).get();
  }
  
  public void setStudentName(final String value) {
    this.getStudentNameField().set(value);
  }
  
  public FieldText getStudentSurnameField() {
    return ((org.monet.bpi.FieldText)this.getField("ServiceApplication", "StudentSurname"));
  }
  
  public String getStudentSurname() {
    return ((org.monet.bpi.FieldText)this.getField("ServiceApplication", "StudentSurname")).get();
  }
  
  public void setStudentSurname(final String value) {
    this.getStudentSurnameField().set(value);
  }
  
  public FieldText getCialField() {
    return ((org.monet.bpi.FieldText)this.getField("ServiceApplication", "Cial"));
  }
  
  public String getCial() {
    return ((org.monet.bpi.FieldText)this.getField("ServiceApplication", "Cial")).get();
  }
  
  public void setCial(final String value) {
    this.getCialField().set(value);
  }
  
  public FieldSelect getAcademicYearField() {
    return ((org.monet.bpi.FieldSelect)this.getField("ServiceApplication", "AcademicYear"));
  }
  
  public Term getAcademicYear() {
    return ((org.monet.bpi.FieldSelect)this.getField("ServiceApplication", "AcademicYear")).get();
  }
  
  public void setAcademicYear(final Term value) {
    this.getAcademicYearField().set(value);
  }
  
  public FieldDate getDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("ServiceApplication", "Date"));
  }
  
  public Date getDate() {
    return ((org.monet.bpi.FieldDate)this.getField("ServiceApplication", "Date")).get();
  }
  
  public void setDate(final Date value) {
    this.getDateField().set(value);
  }
  
  public Indice getIndice() {
    return (solicitud.serviceapplications.Indice)this.getIndexEntry("solicitud.ServiceApplications.Indice");
  }
  
  public void constructor() {
    Date _date = new Date();
    this.setDate(_date);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static ServiceApplication createNew(final Node parent) {
    return (solicitud.serviceapplications.ServiceApplication)org.monet.bpi.NodeService.create(solicitud.serviceapplications.ServiceApplication.class, parent);
  }
}
