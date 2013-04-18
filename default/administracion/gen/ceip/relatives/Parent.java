package ceip.relatives;

import org.monet.bpi.FieldBoolean;
import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.java.FieldSectionImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Parent extends FieldSectionImpl implements FieldSection {
  public FieldText getNameField() {
    return ((org.monet.bpi.FieldText)this.getField("Relatives", "Name"));
  }
  
  public String getName() {
    return ((org.monet.bpi.FieldText)this.getField("Relatives", "Name")).get();
  }
  
  public void setName(final String value) {
    this.getNameField().set(value);
  }
  
  public FieldText getSurnameField() {
    return ((org.monet.bpi.FieldText)this.getField("Relatives", "Surname"));
  }
  
  public String getSurname() {
    return ((org.monet.bpi.FieldText)this.getField("Relatives", "Surname")).get();
  }
  
  public void setSurname(final String value) {
    this.getSurnameField().set(value);
  }
  
  public FieldText getSecondSurnameField() {
    return ((org.monet.bpi.FieldText)this.getField("Relatives", "SecondSurname"));
  }
  
  public String getSecondSurname() {
    return ((org.monet.bpi.FieldText)this.getField("Relatives", "SecondSurname")).get();
  }
  
  public void setSecondSurname(final String value) {
    this.getSecondSurnameField().set(value);
  }
  
  public FieldText getDniField() {
    return ((org.monet.bpi.FieldText)this.getField("Relatives", "Dni"));
  }
  
  public String getDni() {
    return ((org.monet.bpi.FieldText)this.getField("Relatives", "Dni")).get();
  }
  
  public void setDni(final String value) {
    this.getDniField().set(value);
  }
  
  public FieldText getProfessionField() {
    return ((org.monet.bpi.FieldText)this.getField("Relatives", "Profession"));
  }
  
  public String getProfession() {
    return ((org.monet.bpi.FieldText)this.getField("Relatives", "Profession")).get();
  }
  
  public void setProfession(final String value) {
    this.getProfessionField().set(value);
  }
  
  public FieldText getTelephoneField() {
    return ((org.monet.bpi.FieldText)this.getField("Relatives", "Telephone"));
  }
  
  public String getTelephone() {
    return ((org.monet.bpi.FieldText)this.getField("Relatives", "Telephone")).get();
  }
  
  public void setTelephone(final String value) {
    this.getTelephoneField().set(value);
  }
  
  public FieldText getEmailField() {
    return ((org.monet.bpi.FieldText)this.getField("Relatives", "Email"));
  }
  
  public String getEmail() {
    return ((org.monet.bpi.FieldText)this.getField("Relatives", "Email")).get();
  }
  
  public void setEmail(final String value) {
    this.getEmailField().set(value);
  }
  
  public FieldBoolean getChild_custodyField() {
    return ((org.monet.bpi.FieldBoolean)this.getField("Relatives", "Child_custody"));
  }
  
  public boolean getChild_custody() {
    return ((org.monet.bpi.FieldBoolean)this.getField("Relatives", "Child_custody")).get();
  }
  
  public void setChild_custody(final boolean value) {
    this.getChild_custodyField().set(value);
  }
  
  public FieldSelect getCivil_stateField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Relatives", "Civil_state"));
  }
  
  public Term getCivil_state() {
    return ((org.monet.bpi.FieldSelect)this.getField("Relatives", "Civil_state")).get();
  }
  
  public void setCivil_state(final Term value) {
    this.getCivil_stateField().set(value);
  }
  
  public FieldSelect getStudies_levelField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Relatives", "Studies_level"));
  }
  
  public Term getStudies_level() {
    return ((org.monet.bpi.FieldSelect)this.getField("Relatives", "Studies_level")).get();
  }
  
  public void setStudies_level(final Term value) {
    this.getStudies_levelField().set(value);
  }
  
  public FieldSelect getWork_situationField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Relatives", "Work_situation"));
  }
  
  public Term getWork_situation() {
    return ((org.monet.bpi.FieldSelect)this.getField("Relatives", "Work_situation")).get();
  }
  
  public void setWork_situation(final Term value) {
    this.getWork_situationField().set(value);
  }
}
