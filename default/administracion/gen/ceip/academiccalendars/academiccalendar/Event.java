package ceip.academiccalendars.academiccalendar;

import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldText;
import org.monet.bpi.java.FieldSectionImpl;
import org.monet.bpi.types.Date;

@SuppressWarnings("all")
public class Event extends FieldSectionImpl implements FieldSection {
  public FieldText getNameField() {
    return ((org.monet.bpi.FieldText)this.getField("AcademicCalendar", "Name"));
  }
  
  public String getName() {
    return ((org.monet.bpi.FieldText)this.getField("AcademicCalendar", "Name")).get();
  }
  
  public void setName(final String value) {
    this.getNameField().set(value);
  }
  
  public FieldText getDescriptionField() {
    return ((org.monet.bpi.FieldText)this.getField("AcademicCalendar", "Description"));
  }
  
  public String getDescription() {
    return ((org.monet.bpi.FieldText)this.getField("AcademicCalendar", "Description")).get();
  }
  
  public void setDescription(final String value) {
    this.getDescriptionField().set(value);
  }
  
  public FieldText getTasksField() {
    return ((org.monet.bpi.FieldText)this.getField("AcademicCalendar", "Tasks"));
  }
  
  public String getTasks() {
    return ((org.monet.bpi.FieldText)this.getField("AcademicCalendar", "Tasks")).get();
  }
  
  public void setTasks(final String value) {
    this.getTasksField().set(value);
  }
  
  public FieldDate getInitialDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("AcademicCalendar", "InitialDate"));
  }
  
  public Date getInitialDate() {
    return ((org.monet.bpi.FieldDate)this.getField("AcademicCalendar", "InitialDate")).get();
  }
  
  public void setInitialDate(final Date value) {
    this.getInitialDateField().set(value);
  }
  
  public FieldDate getFinalDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("AcademicCalendar", "FinalDate"));
  }
  
  public Date getFinalDate() {
    return ((org.monet.bpi.FieldDate)this.getField("AcademicCalendar", "FinalDate")).get();
  }
  
  public void setFinalDate(final Date value) {
    this.getFinalDateField().set(value);
  }
}
