package solicitud.admiteddoc;

import java.util.ArrayList;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import solicitud.admiteddoc.schema.Entry;

@Root(name = "schema", strict = false)
@SuppressWarnings("all")
public class Schema implements org.monet.bpi.Schema {
  @ElementList(name = "entry", required = false)
  private ArrayList<Entry> entry = new java.util.ArrayList<solicitud.admiteddoc.schema.Entry>();
  
  public ArrayList<Entry> getEntry() {
    return this.entry;
  }
  
  public void setEntry(final ArrayList<Entry> entry) {
    this.entry = entry;
  }
}
