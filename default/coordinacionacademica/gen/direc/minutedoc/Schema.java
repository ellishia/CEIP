package direc.minutedoc;

import direc.minutedoc.schema.Docente;
import java.util.ArrayList;
import org.monet.bpi.types.Date;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "schema", strict = false)
@SuppressWarnings("all")
public class Schema extends direc.documentocentro.Schema {
  @ElementList(name = "docente", required = false)
  private ArrayList<Docente> docente = new java.util.ArrayList<direc.minutedoc.schema.Docente>();
  
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
  
  @Element(name = "Orden", required = false)
  private String Orden;
  
  public String getOrden() {
    return this.Orden;
  }
  
  public void setOrden(final String Orden) {
    this.Orden = Orden;
  }
  
  @Element(name = "Description", required = false)
  private String Description;
  
  public String getDescription() {
    return this.Description;
  }
  
  public void setDescription(final String Description) {
    this.Description = Description;
  }
}
