package serv.userscanteen;

import org.monet.bpi.Param;

@SuppressWarnings("all")
public class Indice extends serv.users.Indice {
  public final static Param Schedule = new org.monet.bpi.Param("mnjokeq");
  
  public String getSchedule() {
    return (java.lang.String)this.getAttribute("mnjokeq");
  }
  
  public void setSchedule(final String Schedule) {
    this.setAttribute("mnjokeq", Schedule);
  }
}
