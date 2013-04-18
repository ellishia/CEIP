package ceip.relatives;

import org.monet.bpi.FieldNumber;
import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.java.FieldSectionImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class AuthorizedRelatives extends FieldSectionImpl implements FieldSection {
  public FieldNumber getOrderField() {
    return ((org.monet.bpi.FieldNumber)this.getField("Relatives", "Order"));
  }
  
  public org.monet.bpi.types.Number getOrder() {
    return ((org.monet.bpi.FieldNumber)this.getField("Relatives", "Order")).get();
  }
  
  public void setOrder(final org.monet.bpi.types.Number value) {
    this.getOrderField().set(value);
  }
  
  public void setOrder(final double value) {
    this.getOrderField().set(new org.monet.bpi.types.Number(value));
  }
  
  public FieldNumber getTelephoneNumberField() {
    return ((org.monet.bpi.FieldNumber)this.getField("Relatives", "TelephoneNumber"));
  }
  
  public org.monet.bpi.types.Number getTelephoneNumber() {
    return ((org.monet.bpi.FieldNumber)this.getField("Relatives", "TelephoneNumber")).get();
  }
  
  public void setTelephoneNumber(final org.monet.bpi.types.Number value) {
    this.getTelephoneNumberField().set(value);
  }
  
  public void setTelephoneNumber(final double value) {
    this.getTelephoneNumberField().set(new org.monet.bpi.types.Number(value));
  }
  
  public FieldSelect getTypeField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Relatives", "Type"));
  }
  
  public Term getType() {
    return ((org.monet.bpi.FieldSelect)this.getField("Relatives", "Type")).get();
  }
  
  public void setType(final Term value) {
    this.getTypeField().set(value);
  }
  
  public FieldSelect getRelationField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Relatives", "Relation"));
  }
  
  public Term getRelation() {
    return ((org.monet.bpi.FieldSelect)this.getField("Relatives", "Relation")).get();
  }
  
  public void setRelation(final Term value) {
    this.getRelationField().set(value);
  }
}
