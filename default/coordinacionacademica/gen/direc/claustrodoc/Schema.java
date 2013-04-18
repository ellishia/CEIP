package direc.claustrodoc;

import direc.claustrodoc.schema.Docente;
import java.util.ArrayList;
import org.monet.bpi.types.Date;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "schema", strict = false)
@SuppressWarnings("all")
public class Schema extends direc.documentocentro.Schema {
  @ElementList(name = "docente", required = false)
  private ArrayList<Docente> docente = new java.util.ArrayList<direc.claustrodoc.schema.Docente>();
  
  public ArrayList<Docente> getDocente() {
    return this.docente;
  }
  
  public void setDocente(final ArrayList<Docente> docente) {
    this.docente = docente;
  }
  
  @Element(name = "DateMeeting", required = false)
  private Date DateMeeting;
  
  public Date getDateMeeting() {
    return this.DateMeeting;
  }
  
  public void setDateMeeting(final Date DateMeeting) {
    this.DateMeeting = DateMeeting;
  }
  
  @Element(name = "Hour", required = false)
  private String Hour;
  
  public String getHour() {
    return this.Hour;
  }
  
  public void setHour(final String Hour) {
    this.Hour = Hour;
  }
  
  @Element(name = "Room", required = false)
  private String Room;
  
  public String getRoom() {
    return this.Room;
  }
  
  public void setRoom(final String Room) {
    this.Room = Room;
  }
  
  @Element(name = "Order", required = false)
  private String Order;
  
  public String getOrder() {
    return this.Order;
  }
  
  public void setOrder(final String Order) {
    this.Order = Order;
  }
}
