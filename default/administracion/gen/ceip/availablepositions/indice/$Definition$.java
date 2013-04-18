package ceip.availablepositions.indice;

import ceip.availablepositions.indice.AnyoProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imljgmza";
    this._name = "ceip.AvailablePositions.Indice";
    this._isAbstract = null;this._label = "Plazas disponibles";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Anyo);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty3.setCode("impewela");
    indexViewProperty3.setName("Item");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty3.getLine().add(new org.monet.metamodel.internal.Ref("Anyo","ceip.AvailablePositions.Indice","ceip.AvailablePositions.Indice.Anyo"));
    indexViewProperty3.setShow(showProperty3);
    this.addView(indexViewProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.availablepositions.indice.$Definition$.class,"ceip.AvailablePositions.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.availablepositions.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imljgmza = new Object();imljgmza.refresh = function (node) {if (!node.isEditable()) return;};imljgmza.onChangeField = function (node, field) {};";
  }
  
  private final AnyoProperty Anyo = new ceip.availablepositions.indice.AnyoProperty();
}
