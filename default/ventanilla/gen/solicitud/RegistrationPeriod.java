package solicitud;

import org.monet.bpi.FieldDate;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;

@SuppressWarnings("all")
public class RegistrationPeriod extends NodeFormImpl {
  public static RegistrationPeriod getInstance() {
    return (solicitud.RegistrationPeriod)org.monet.bpi.NodeService.locate("solicitud.RegistrationPeriod");
  }
  
  public FieldDate getInitialDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("RegistrationPeriod", "InitialDate"));
  }
  
  public Date getInitialDate() {
    return ((org.monet.bpi.FieldDate)this.getField("RegistrationPeriod", "InitialDate")).get();
  }
  
  public void setInitialDate(final Date value) {
    this.getInitialDateField().set(value);
  }
  
  public FieldDate getFinalDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("RegistrationPeriod", "FinalDate"));
  }
  
  public Date getFinalDate() {
    return ((org.monet.bpi.FieldDate)this.getField("RegistrationPeriod", "FinalDate")).get();
  }
  
  public void setFinalDate(final Date value) {
    this.getFinalDateField().set(value);
  }
  
  public void constructor() {
    Date _date = new Date();
    Date date = _date;
    Date _date_1 = new Date();
    Date final_ = _date_1;
    this.setInitialDate(date);
    Date _plusDays = final_.plusDays(5);
    this.setFinalDate(_plusDays);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
}
