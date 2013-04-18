package direc.anualschedule;

import org.monet.metamodel.ContainerDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ContainerDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m91_yua";
    this._name = "direc.AnualSchedule";
    this._isAbstract = null;this._label = "Horario";
    org.monet.metamodel.ContainerDefinition.ContainProperty containProperty1 = new org.monet.metamodel.ContainerDefinition.ContainProperty();
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("direc.Schedule"));
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("direc.ScheduleYear"));
    this.setContain(containProperty1);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty4 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty4.setLabel("Horario de Curso Académico");
    viewProperty4.setCode("m9esc_w");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty5.getComponent().add(new org.monet.metamodel.internal.Ref("View","direc.Schedule","direc.Schedule.View"));
    showProperty5.getComponent().add(new org.monet.metamodel.internal.Ref("View","direc.ScheduleYear","direc.ScheduleYear.View"));
    viewProperty4.setShow(showProperty5);
    this.addView(viewProperty4);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.anualschedule.$Definition$.class,"direc.AnualSchedule",null);
  }
  }
  
  public static String static_getName() {
    return "AnualSchedule";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.AnualSchedule.class;
  }
  
  public String getClientBehaviour() {
    return "var m91_yua = new Object();m91_yua.refresh = function (node) {if (!node.isEditable()) return;};m91_yua.onChangeField = function (node, field) {};";
  }
}
