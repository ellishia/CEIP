package direc.students;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mphcdia";
    this._name = "direc.Students";
    this._isAbstract = null;this._label = "Alumnos/as";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("direc.Students.Index");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("direc.Students.Student"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Todos");
    setViewProperty5.setCode("mlex9sw");
    setViewProperty5.setIsDefault(true);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Surname","direc.Students.Index","direc.Students.Index.Surname"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Item","direc.Students.Index","direc.Students.Index.Item"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty5.setShow(showProperty7);
    this.addView(setViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.students.$Definition$.class,"direc.Students",null);
  }
  }
  
  public static String static_getName() {
    return "Students";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.Students.class;
  }
  
  public String getClientBehaviour() {
    return "var mphcdia = new Object();mphcdia.refresh = function (node) {if (!node.isEditable()) return;};mphcdia.onChangeField = function (node, field) {};";
  }
}
