package doc.absences.indice;

import doc.absences.indice.DateProperty;
import doc.absences.indice.StudentProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mvxudpa";
    this._name = "doc.Absences.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Date);
    referenceProperty1.addAttributeProperty(Student);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty4.setCode("mvrvxdw");
    indexViewProperty4.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty4.setTitle(new org.monet.metamodel.internal.Ref("Student","doc.Absences.Indice","doc.Absences.Indice.Student"));
    showProperty4.getLine().add(new org.monet.metamodel.internal.Ref("Date","doc.Absences.Indice","doc.Absences.Indice.Date"));
    indexViewProperty4.setShow(showProperty4);
    this.addView(indexViewProperty4);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.absences.indice.$Definition$.class,"doc.Absences.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.absences.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var mvxudpa = new Object();mvxudpa.refresh = function (node) {if (!node.isEditable()) return;};mvxudpa.onChangeField = function (node, field) {};";
  }
  
  private final DateProperty Date = new doc.absences.indice.DateProperty();
  
  private final StudentProperty Student = new doc.absences.indice.StudentProperty();
}
