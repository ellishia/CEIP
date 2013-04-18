package serv.userstransport;

import org.monet.bpi.Param;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Indice extends serv.users.Indice {
  public final static Param Bus = new org.monet.bpi.Param("mnjokeq");
  
  public Link getBus() {
    return (org.monet.bpi.types.Link)this.getAttribute("mnjokeq");
  }
  
  public void setBus(final Link Bus) {
    this.setAttribute("mnjokeq", Bus);
  }
  
  public final static Param Stop = new org.monet.bpi.Param("maf5pfq");
  
  public Term getStop() {
    return (org.monet.bpi.types.Term)this.getAttribute("maf5pfq");
  }
  
  public void setStop(final Term Stop) {
    this.setAttribute("maf5pfq", Stop);
  }
}
