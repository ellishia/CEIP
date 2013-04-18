package solicitud.applicationinfo;

import org.monet.bpi.FieldNumber;
import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldText;
import org.monet.bpi.java.FieldSectionImpl;

@SuppressWarnings("all")
public class Address extends FieldSectionImpl implements FieldSection {
  public FieldText getDesignationField() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "Designation"));
  }
  
  public String getDesignation() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "Designation")).get();
  }
  
  public void setDesignation(final String value) {
    this.getDesignationField().set(value);
  }
  
  public FieldText getStreet_nameField() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "Street_name"));
  }
  
  public String getStreet_name() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "Street_name")).get();
  }
  
  public void setStreet_name(final String value) {
    this.getStreet_nameField().set(value);
  }
  
  public FieldNumber getNumberField() {
    return ((org.monet.bpi.FieldNumber)this.getField("ApplicationInfo", "Number"));
  }
  
  public org.monet.bpi.types.Number getNumber() {
    return ((org.monet.bpi.FieldNumber)this.getField("ApplicationInfo", "Number")).get();
  }
  
  public void setNumber(final org.monet.bpi.types.Number value) {
    this.getNumberField().set(value);
  }
  
  public void setNumber(final double value) {
    this.getNumberField().set(new org.monet.bpi.types.Number(value));
  }
  
  public FieldText getAppartamentField() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "Appartament"));
  }
  
  public String getAppartament() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "Appartament")).get();
  }
  
  public void setAppartament(final String value) {
    this.getAppartamentField().set(value);
  }
  
  public FieldText getNeigbourhoodField() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "Neigbourhood"));
  }
  
  public String getNeigbourhood() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "Neigbourhood")).get();
  }
  
  public void setNeigbourhood(final String value) {
    this.getNeigbourhoodField().set(value);
  }
  
  public FieldText getCityField() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "City"));
  }
  
  public String getCity() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "City")).get();
  }
  
  public void setCity(final String value) {
    this.getCityField().set(value);
  }
  
  public FieldNumber getZip_codeField() {
    return ((org.monet.bpi.FieldNumber)this.getField("ApplicationInfo", "Zip_code"));
  }
  
  public org.monet.bpi.types.Number getZip_code() {
    return ((org.monet.bpi.FieldNumber)this.getField("ApplicationInfo", "Zip_code")).get();
  }
  
  public void setZip_code(final org.monet.bpi.types.Number value) {
    this.getZip_codeField().set(value);
  }
  
  public void setZip_code(final double value) {
    this.getZip_codeField().set(new org.monet.bpi.types.Number(value));
  }
}
