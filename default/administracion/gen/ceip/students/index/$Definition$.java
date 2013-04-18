package ceip.students.index;

import ceip.students.index.CialProperty;
import ceip.students.index.NameProperty;
import ceip.students.index.SurnameProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m8vwv4a";
    this._name = "ceip.Students.Index";
    this._isAbstract = null;this._label = "Alumnos/as";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Name);
    referenceProperty1.addAttributeProperty(Surname);
    referenceProperty1.addAttributeProperty(Cial);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty5.setCode("mtv3aaw");
    indexViewProperty5.setName("Item");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Name","ceip.Students.Index","ceip.Students.Index.Name"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Surname","ceip.Students.Index","ceip.Students.Index.Surname"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Cial","ceip.Students.Index","ceip.Students.Index.Cial"));
    indexViewProperty5.setShow(showProperty5);
    this.addView(indexViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.students.index.$Definition$.class,"ceip.Students.Index",null);
  }
  }
  
  public static String static_getName() {
    return "Index";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.students.Index.class;
  }
  
  public String getClientBehaviour() {
    return "var m8vwv4a = new Object();m8vwv4a.refresh = function (node) {if (!node.isEditable()) return;};m8vwv4a.onChangeField = function (node, field) {};";
  }
  
  private final NameProperty Name = new ceip.students.index.NameProperty();
  
  private final SurnameProperty Surname = new ceip.students.index.SurnameProperty();
  
  private final CialProperty Cial = new ceip.students.index.CialProperty();
}
