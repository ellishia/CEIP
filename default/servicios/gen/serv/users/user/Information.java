package serv.users.user;

import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldText;
import org.monet.bpi.java.FieldSectionImpl;

@SuppressWarnings("all")
public class Information extends FieldSectionImpl implements FieldSection {
  public FieldText getNameField() {
    return ((org.monet.bpi.FieldText)this.getField("User", "Name"));
  }
  
  public String getName() {
    return ((org.monet.bpi.FieldText)this.getField("User", "Name")).get();
  }
  
  public void setName(final String value) {
    this.getNameField().set(value);
  }
  
  public FieldText getSurnameField() {
    return ((org.monet.bpi.FieldText)this.getField("User", "Surname"));
  }
  
  public String getSurname() {
    return ((org.monet.bpi.FieldText)this.getField("User", "Surname")).get();
  }
  
  public void setSurname(final String value) {
    this.getSurnameField().set(value);
  }
  
  public FieldText getAgeField() {
    return ((org.monet.bpi.FieldText)this.getField("User", "Age"));
  }
  
  public String getAge() {
    return ((org.monet.bpi.FieldText)this.getField("User", "Age")).get();
  }
  
  public void setAge(final String value) {
    this.getAgeField().set(value);
  }
}
