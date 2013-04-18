package direc.students.index;

import direc.students.index.CialProperty;
import direc.students.index.LevelProperty;
import direc.students.index.NameProperty;
import direc.students.index.SurnameProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imphcdia";
    this._name = "direc.Students.Index";
    this._isAbstract = null;this._label = "Alumnos/as";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Name);
    referenceProperty1.addAttributeProperty(Surname);
    referenceProperty1.addAttributeProperty(Cial);
    referenceProperty1.addAttributeProperty(Level);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty6.setCode("mtv3aaw");
    indexViewProperty6.setName("Item");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Name","direc.Students.Index","direc.Students.Index.Name"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Surname","direc.Students.Index","direc.Students.Index.Surname"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Cial","direc.Students.Index","direc.Students.Index.Cial"));
    indexViewProperty6.setShow(showProperty6);
    this.addView(indexViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.students.index.$Definition$.class,"direc.Students.Index",null);
  }
  }
  
  public static String static_getName() {
    return "Index";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.students.Index.class;
  }
  
  public String getClientBehaviour() {
    return "var imphcdia = new Object();imphcdia.refresh = function (node) {if (!node.isEditable()) return;};imphcdia.onChangeField = function (node, field) {};";
  }
  
  private final NameProperty Name = new direc.students.index.NameProperty();
  
  private final SurnameProperty Surname = new direc.students.index.SurnameProperty();
  
  private final CialProperty Cial = new direc.students.index.CialProperty();
  
  private final LevelProperty Level = new direc.students.index.LevelProperty();
}
