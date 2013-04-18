package direc.schedule.indice;

import direc.schedule.indice.SlotProperty;
import direc.schedule.indice.TeacherProperty;
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
    referenceProperty1.addAttributeProperty(Slot);
    referenceProperty1.addAttributeProperty(Teacher);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty4.setCode("i");
    indexViewProperty4.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty4.getLine().add(new org.monet.metamodel.internal.Ref("Slot","direc.Schedule.Indice","direc.Schedule.Indice.Slot"));
    showProperty4.getLine().add(new org.monet.metamodel.internal.Ref("Teacher","direc.Schedule.Indice","direc.Schedule.Indice.Teacher"));
    indexViewProperty4.setShow(showProperty4);
    this.addView(indexViewProperty4);
    
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
  
  private final SlotProperty Slot = new direc.schedule.indice.SlotProperty();
  
  private final TeacherProperty Teacher = new direc.schedule.indice.TeacherProperty();
}
