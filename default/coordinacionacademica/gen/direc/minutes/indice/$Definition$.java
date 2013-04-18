package direc.minutes.indice;

import direc.minutes.indice.TitleProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mdfitea";
    this._name = "direc.Minutes.Indice";
    this._isAbstract = null;this._label = "Sesiones de Evaluación";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Title);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty3.setCode("mozwd2a");
    indexViewProperty3.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty3.setTitle(new org.monet.metamodel.internal.Ref("Title","direc.Minutes.Indice","direc.Minutes.Indice.Title"));
    indexViewProperty3.setShow(showProperty3);
    this.addView(indexViewProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.minutes.indice.$Definition$.class,"direc.Minutes.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.minutes.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var mdfitea = new Object();mdfitea.refresh = function (node) {if (!node.isEditable()) return;};mdfitea.onChangeField = function (node, field) {};";
  }
  
  private final TitleProperty Title = new direc.minutes.indice.TitleProperty();
}
