package solicitud.canteendoc;

import org.monet.bpi.types.Term;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import solicitud.canteendoc.schema.Criteria;

@Root(name = "schema", strict = false)
@SuppressWarnings("all")
public class Schema implements org.monet.bpi.Schema {
  @Element(name = "Criteria", required = false)
  private Criteria Criteria = new solicitud.canteendoc.schema.Criteria();
  
  public Criteria getCriteria() {
    return this.Criteria;
  }
  
  public void setCriteria(final Criteria Criteria) {
    this.Criteria = Criteria;
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
  
  @Element(name = "Identifier", required = false)
  private String Identifier;
  
  public String getIdentifier() {
    return this.Identifier;
  }
  
  public void setIdentifier(final String Identifier) {
    this.Identifier = Identifier;
  }
  
  @Element(name = "AcademicYear", required = false)
  private Term AcademicYear;
  
  public Term getAcademicYear() {
    return this.AcademicYear;
  }
  
  public void setAcademicYear(final Term AcademicYear) {
    this.AcademicYear = AcademicYear;
  }
  
  @Element(name = "Schedule", required = false)
  private String Schedule;
  
  public String getSchedule() {
    return this.Schedule;
  }
  
  public void setSchedule(final String Schedule) {
    this.Schedule = Schedule;
  }
  
  @Element(name = "ActualPosition", required = false)
  private Boolean ActualPosition;
  
  public Boolean getActualPosition() {
    return this.ActualPosition;
  }
  
  public void setActualPosition(final Boolean ActualPosition) {
    this.ActualPosition = ActualPosition;
  }
  
  @Element(name = "Subsidized", required = false)
  private Boolean Subsidized;
  
  public Boolean getSubsidized() {
    return this.Subsidized;
  }
  
  public void setSubsidized(final Boolean Subsidized) {
    this.Subsidized = Subsidized;
  }
  
  @Element(name = "Observations", required = false)
  private String Observations;
  
  public String getObservations() {
    return this.Observations;
  }
  
  public void setObservations(final String Observations) {
    this.Observations = Observations;
  }
}
