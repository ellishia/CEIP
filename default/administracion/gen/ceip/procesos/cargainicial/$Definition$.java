package ceip.procesos.cargainicial;

import org.monet.metamodel.ActivityDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ActivityDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mh5pkhg";
    this._name = "ceip.procesos.CargaInicial";
    this._isAbstract = null;this._label = "CargaInicial";
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty1 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty1.setCode("mq_x8va");
    activityPlaceProperty1.setName("Inicial");
    activityPlaceProperty1.setIsInitial(true);
    org.monet.metamodel.EditionActionProperty editionActionProperty2 = new org.monet.metamodel.EditionActionProperty();
    editionActionProperty2.setGoto(new org.monet.metamodel.internal.Ref("Final","ceip.procesos.CargaInicial","ceip.procesos.CargaInicial.Final"));
    editionActionProperty2.setHistory("Se han añadido características del Centro");
    editionActionProperty2.setLabel("Añadir Características de Centro");
    editionActionProperty2.setCode("mxdig8q");
    org.monet.metamodel.EditionActionProperty.UseProperty useProperty5 = new org.monet.metamodel.EditionActionProperty.UseProperty();
    useProperty5.setForm(new org.monet.metamodel.internal.Ref("ceip.CenterInformation"));
    useProperty5.setWithView(new org.monet.metamodel.internal.Ref("View","ceip.CenterInformation","ceip.CenterInformation.View"));
    editionActionProperty2.setUse(useProperty5);
    activityPlaceProperty1.setEditionActionProperty(editionActionProperty2);
    this.addPlace(activityPlaceProperty1);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty12 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty12.setCode("mnqwjiq");
    activityPlaceProperty12.setName("Final");
    activityPlaceProperty12.setIsFinal(true);
    this.addPlace(activityPlaceProperty12);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.procesos.cargainicial.$Definition$.class,"ceip.procesos.CargaInicial",null);
  }
  }
  
  public static String static_getName() {
    return "CargaInicial";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.procesos.CargaInicial.class;
  }
  
  public String getClientBehaviour() {
    return "var mh5pkhg = new Object();mh5pkhg.refresh = function (node) {if (!node.isEditable()) return;};mh5pkhg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSubBehaviorClass(final String name) {
    int hash = name.hashCode();
     switch(hash) {
     default: return null;
    }
  }
}
