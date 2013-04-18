package serv.specialmenus.indice;

import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import serv.specialmenus.indice.IdentifierProperty;
import serv.specialmenus.indice.SuitableProperty;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imbeh6vw";
    this._name = "serv.SpecialMenus.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Suitable);
    referenceProperty1.addAttributeProperty(Identifier);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty4.setCode("i");
    indexViewProperty4.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty4.setTitle(new org.monet.metamodel.internal.Ref("Identifier","serv.SpecialMenus.Indice","serv.SpecialMenus.Indice.Identifier"));
    showProperty4.getLine().add(new org.monet.metamodel.internal.Ref("Suitable","serv.SpecialMenus.Indice","serv.SpecialMenus.Indice.Suitable"));
    indexViewProperty4.setShow(showProperty4);
    this.addView(indexViewProperty4);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.specialmenus.indice.$Definition$.class,"serv.SpecialMenus.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.specialmenus.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imbeh6vw = new Object();imbeh6vw.refresh = function (node) {if (!node.isEditable()) return;};imbeh6vw.onChangeField = function (node, field) {};";
  }
  
  private final SuitableProperty Suitable = new serv.specialmenus.indice.SuitableProperty();
  
  private final IdentifierProperty Identifier = new serv.specialmenus.indice.IdentifierProperty();
}
