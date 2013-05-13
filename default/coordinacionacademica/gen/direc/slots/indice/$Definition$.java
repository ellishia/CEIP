package direc.slots.indice;

import direc.slots.indice.DayHourProperty;
import direc.slots.indice.GroupProperty;
import direc.slots.indice.WeekdayProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imltz56q";
    this._name = "direc.Slots.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Group);
    referenceProperty1.addAttributeProperty(Weekday);
    referenceProperty1.addAttributeProperty(DayHour);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty5.setCode("mvscjug");
    indexViewProperty5.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty5.setTitle(new org.monet.metamodel.internal.Ref("Group","direc.Slots.Indice","direc.Slots.Indice.Group"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Weekday","direc.Slots.Indice","direc.Slots.Indice.Weekday"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("DayHour","direc.Slots.Indice","direc.Slots.Indice.DayHour"));
    indexViewProperty5.setShow(showProperty5);
    this.addView(indexViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.slots.indice.$Definition$.class,"direc.Slots.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.slots.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imltz56q = new Object();imltz56q.refresh = function (node) {if (!node.isEditable()) return;};imltz56q.onChangeField = function (node, field) {};";
  }
  
  private final GroupProperty Group = new direc.slots.indice.GroupProperty();
  
  private final WeekdayProperty Weekday = new direc.slots.indice.WeekdayProperty();
  
  private final DayHourProperty DayHour = new direc.slots.indice.DayHourProperty();
}
