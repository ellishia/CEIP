package solicitud.canteendoc.schema;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Criteria", strict = false)
@SuppressWarnings("all")
public class Criteria {
  @Element(name = "WorkingPersonalLife", required = false)
  private Boolean WorkingPersonalLife;
  
  public Boolean getWorkingPersonalLife() {
    return this.WorkingPersonalLife;
  }
  
  public void setWorkingPersonalLife(final Boolean WorkingPersonalLife) {
    this.WorkingPersonalLife = WorkingPersonalLife;
  }
  
  @Element(name = "Siblings", required = false)
  private Boolean Siblings;
  
  public Boolean getSiblings() {
    return this.Siblings;
  }
  
  public void setSiblings(final Boolean Siblings) {
    this.Siblings = Siblings;
  }
  
  @Element(name = "ParentsInSchool", required = false)
  private Boolean ParentsInSchool;
  
  public Boolean getParentsInSchool() {
    return this.ParentsInSchool;
  }
  
  public void setParentsInSchool(final Boolean ParentsInSchool) {
    this.ParentsInSchool = ParentsInSchool;
  }
  
  @Element(name = "AnualIncome", required = false)
  private Boolean AnualIncome;
  
  public Boolean getAnualIncome() {
    return this.AnualIncome;
  }
  
  public void setAnualIncome(final Boolean AnualIncome) {
    this.AnualIncome = AnualIncome;
  }
  
  @Element(name = "Handicaped", required = false)
  private Boolean Handicaped;
  
  public Boolean getHandicaped() {
    return this.Handicaped;
  }
  
  public void setHandicaped(final Boolean Handicaped) {
    this.Handicaped = Handicaped;
  }
  
  @Element(name = "MonoParentalorNumberusFamily", required = false)
  private Boolean MonoParentalorNumberusFamily;
  
  public Boolean getMonoParentalorNumberusFamily() {
    return this.MonoParentalorNumberusFamily;
  }
  
  public void setMonoParentalorNumberusFamily(final Boolean MonoParentalorNumberusFamily) {
    this.MonoParentalorNumberusFamily = MonoParentalorNumberusFamily;
  }
}
