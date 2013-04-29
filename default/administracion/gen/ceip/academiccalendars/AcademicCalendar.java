package ceip.academiccalendars;

import ceip.academiccalendars.Index;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class AcademicCalendar extends NodeFormImpl {
  public Index getIndex() {
    return (ceip.academiccalendars.Index)this.getIndexEntry("ceip.AcademicCalendars.Index");
  }
  
  public FieldSelect getAcademicYearField() {
    return ((org.monet.bpi.FieldSelect)this.getField("AcademicCalendar", "AcademicYear"));
  }
  
  public Term getAcademicYear() {
    return ((org.monet.bpi.FieldSelect)this.getField("AcademicCalendar", "AcademicYear")).get();
  }
  
  public void setAcademicYear(final Term value) {
    this.getAcademicYearField().set(value);
  }
  
  public FieldMultiple<FieldSection,Void> getEventField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSection, java.lang.Void>)this.getField("AcademicCalendar", "Event"));
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static AcademicCalendar createNew(final Node parent) {
    return (ceip.academiccalendars.AcademicCalendar)org.monet.bpi.NodeService.create(ceip.academiccalendars.AcademicCalendar.class, parent);
  }
}
