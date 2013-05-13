package direc.slots.slot;

import direc.slots.slot.DayHourProperty;
import direc.slots.slot.GroupProperty;
import direc.slots.slot.SubjectProperty;
import direc.slots.slot.WeekdayProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "mahec1g";
    this._name = "direc.Slots.Slot";
    this._isAbstract = null;this._label = "Slot";
    this.addSelectFieldProperty(Weekday);
    this.addTextFieldProperty(DayHour);
    this.addSelectFieldProperty(Subject);
    this.addLinkFieldProperty(Group);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty5 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty5.setIndex(new org.monet.metamodel.internal.Ref("direc.Slots.Indice"));
    this.getMappingList().add(mappingProperty5);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty7 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty7);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty9.setLabel("Ficha");
    formViewProperty9.setCode("m1gpaoq");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty10 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("Weekday","direc.Slots.Slot","direc.Slots.Slot.Weekday"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("DayHour","direc.Slots.Slot","direc.Slots.Slot.DayHour"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("Subject","direc.Slots.Slot","direc.Slots.Slot.Subject"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("Group","direc.Slots.Slot","direc.Slots.Slot.Group"));
    formViewProperty9.setShow(showProperty10);
    this.addView(formViewProperty9);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.slots.slot.$Definition$.class,"direc.Slots.Slot",null);
  }
  }
  
  public static String static_getName() {
    return "Slot";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.slots.Slot.class;
  }
  
  public String getClientBehaviour() {
    return "var mahec1g = new Object();mahec1g.refresh = function (node) {if (!node.isEditable()) return;};mahec1g.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return direc.slots.slot.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -532091166:
    return direc.slots.slot.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final WeekdayProperty Weekday = new direc.slots.slot.WeekdayProperty();
  
  private final DayHourProperty DayHour = new direc.slots.slot.DayHourProperty();
  
  private final SubjectProperty Subject = new direc.slots.slot.SubjectProperty();
  
  private final GroupProperty Group = new direc.slots.slot.GroupProperty();
}
