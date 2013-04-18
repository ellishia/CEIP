package doc.incidents.indice;

import doc.incidents.indice.DateProperty;
import doc.incidents.indice.PlaceProperty;
import doc.incidents.indice.StudentProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mibbeww";
    this._name = "doc.Incidents.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Place);
    referenceProperty1.addAttributeProperty(Student);
    referenceProperty1.addAttributeProperty(Date);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty5.setCode("i");
    indexViewProperty5.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty5.setTitle(new org.monet.metamodel.internal.Ref("Student","doc.Incidents.Indice","doc.Incidents.Indice.Student"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Date","doc.Incidents.Indice","doc.Incidents.Indice.Date"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Place","doc.Incidents.Indice","doc.Incidents.Indice.Place"));
    indexViewProperty5.setShow(showProperty5);
    this.addView(indexViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.incidents.indice.$Definition$.class,"doc.Incidents.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.incidents.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var mibbeww = new Object();mibbeww.refresh = function (node) {if (!node.isEditable()) return;};mibbeww.onChangeField = function (node, field) {};";
  }
  
  private final PlaceProperty Place = new doc.incidents.indice.PlaceProperty();
  
  private final StudentProperty Student = new doc.incidents.indice.StudentProperty();
  
  private final DateProperty Date = new doc.incidents.indice.DateProperty();
}
