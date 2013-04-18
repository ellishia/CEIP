package doc.subjects.indice;

import doc.subjects.indice.IdentifierProperty;
import doc.subjects.indice.NameProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mqrvk7w";
    this._name = "doc.Subjects.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Name);
    referenceProperty1.addAttributeProperty(Identifier);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty4.setCode("mjeaxwq");
    indexViewProperty4.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty4.setTitle(new org.monet.metamodel.internal.Ref("Name","doc.Subjects.Indice","doc.Subjects.Indice.Name"));
    indexViewProperty4.setShow(showProperty4);
    this.addView(indexViewProperty4);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.subjects.indice.$Definition$.class,"doc.Subjects.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.subjects.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var mqrvk7w = new Object();mqrvk7w.refresh = function (node) {if (!node.isEditable()) return;};mqrvk7w.onChangeField = function (node, field) {};";
  }
  
  private final NameProperty Name = new doc.subjects.indice.NameProperty();
  
  private final IdentifierProperty Identifier = new doc.subjects.indice.IdentifierProperty();
}
