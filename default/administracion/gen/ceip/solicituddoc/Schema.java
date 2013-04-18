package ceip.solicituddoc;

import ceip.solicituddoc.schema.Address;
import ceip.solicituddoc.schema.Entry;
import java.util.ArrayList;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Term;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "schema", strict = false)
@SuppressWarnings("all")
public class Schema implements org.monet.bpi.Schema {
  @Element(name = "Address", required = false)
  private Address Address = new ceip.solicituddoc.schema.Address();
  
  public Address getAddress() {
    return this.Address;
  }
  
  public void setAddress(final Address Address) {
    this.Address = Address;
  }
  
  @ElementList(name = "entry", required = false)
  private ArrayList<Entry> entry = new java.util.ArrayList<ceip.solicituddoc.schema.Entry>();
  
  public ArrayList<Entry> getEntry() {
    return this.entry;
  }
  
  public void setEntry(final ArrayList<Entry> entry) {
    this.entry = entry;
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
  
  @Element(name = "AcademicLevel", required = false)
  private Term AcademicLevel;
  
  public Term getAcademicLevel() {
    return this.AcademicLevel;
  }
  
  public void setAcademicLevel(final Term AcademicLevel) {
    this.AcademicLevel = AcademicLevel;
  }
  
  @Element(name = "AcademicYear", required = false)
  private Term AcademicYear;
  
  public Term getAcademicYear() {
    return this.AcademicYear;
  }
  
  public void setAcademicYear(final Term AcademicYear) {
    this.AcademicYear = AcademicYear;
  }
  
  @Element(name = "Identifier", required = false)
  private String Identifier;
  
  public String getIdentifier() {
    return this.Identifier;
  }
  
  public void setIdentifier(final String Identifier) {
    this.Identifier = Identifier;
  }
  
  @Element(name = "BirthDate", required = false)
  private Date BirthDate;
  
  public Date getBirthDate() {
    return this.BirthDate;
  }
  
  public void setBirthDate(final Date BirthDate) {
    this.BirthDate = BirthDate;
  }
  
  @Element(name = "Nationality", required = false)
  private String Nationality;
  
  public String getNationality() {
    return this.Nationality;
  }
  
  public void setNationality(final String Nationality) {
    this.Nationality = Nationality;
  }
  
  @Element(name = "Gender", required = false)
  private Term Gender;
  
  public Term getGender() {
    return this.Gender;
  }
  
  public void setGender(final Term Gender) {
    this.Gender = Gender;
  }
  
  @Element(name = "Siblings", required = false)
  private String Siblings;
  
  public String getSiblings() {
    return this.Siblings;
  }
  
  public void setSiblings(final String Siblings) {
    this.Siblings = Siblings;
  }
  
  @Element(name = "Parents", required = false)
  private String Parents;
  
  public String getParents() {
    return this.Parents;
  }
  
  public void setParents(final String Parents) {
    this.Parents = Parents;
  }
  
  @Element(name = "Matriculable", required = false)
  private Boolean Matriculable;
  
  public Boolean getMatriculable() {
    return this.Matriculable;
  }
  
  public void setMatriculable(final Boolean Matriculable) {
    this.Matriculable = Matriculable;
  }
}
