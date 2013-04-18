package ceip.academiccalendars.academiccalendar;

import ceip.academiccalendars.academiccalendar.event.DescriptionProperty;
import ceip.academiccalendars.academiccalendar.event.FinalDateProperty;
import ceip.academiccalendars.academiccalendar.event.InitialDateProperty;
import ceip.academiccalendars.academiccalendar.event.NameProperty;
import ceip.academiccalendars.academiccalendar.event.TasksProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

@SuppressWarnings("all")
public class EventProperty extends SectionFieldProperty implements HasBehaviour {
  public EventProperty() {
    super();this._code = "mkozuwg";
    this._name = "Event";
    this._label = "Periodo";
    this.setIsMultiple(true);
    this.addTextFieldProperty(Name);
    this.addTextFieldProperty(Description);
    this.addTextFieldProperty(Tasks);
    this.addDateFieldProperty(InitialDate);
    this.addDateFieldProperty(FinalDate);
    org.monet.metamodel.SectionFieldProperty.ViewProperty viewProperty7 = new org.monet.metamodel.SectionFieldProperty.ViewProperty();
    viewProperty7.setMode(org.monet.metamodel.SectionFieldPropertyBase.ViewProperty.ModeEnumeration.COMPACT);
    org.monet.metamodel.SectionFieldProperty.ViewProperty.SummaryProperty summaryProperty8 = new org.monet.metamodel.SectionFieldProperty.ViewProperty.SummaryProperty();
    summaryProperty8.getField().add(new org.monet.metamodel.internal.Ref("Name","ceip.AcademicCalendars.AcademicCalendar","ceip.AcademicCalendars.AcademicCalendar.Event.Name"));
    summaryProperty8.getField().add(new org.monet.metamodel.internal.Ref("InitialDate","ceip.AcademicCalendars.AcademicCalendar","ceip.AcademicCalendars.AcademicCalendar.Event.InitialDate"));
    summaryProperty8.getField().add(new org.monet.metamodel.internal.Ref("FinalDate","ceip.AcademicCalendars.AcademicCalendar","ceip.AcademicCalendars.AcademicCalendar.Event.FinalDate"));
    viewProperty7.setSummary(summaryProperty8);
    org.monet.metamodel.SectionFieldProperty.ViewProperty.ShowProperty showProperty12 = new org.monet.metamodel.SectionFieldProperty.ViewProperty.ShowProperty();
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Name","ceip.AcademicCalendars.AcademicCalendar","ceip.AcademicCalendars.AcademicCalendar.Event.Name"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Description","ceip.AcademicCalendars.AcademicCalendar","ceip.AcademicCalendars.AcademicCalendar.Event.Description"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("InitialDate","ceip.AcademicCalendars.AcademicCalendar","ceip.AcademicCalendars.AcademicCalendar.Event.InitialDate"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("FinalDate","ceip.AcademicCalendars.AcademicCalendar","ceip.AcademicCalendars.AcademicCalendar.Event.FinalDate"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Tasks","ceip.AcademicCalendars.AcademicCalendar","ceip.AcademicCalendars.AcademicCalendar.Event.Tasks"));
    viewProperty7.setShow(showProperty12);
    this.setView(viewProperty7);
    
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.academiccalendars.academiccalendar.Event.class;
  }
  
  public static String static_getName() {
    return "Event";
  }
  
  private final NameProperty Name = new ceip.academiccalendars.academiccalendar.event.NameProperty();
  
  private final DescriptionProperty Description = new ceip.academiccalendars.academiccalendar.event.DescriptionProperty();
  
  private final TasksProperty Tasks = new ceip.academiccalendars.academiccalendar.event.TasksProperty();
  
  private final InitialDateProperty InitialDate = new ceip.academiccalendars.academiccalendar.event.InitialDateProperty();
  
  private final FinalDateProperty FinalDate = new ceip.academiccalendars.academiccalendar.event.FinalDateProperty();
}
