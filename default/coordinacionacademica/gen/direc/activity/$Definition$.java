package direc.activity;

import org.monet.metamodel.ContainerDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ContainerDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mxj_qgg";
    this._name = "direc.Activity";
    this._isAbstract = null;this._label = "Actividad Extraescolar";
    org.monet.metamodel.ContainerDefinition.ContainProperty containProperty1 = new org.monet.metamodel.ContainerDefinition.ContainProperty();
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("direc.ActivityFile"));
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("direc.ActivityGroups"));
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("direc.ActivityTeachers"));
    this.setContain(containProperty1);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty5 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty5.setLabel("Información de Actividad");
    viewProperty5.setCode("kk");
    viewProperty5.setIsDefault(true);
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty7.getComponent().add(new org.monet.metamodel.internal.Ref("View","direc.ActivityFile","direc.ActivityFile.View"));
    viewProperty5.setShow(showProperty7);
    this.addView(viewProperty5);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty10 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty10.setLabel("Docentes");
    viewProperty10.setCode("mtfexjw");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty11 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty11.getComponent().add(new org.monet.metamodel.internal.Ref("View","direc.ActivityTeachers","direc.ActivityTeachers.View"));
    viewProperty10.setShow(showProperty11);
    this.addView(viewProperty10);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty14 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty14.setLabel("Grupos");
    viewProperty14.setCode("mkzdqva");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty15 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty15.getComponent().add(new org.monet.metamodel.internal.Ref("View","direc.ActivityGroups","direc.ActivityGroups.View"));
    viewProperty14.setShow(showProperty15);
    this.addView(viewProperty14);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.activity.$Definition$.class,"direc.Activity",null);
  }
  }
  
  public static String static_getName() {
    return "Activity";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.Activity.class;
  }
  
  public String getClientBehaviour() {
    return "var mxj_qgg = new Object();mxj_qgg.refresh = function (node) {if (!node.isEditable()) return;};mxj_qgg.onChangeField = function (node, field) {};";
  }
}
