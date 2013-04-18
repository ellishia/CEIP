package ceip.admiteddoc.schema;

import org.monet.bpi.types.Term;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "entry", strict = false)
@SuppressWarnings("all")
public class Entry {
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
  
  @Element(name = "Level", required = false)
  private Term Level;
  
  public Term getLevel() {
    return this.Level;
  }
  
  public void setLevel(final Term Level) {
    this.Level = Level;
  }
}
