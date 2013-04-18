package serv.dailyrecords;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Date = new org.monet.bpi.Param("imkufqig");
  
  public Date getDate() {
    return (org.monet.bpi.types.Date)this.getAttribute("imkufqig");
  }
  
  public void setDate(final Date Date) {
    this.setAttribute("imkufqig", Date);
  }
  
  public final static Param Busline = new org.monet.bpi.Param("m9bkhmq");
  
  public Link getBusline() {
    return (org.monet.bpi.types.Link)this.getAttribute("m9bkhmq");
  }
  
  public void setBusline(final Link Busline) {
    this.setAttribute("m9bkhmq", Busline);
  }
}
