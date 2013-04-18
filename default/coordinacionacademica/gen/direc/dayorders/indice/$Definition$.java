package direc.dayorders.indice;

import direc.dayorders.indice.TitleProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mjso_xg";
    this._name = "direc.DayOrders.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Title);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty3.setCode("m9147qa");
    indexViewProperty3.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty3.setTitle(new org.monet.metamodel.internal.Ref("Title","direc.DayOrders.Indice","direc.DayOrders.Indice.Title"));
    indexViewProperty3.setShow(showProperty3);
    this.addView(indexViewProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.dayorders.indice.$Definition$.class,"direc.DayOrders.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.dayorders.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var mjso_xg = new Object();mjso_xg.refresh = function (node) {if (!node.isEditable()) return;};mjso_xg.onChangeField = function (node, field) {};";
  }
  
  private final TitleProperty Title = new direc.dayorders.indice.TitleProperty();
}
