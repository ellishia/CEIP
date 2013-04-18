package doc.exams.indice;

import doc.exams.indice.NameProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "im86137q";
    this._name = "doc.Exams.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Name);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty3.setCode("i");
    indexViewProperty3.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty3.setTitle(new org.monet.metamodel.internal.Ref("Name","doc.Exams.Indice","doc.Exams.Indice.Name"));
    indexViewProperty3.setShow(showProperty3);
    this.addView(indexViewProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.exams.indice.$Definition$.class,"doc.Exams.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.exams.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var im86137q = new Object();im86137q.refresh = function (node) {if (!node.isEditable()) return;};im86137q.onChangeField = function (node, field) {};";
  }
  
  private final NameProperty Name = new doc.exams.indice.NameProperty();
}
