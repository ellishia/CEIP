package direc.schedule.scheduleslot;

import direc.schedule.scheduleslot.SlotProperty;
import direc.schedule.scheduleslot.TeacherProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "m4cam2w";
    this._name = "direc.Schedule.ScheduleSlot";
    this._isAbstract = null;this._label = "Casilla de Horario";
    this.addLinkFieldProperty(Slot);
    this.addLinkFieldProperty(Teacher);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty3 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty3.setIndex(new org.monet.metamodel.internal.Ref("direc.Schedule.Indice"));
    this.getMappingList().add(mappingProperty3);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty6.setLabel("Ficha");
    formViewProperty6.setCode("mch8_1w");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Slot","direc.Schedule.ScheduleSlot","direc.Schedule.ScheduleSlot.Slot"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Teacher","direc.Schedule.ScheduleSlot","direc.Schedule.ScheduleSlot.Teacher"));
    formViewProperty6.setShow(showProperty7);
    this.addView(formViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.schedule.scheduleslot.$Definition$.class,"direc.Schedule.ScheduleSlot",null);
  }
  }
  
  public static String static_getName() {
    return "ScheduleSlot";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.schedule.ScheduleSlot.class;
  }
  
  public String getClientBehaviour() {
    return "var m4cam2w = new Object();m4cam2w.refresh = function (node) {if (!node.isEditable()) return;};m4cam2w.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 986491420:
    return direc.schedule.scheduleslot.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final SlotProperty Slot = new direc.schedule.scheduleslot.SlotProperty();
  
  private final TeacherProperty Teacher = new direc.schedule.scheduleslot.TeacherProperty();
}
