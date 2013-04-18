package doc.parentvisits.indice;

import doc.parentvisits.indice.DateProperty;
import doc.parentvisits.indice.IdentifierProperty;
import doc.parentvisits.indice.TitleProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mihlypg";
    this._name = "doc.ParentVisits.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Title);
    referenceProperty1.addAttributeProperty(Date);
    referenceProperty1.addAttributeProperty(Identifier);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty5.setCode("msksh3a");
    indexViewProperty5.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty5.setTitle(new org.monet.metamodel.internal.Ref("Title","doc.ParentVisits.Indice","doc.ParentVisits.Indice.Title"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Date","doc.ParentVisits.Indice","doc.ParentVisits.Indice.Date"));
    indexViewProperty5.setShow(showProperty5);
    this.addView(indexViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.parentvisits.indice.$Definition$.class,"doc.ParentVisits.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.parentvisits.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var mihlypg = new Object();mihlypg.refresh = function (node) {if (!node.isEditable()) return;};mihlypg.onChangeField = function (node, field) {};";
  }
  
  private final TitleProperty Title = new doc.parentvisits.indice.TitleProperty();
  
  private final DateProperty Date = new doc.parentvisits.indice.DateProperty();
  
  private final IdentifierProperty Identifier = new doc.parentvisits.indice.IdentifierProperty();
}
