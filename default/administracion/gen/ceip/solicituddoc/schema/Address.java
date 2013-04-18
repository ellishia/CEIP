package ceip.solicituddoc.schema;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Address", strict = false)
@SuppressWarnings("all")
public class Address {
  @Element(name = "Designation", required = false)
  private String Designation;
  
  public String getDesignation() {
    return this.Designation;
  }
  
  public void setDesignation(final String Designation) {
    this.Designation = Designation;
  }
  
  @Element(name = "Street_name", required = false)
  private String Street_name;
  
  public String getStreet_name() {
    return this.Street_name;
  }
  
  public void setStreet_name(final String Street_name) {
    this.Street_name = Street_name;
  }
  
  @Element(name = "Number", required = false)
  private org.monet.bpi.types.Number Number;
  
  public org.monet.bpi.types.Number getNumber() {
    return this.Number;
  }
  
  public void setNumber(final org.monet.bpi.types.Number Number) {
    this.Number = Number;
  }
  
  @Element(name = "Appartment", required = false)
  private String Appartment;
  
  public String getAppartment() {
    return this.Appartment;
  }
  
  public void setAppartment(final String Appartment) {
    this.Appartment = Appartment;
  }
  
  @Element(name = "Neigbourhood", required = false)
  private String Neigbourhood;
  
  public String getNeigbourhood() {
    return this.Neigbourhood;
  }
  
  public void setNeigbourhood(final String Neigbourhood) {
    this.Neigbourhood = Neigbourhood;
  }
  
  @Element(name = "City", required = false)
  private String City;
  
  public String getCity() {
    return this.City;
  }
  
  public void setCity(final String City) {
    this.City = City;
  }
  
  @Element(name = "zip_code", required = false)
  private org.monet.bpi.types.Number zip_code;
  
  public org.monet.bpi.types.Number getZip_code() {
    return this.zip_code;
  }
  
  public void setZip_code(final org.monet.bpi.types.Number zip_code) {
    this.zip_code = zip_code;
  }
}
