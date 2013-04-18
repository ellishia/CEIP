package ceip.filerecord;

import ceip.filerecord.schema.Entry;
import java.util.ArrayList;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "schema", strict = false)
@SuppressWarnings("all")
public class Schema implements org.monet.bpi.Schema {
  @ElementList(name = "entry", required = false)
  private ArrayList<Entry> entry = new java.util.ArrayList<ceip.filerecord.schema.Entry>();
  
  public ArrayList<Entry> getEntry() {
    return this.entry;
  }
  
  public void setEntry(final ArrayList<Entry> entry) {
    this.entry = entry;
  }
  
  @Element(name = "FurtherInfo", required = false)
  private String FurtherInfo;
  
  public String getFurtherInfo() {
    return this.FurtherInfo;
  }
  
  public void setFurtherInfo(final String FurtherInfo) {
    this.FurtherInfo = FurtherInfo;
  }
  
  @Element(name = "SpecificNeeds", required = false)
  private String SpecificNeeds;
  
  public String getSpecificNeeds() {
    return this.SpecificNeeds;
  }
  
  public void setSpecificNeeds(final String SpecificNeeds) {
    this.SpecificNeeds = SpecificNeeds;
  }
  
  @Element(name = "Diversity", required = false)
  private String Diversity;
  
  public String getDiversity() {
    return this.Diversity;
  }
  
  public void setDiversity(final String Diversity) {
    this.Diversity = Diversity;
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
