package serv.buslines.busline;

import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldSection;
import org.monet.bpi.java.FieldSectionImpl;
import org.monet.bpi.types.Date;

@SuppressWarnings("all")
public class Dates extends FieldSectionImpl implements FieldSection {
  public FieldDate getFromField() {
    return ((org.monet.bpi.FieldDate)this.getField("Busline", "From"));
  }
  
  public Date getFrom() {
    return ((org.monet.bpi.FieldDate)this.getField("Busline", "From")).get();
  }
  
  public void setFrom(final Date value) {
    this.getFromField().set(value);
  }
  
  public FieldDate getToField() {
    return ((org.monet.bpi.FieldDate)this.getField("Busline", "To"));
  }
  
  public Date getTo() {
    return ((org.monet.bpi.FieldDate)this.getField("Busline", "To")).get();
  }
  
  public void setTo(final Date value) {
    this.getToField().set(value);
  }
}
