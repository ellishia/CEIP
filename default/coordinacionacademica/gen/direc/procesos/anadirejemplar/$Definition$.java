package direc.procesos.anadirejemplar;

import org.monet.metamodel.ActivityDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ActivityDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mftuvmg";
    this._name = "direc.procesos.AnadirEjemplar";
    this._isAbstract = null;this._label = "AnadirEjemplar";
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty1 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty1.setCode("mfdyzbq");
    activityPlaceProperty1.setName("Inicial");
    activityPlaceProperty1.setIsInitial(true);
    org.monet.metamodel.EditionActionProperty editionActionProperty2 = new org.monet.metamodel.EditionActionProperty();
    editionActionProperty2.setGoto(new org.monet.metamodel.internal.Ref("Final","direc.procesos.AnadirEjemplar","direc.procesos.AnadirEjemplar.Final"));
    editionActionProperty2.setHistory("Se han añadido ejemplares");
    editionActionProperty2.setLabel("Añadir Ejemplares");
    editionActionProperty2.setCode("mxdig8q");
    org.monet.metamodel.EditionActionProperty.UseProperty useProperty5 = new org.monet.metamodel.EditionActionProperty.UseProperty();
    useProperty5.setForm(new org.monet.metamodel.internal.Ref("direc.IntanceEjemplar"));
    useProperty5.setWithView(new org.monet.metamodel.internal.Ref("View","direc.IntanceEjemplar","direc.IntanceEjemplar.View"));
    editionActionProperty2.setUse(useProperty5);
    activityPlaceProperty1.setEditionActionProperty(editionActionProperty2);
    this.addPlace(activityPlaceProperty1);
    org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty activityPlaceProperty11 = new org.monet.metamodel.ActivityDefinition.ActivityPlaceProperty();
    activityPlaceProperty11.setCode("mnqwjiq");
    activityPlaceProperty11.setName("Final");
    activityPlaceProperty11.setIsFinal(true);
    this.addPlace(activityPlaceProperty11);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.procesos.anadirejemplar.$Definition$.class,"direc.procesos.AnadirEjemplar",null);
  }
  }
  
  public static String static_getName() {
    return "AnadirEjemplar";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.procesos.AnadirEjemplar.class;
  }
  
  public String getClientBehaviour() {
    return "var mftuvmg = new Object();mftuvmg.refresh = function (node) {if (!node.isEditable()) return;};mftuvmg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSubBehaviorClass(final String name) {
    int hash = name.hashCode();
     switch(hash) {
     default: return null;
    }
  }
}
