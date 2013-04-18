package direc.studentdoc;

import direc.studentdoc.schema.Entry;
import java.util.ArrayList;
import org.monet.bpi.types.Date;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "schema", strict = false)
@SuppressWarnings("all")
public class Schema implements org.monet.bpi.Schema {
  @ElementList(name = "entry", required = false)
  private ArrayList<Entry> entry = new java.util.ArrayList<direc.studentdoc.schema.Entry>();
  
  public ArrayList<Entry> getEntry() {
    return this.entry;
  }
  
  public void setEntry(final ArrayList<Entry> entry) {
    this.entry = entry;
  }
  
  @Element(name = "CentroAcademico", required = false)
  private String CentroAcademico;
  
  public String getCentroAcademico() {
    return this.CentroAcademico;
  }
  
  public void setCentroAcademico(final String CentroAcademico) {
    this.CentroAcademico = CentroAcademico;
  }
  
  @Element(name = "AnyoAcademico", required = false)
  private String AnyoAcademico;
  
  public String getAnyoAcademico() {
    return this.AnyoAcademico;
  }
  
  public void setAnyoAcademico(final String AnyoAcademico) {
    this.AnyoAcademico = AnyoAcademico;
  }
  
  @Element(name = "DocumentType", required = false)
  private String DocumentType;
  
  public String getDocumentType() {
    return this.DocumentType;
  }
  
  public void setDocumentType(final String DocumentType) {
    this.DocumentType = DocumentType;
  }
  
  @Element(name = "City", required = false)
  private String City;
  
  public String getCity() {
    return this.City;
  }
  
  public void setCity(final String City) {
    this.City = City;
  }
  
  @Element(name = "Date", required = false)
  private Date Date;
  
  public Date getDate() {
    return this.Date;
  }
  
  public void setDate(final Date Date) {
    this.Date = Date;
  }
}
