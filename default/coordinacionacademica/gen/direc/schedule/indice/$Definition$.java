package direc.schedule.indice;

import direc.schedule.indice.DayHourProperty;
import direc.schedule.indice.GroupProperty;
import direc.schedule.indice.SubjectProperty;
import direc.schedule.indice.TeacherProperty;
import direc.schedule.indice.WeekdayProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mfvxu5w";
    this._name = "direc.Schedule.Indice";
    this._isAbstract = null;this._label = "Horario";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Group);
    referenceProperty1.addAttributeProperty(Weekday);
    referenceProperty1.addAttributeProperty(DayHour);
    referenceProperty1.addAttributeProperty(Subject);
    referenceProperty1.addAttributeProperty(Teacher);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty7 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty7.setCode("mydvvxa");
    indexViewProperty7.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty7.getLine().add(new org.monet.metamodel.internal.Ref("Teacher","direc.Schedule.Indice","direc.Schedule.Indice.Teacher"));
    indexViewProperty7.setShow(showProperty7);
    this.addView(indexViewProperty7);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.schedule.indice.$Definition$.class,"direc.Schedule.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.schedule.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var mfvxu5w = new Object();mfvxu5w.refresh = function (node) {if (!node.isEditable()) return;};mfvxu5w.onChangeField = function (node, field) {};";
  }
  
  private final GroupProperty Group = new direc.schedule.indice.GroupProperty();
  
  private final WeekdayProperty Weekday = new direc.schedule.indice.WeekdayProperty();
  
  private final DayHourProperty DayHour = new direc.schedule.indice.DayHourProperty();
  
  private final SubjectProperty Subject = new direc.schedule.indice.SubjectProperty();
  
  private final TeacherProperty Teacher = new direc.schedule.indice.TeacherProperty();
}
