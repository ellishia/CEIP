package ceip.canteenapplication;

import org.monet.bpi.FieldBoolean;
import org.monet.bpi.FieldSection;
import org.monet.bpi.java.FieldSectionImpl;

@SuppressWarnings("all")
public class Criteria extends FieldSectionImpl implements FieldSection {
  public FieldBoolean getWorkingPersonalLifeField() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "WorkingPersonalLife"));
  }
  
  public boolean getWorkingPersonalLife() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "WorkingPersonalLife")).get();
  }
  
  public void setWorkingPersonalLife(final boolean value) {
    this.getWorkingPersonalLifeField().set(value);
  }
  
  public FieldBoolean getSiblingsField() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "Siblings"));
  }
  
  public boolean getSiblings() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "Siblings")).get();
  }
  
  public void setSiblings(final boolean value) {
    this.getSiblingsField().set(value);
  }
  
  public FieldBoolean getParentsInSchoolField() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "ParentsInSchool"));
  }
  
  public boolean getParentsInSchool() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "ParentsInSchool")).get();
  }
  
  public void setParentsInSchool(final boolean value) {
    this.getParentsInSchoolField().set(value);
  }
  
  public FieldBoolean getAnualIncomeField() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "AnualIncome"));
  }
  
  public boolean getAnualIncome() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "AnualIncome")).get();
  }
  
  public void setAnualIncome(final boolean value) {
    this.getAnualIncomeField().set(value);
  }
  
  public FieldBoolean getHandicapedField() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "Handicaped"));
  }
  
  public boolean getHandicaped() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "Handicaped")).get();
  }
  
  public void setHandicaped(final boolean value) {
    this.getHandicapedField().set(value);
  }
  
  public FieldBoolean getMonoParentalorNumberusFamilyField() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "MonoParentalorNumberusFamily"));
  }
  
  public boolean getMonoParentalorNumberusFamily() {
    return ((org.monet.bpi.FieldBoolean)this.getField("CanteenApplication", "MonoParentalorNumberusFamily")).get();
  }
  
  public void setMonoParentalorNumberusFamily(final boolean value) {
    this.getMonoParentalorNumberusFamilyField().set(value);
  }
}
