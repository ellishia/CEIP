package serv.dailyrecords.dailyrecord;

import org.monet.bpi.FieldBoolean;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldSection;
import org.monet.bpi.java.FieldSectionImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Absences extends FieldSectionImpl implements FieldSection {
  public FieldLink getUserField() {
    return ((org.monet.bpi.FieldLink)this.getField("DailyRecord", "User"));
  }
  
  public Link getUser() {
    return ((org.monet.bpi.FieldLink)this.getField("DailyRecord", "User")).get();
  }
  
  public Term getUserAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("DailyRecord", "User")).getAsTerm();
  }
  
  public void setUser(final Link value) {
    this.getUserField().set(value);
  }
  
  public FieldBoolean getAbsentField() {
    return ((org.monet.bpi.FieldBoolean)this.getField("DailyRecord", "Absent"));
  }
  
  public boolean getAbsent() {
    return ((org.monet.bpi.FieldBoolean)this.getField("DailyRecord", "Absent")).get();
  }
  
  public void setAbsent(final boolean value) {
    this.getAbsentField().set(value);
  }
}
