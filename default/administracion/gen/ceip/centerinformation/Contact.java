package ceip.centerinformation;

import java.util.ArrayList;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldNumber;
import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldText;
import org.monet.bpi.java.FieldSectionImpl;

@SuppressWarnings("all")
public class Contact extends FieldSectionImpl implements FieldSection {
  public FieldText getAddressField() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "Address"));
  }
  
  public String getAddress() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "Address")).get();
  }
  
  public void setAddress(final String value) {
    this.getAddressField().set(value);
  }
  
  public FieldNumber getZIPCodeField() {
    return ((org.monet.bpi.FieldNumber)this.getField("CenterInformation", "ZIPCode"));
  }
  
  public org.monet.bpi.types.Number getZIPCode() {
    return ((org.monet.bpi.FieldNumber)this.getField("CenterInformation", "ZIPCode")).get();
  }
  
  public void setZIPCode(final org.monet.bpi.types.Number value) {
    this.getZIPCodeField().set(value);
  }
  
  public void setZIPCode(final double value) {
    this.getZIPCodeField().set(new org.monet.bpi.types.Number(value));
  }
  
  public FieldText getTownField() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "Town"));
  }
  
  public String getTown() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "Town")).get();
  }
  
  public void setTown(final String value) {
    this.getTownField().set(value);
  }
  
  public FieldMultiple<FieldNumber,org.monet.bpi.types.Number> getTelephoneField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldNumber, org.monet.bpi.types.Number>)this.getField("CenterInformation", "Telephone"));
  }
  
  public ArrayList<org.monet.bpi.types.Number> getTelephone() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldNumber, org.monet.bpi.types.Number>)this.getField("CenterInformation", "Telephone")).getAll();
  }
  
  public FieldText getEmailField() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "Email"));
  }
  
  public String getEmail() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "Email")).get();
  }
  
  public void setEmail(final String value) {
    this.getEmailField().set(value);
  }
  
  public FieldText getWebField() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "Web"));
  }
  
  public String getWeb() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "Web")).get();
  }
  
  public void setWeb(final String value) {
    this.getWebField().set(value);
  }
}
