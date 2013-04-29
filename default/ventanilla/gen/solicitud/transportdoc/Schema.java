package solicitud.transportdoc;

import org.monet.bpi.types.Term;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "schema", strict = false)
@SuppressWarnings("all")
public class Schema implements org.monet.bpi.Schema {
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
  
  @Element(name = "Address", required = false)
  private String Address;
  
  public String getAddress() {
    return this.Address;
  }
  
  public void setAddress(final String Address) {
    this.Address = Address;
  }
  
  @Element(name = "Distance", required = false)
  private org.monet.bpi.types.Number Distance;
  
  public org.monet.bpi.types.Number getDistance() {
    return this.Distance;
  }
  
  public void setDistance(final org.monet.bpi.types.Number Distance) {
    this.Distance = Distance;
  }
  
  @Element(name = "Trip", required = false)
  private String Trip;
  
  public String getTrip() {
    return this.Trip;
  }
  
  public void setTrip(final String Trip) {
    this.Trip = Trip;
  }
  
  @Element(name = "Stop", required = false)
  private String Stop;
  
  public String getStop() {
    return this.Stop;
  }
  
  public void setStop(final String Stop) {
    this.Stop = Stop;
  }
  
  @Element(name = "LeaveAt", required = false)
  private String LeaveAt;
  
  public String getLeaveAt() {
    return this.LeaveAt;
  }
  
  public void setLeaveAt(final String LeaveAt) {
    this.LeaveAt = LeaveAt;
  }
}
