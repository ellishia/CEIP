package ceip.academicrecords;

import org.monet.bpi.types.Date;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "schema", strict = false)
@SuppressWarnings("all")
public class Schema implements org.monet.bpi.Schema {
  @Element(name = "CentroAcademico", required = false)
  private String CentroAcademico;
  
  public String getCentroAcademico() {
    return this.CentroAcademico;
  }
  
  public void setCentroAcademico(final String CentroAcademico) {
    this.CentroAcademico = CentroAcademico;
  }
  
  @Element(name = "AnyoAcademico", required = false)
  private String AnyoAcademico;
  
  public String getAnyoAcademico() {
    return this.AnyoAcademico;
  }
  
  public void setAnyoAcademico(final String AnyoAcademico) {
    this.AnyoAcademico = AnyoAcademico;
  }
  
  @Element(name = "DocumentType", required = false)
  private String DocumentType;
  
  public String getDocumentType() {
    return this.DocumentType;
  }
  
  public void setDocumentType(final String DocumentType) {
    this.DocumentType = DocumentType;
  }
  
  @Element(name = "StudentName", required = false)
  private String StudentName;
  
  public String getStudentName() {
    return this.StudentName;
  }
  
  public void setStudentName(final String StudentName) {
    this.StudentName = StudentName;
  }
  
  @Element(name = "StudentSurname", required = false)
  private String StudentSurname;
  
  public String getStudentSurname() {
    return this.StudentSurname;
  }
  
  public void setStudentSurname(final String StudentSurname) {
    this.StudentSurname = StudentSurname;
  }
  
  @Element(name = "Cial", required = false)
  private String Cial;
  
  public String getCial() {
    return this.Cial;
  }
  
  public void setCial(final String Cial) {
    this.Cial = Cial;
  }
  
  @Element(name = "City", required = false)
  private String City;
  
  public String getCity() {
    return this.City;
  }
  
  public void setCity(final String City) {
    this.City = City;
  }
  
  @Element(name = "Date", required = false)
  private Date Date;
  
  public Date getDate() {
    return this.Date;
  }
  
  public void setDate(final Date Date) {
    this.Date = Date;
  }
}
