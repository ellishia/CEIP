package ceip.academiccalendars.academiccalendar;

import ceip.academiccalendars.academiccalendar.AcademicYearProperty;
import ceip.academiccalendars.academiccalendar.EventProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "mkeegma";
    this._name = "ceip.AcademicCalendars.AcademicCalendar";
    this._isAbstract = null;this._label = "Calendario Académico";
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty1 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty1);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty3 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty3.setIndex(new org.monet.metamodel.internal.Ref("ceip.AcademicCalendars.Index"));
    this.getMappingList().add(mappingProperty3);
    this.addSelectFieldProperty(AcademicYear);
    this.addSectionFieldProperty(Event);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty7 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty7.setCode("m9yuwuq");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","ceip.AcademicCalendars.AcademicCalendar","ceip.AcademicCalendars.AcademicCalendar.AcademicYear"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Event","ceip.AcademicCalendars.AcademicCalendar","ceip.AcademicCalendars.AcademicCalendar.Event"));
    formViewProperty7.setShow(showProperty7);
    this.addView(formViewProperty7);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.academiccalendars.academiccalendar.$Definition$.class,"ceip.AcademicCalendars.AcademicCalendar",null);
  }
  }
  
  public static String static_getName() {
    return "AcademicCalendar";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.academiccalendars.AcademicCalendar.class;
  }
  
  public String getClientBehaviour() {
    return "var mkeegma = new Object();mkeegma.refresh = function (node) {if (!node.isEditable()) return;};mkeegma.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return ceip.academiccalendars.academiccalendar.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 940189643:
    return ceip.academiccalendars.academiccalendar.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final AcademicYearProperty AcademicYear = new ceip.academiccalendars.academiccalendar.AcademicYearProperty();
  
  private final EventProperty Event = new ceip.academiccalendars.academiccalendar.EventProperty();
}
