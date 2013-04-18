package direc.evaluationdoc;

import direc.evaluationdoc.schema.Docente;
import java.util.ArrayList;
import org.monet.bpi.types.Date;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "schema", strict = false)
@SuppressWarnings("all")
public class Schema extends direc.documentocentro.Schema {
  @ElementList(name = "docente", required = false)
  private ArrayList<Docente> docente = new java.util.ArrayList<direc.evaluationdoc.schema.Docente>();
  
  public ArrayList<Docente> getDocente() {
    return this.docente;
  }
  
  public void setDocente(final ArrayList<Docente> docente) {
    this.docente = docente;
  }
  
  @Element(name = "Group", required = false)
  private String Group;
  
  public String getGroup() {
    return this.Group;
  }
  
  public void setGroup(final String Group) {
    this.Group = Group;
  }
  
  @Element(name = "Trimestre", required = false)
  private String Trimestre;
  
  public String getTrimestre() {
    return this.Trimestre;
  }
  
  public void setTrimestre(final String Trimestre) {
    this.Trimestre = Trimestre;
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
}
