package ceip.historial;

import ceip.historial.schema.Entry;
import java.util.ArrayList;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "schema", strict = false)
@SuppressWarnings("all")
public class Schema extends ceip.academicrecords.Schema {
  @ElementList(name = "entry", required = false)
  private ArrayList<Entry> entry = new java.util.ArrayList<ceip.historial.schema.Entry>();
  
  public ArrayList<Entry> getEntry() {
    return this.entry;
  }
  
  public void setEntry(final ArrayList<Entry> entry) {
    this.entry = entry;
  }
  
  @Element(name = "Adaptacion", required = false)
  private String Adaptacion;
  
  public String getAdaptacion() {
    return this.Adaptacion;
  }
  
  public void setAdaptacion(final String Adaptacion) {
    this.Adaptacion = Adaptacion;
  }
  
  @Element(name = "Observations", required = false)
  private String Observations;
  
  public String getObservations() {
    return this.Observations;
  }
  
  public void setObservations(final String Observations) {
    this.Observations = Observations;
  }
}
