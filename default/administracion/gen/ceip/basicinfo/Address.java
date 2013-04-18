package ceip.basicinfo;

import org.monet.bpi.FieldNumber;
import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldText;
import org.monet.bpi.java.FieldSectionImpl;

@SuppressWarnings("all")
public class Address extends FieldSectionImpl implements FieldSection {
  public FieldText getDesignationField() {
    return ((org.monet.bpi.FieldText)this.getField("BasicInfo", "Designation"));
  }
  
  public String getDesignation() {
    return ((org.monet.bpi.FieldText)this.getField("BasicInfo", "Designation")).get();
  }
  
  public void setDesignation(final String value) {
    this.getDesignationField().set(value);
  }
  
  public FieldText getStreetNameField() {
    return ((org.monet.bpi.FieldText)this.getField("BasicInfo", "StreetName"));
  }
  
  public String getStreetName() {
    return ((org.monet.bpi.FieldText)this.getField("BasicInfo", "StreetName")).get();
  }
  
  public void setStreetName(final String value) {
    this.getStreetNameField().set(value);
  }
  
  public FieldNumber getNumberField() {
    return ((org.monet.bpi.FieldNumber)this.getField("BasicInfo", "Number"));
  }
  
  public org.monet.bpi.types.Number getNumber() {
    return ((org.monet.bpi.FieldNumber)this.getField("BasicInfo", "Number")).get();
  }
  
  public void setNumber(final org.monet.bpi.types.Number value) {
    this.getNumberField().set(value);
  }
  
  public void setNumber(final double value) {
    this.getNumberField().set(new org.monet.bpi.types.Number(value));
  }
  
  public FieldNumber getAppartamentField() {
    return ((org.monet.bpi.FieldNumber)this.getField("BasicInfo", "Appartament"));
  }
  
  public org.monet.bpi.types.Number getAppartament() {
    return ((org.monet.bpi.FieldNumber)this.getField("BasicInfo", "Appartament")).get();
  }
  
  public void setAppartament(final org.monet.bpi.types.Number value) {
    this.getAppartamentField().set(value);
  }
  
  public void setAppartament(final double value) {
    this.getAppartamentField().set(new org.monet.bpi.types.Number(value));
  }
  
  public FieldText getNeigbourhoodField() {
    return ((org.monet.bpi.FieldText)this.getField("BasicInfo", "Neigbourhood"));
  }
  
  public String getNeigbourhood() {
    return ((org.monet.bpi.FieldText)this.getField("BasicInfo", "Neigbourhood")).get();
  }
  
  public void setNeigbourhood(final String value) {
    this.getNeigbourhoodField().set(value);
  }
  
  public FieldText getCityField() {
    return ((org.monet.bpi.FieldText)this.getField("BasicInfo", "City"));
  }
  
  public String getCity() {
    return ((org.monet.bpi.FieldText)this.getField("BasicInfo", "City")).get();
  }
  
  public void setCity(final String value) {
    this.getCityField().set(value);
  }
  
  public FieldNumber getZipCodeField() {
    return ((org.monet.bpi.FieldNumber)this.getField("BasicInfo", "ZipCode"));
  }
  
  public org.monet.bpi.types.Number getZipCode() {
    return ((org.monet.bpi.FieldNumber)this.getField("BasicInfo", "ZipCode")).get();
  }
  
  public void setZipCode(final org.monet.bpi.types.Number value) {
    this.getZipCodeField().set(value);
  }
  
  public void setZipCode(final double value) {
    this.getZipCodeField().set(new org.monet.bpi.types.Number(value));
  }
}
