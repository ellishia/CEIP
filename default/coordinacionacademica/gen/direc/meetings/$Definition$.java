package direc.meetings;

import org.monet.metamodel.ContainerDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ContainerDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mo_87bg";
    this._name = "direc.Meetings";
    this._isAbstract = null;this._label = "Reuniones";
    this.setIsSingleton(true);
    org.monet.metamodel.ContainerDefinition.ContainProperty containProperty2 = new org.monet.metamodel.ContainerDefinition.ContainProperty();
    containProperty2.getNode().add(new org.monet.metamodel.internal.Ref("direc.EvaluationSesions"));
    containProperty2.getNode().add(new org.monet.metamodel.internal.Ref("direc.Claustros"));
    containProperty2.getNode().add(new org.monet.metamodel.internal.Ref("direc.ParentsMeetings"));
    this.setContain(containProperty2);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty6 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty6.setLabel("Sesiones de Evaluación");
    viewProperty6.setCode("daf");
    viewProperty6.setIsDefault(true);
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty8 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty8.getComponent().add(new org.monet.metamodel.internal.Ref("View","direc.EvaluationSesions","direc.EvaluationSesions.View"));
    viewProperty6.setShow(showProperty8);
    this.addView(viewProperty6);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty11 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty11.setLabel("Claustros");
    viewProperty11.setCode("mwyqu2g");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty12 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty12.getComponent().add(new org.monet.metamodel.internal.Ref("View","direc.Claustros","direc.Claustros.View"));
    viewProperty11.setShow(showProperty12);
    this.addView(viewProperty11);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty15 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty15.setLabel("Reuniones de Padres");
    viewProperty15.setCode("mctx9kg");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty16 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty16.getComponent().add(new org.monet.metamodel.internal.Ref("View","direc.ParentsMeetings","direc.ParentsMeetings.View"));
    viewProperty15.setShow(showProperty16);
    this.addView(viewProperty15);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.meetings.$Definition$.class,"direc.Meetings",null);
  }
  }
  
  public static String static_getName() {
    return "Meetings";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.Meetings.class;
  }
  
  public String getClientBehaviour() {
    return "var mo_87bg = new Object();mo_87bg.refresh = function (node) {if (!node.isEditable()) return;};mo_87bg.onChangeField = function (node, field) {};";
  }
}
