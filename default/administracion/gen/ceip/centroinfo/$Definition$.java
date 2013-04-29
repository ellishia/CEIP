package ceip.centroinfo;

import org.monet.metamodel.ContainerDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ContainerDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mn6oplg";
    this._name = "ceip.CentroInfo";
    this._isAbstract = null;this._label = "Características del Centro";
    this.setIsSingleton(true);
    org.monet.metamodel.ContainerDefinition.ContainProperty containProperty2 = new org.monet.metamodel.ContainerDefinition.ContainProperty();
    containProperty2.getNode().add(new org.monet.metamodel.internal.Ref("ceip.AvailablePositions"));
    containProperty2.getNode().add(new org.monet.metamodel.internal.Ref("ceip.TotalPositions"));
    containProperty2.getNode().add(new org.monet.metamodel.internal.Ref("ceip.CenterInformation"));
    this.setContain(containProperty2);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty6 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty6.setLabel("Información del Centro");
    viewProperty6.setCode("m72latq");
    viewProperty6.setIsDefault(true);
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty8 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty8.getComponent().add(new org.monet.metamodel.internal.Ref("View","ceip.CenterInformation","ceip.CenterInformation.View"));
    viewProperty6.setShow(showProperty8);
    this.addView(viewProperty6);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty11 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty11.setLabel("Información para matriculación");
    viewProperty11.setCode("mpomrqw");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty12 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty12.getComponent().add(new org.monet.metamodel.internal.Ref("MatDatos","ceip.CenterInformation","ceip.CenterInformation.MatDatos"));
    viewProperty11.setShow(showProperty12);
    this.addView(viewProperty11);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty15 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty15.setLabel("Plazas disponibles");
    viewProperty15.setCode("m549x3q");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty16 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty16.getComponent().add(new org.monet.metamodel.internal.Ref("Vista","ceip.AvailablePositions","ceip.AvailablePositions.Vista"));
    viewProperty15.setShow(showProperty16);
    this.addView(viewProperty15);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty19 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty19.setLabel("Plazas totales");
    viewProperty19.setCode("mg_c7wq");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty20 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty20.getComponent().add(new org.monet.metamodel.internal.Ref("View","ceip.TotalPositions","ceip.TotalPositions.View"));
    viewProperty19.setShow(showProperty20);
    this.addView(viewProperty19);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.centroinfo.$Definition$.class,"ceip.CentroInfo",null);
  }
  }
  
  public static String static_getName() {
    return "CentroInfo";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.CentroInfo.class;
  }
  
  public String getClientBehaviour() {
    return "var mn6oplg = new Object();mn6oplg.refresh = function (node) {if (!node.isEditable()) return;};mn6oplg.onChangeField = function (node, field) {};";
  }
}
