package ceip.studentsdoc;

import ceip.studentsdoc.schema.Entry;
import java.util.ArrayList;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "schema", strict = false)
@SuppressWarnings("all")
public class Schema extends ceip.academicrecords.Schema {
  @ElementList(name = "entry", required = false)
  private ArrayList<Entry> entry = new java.util.ArrayList<ceip.studentsdoc.schema.Entry>();
  
  public ArrayList<Entry> getEntry() {
    return this.entry;
  }
  
  public void setEntry(final ArrayList<Entry> entry) {
    this.entry = entry;
  }
}
