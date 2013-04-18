package ceip.students;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mphcdia";
    this._name = "ceip.Students";
    this._isAbstract = null;this._label = "Alumnado";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("ceip.Students.Index");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("ceip.Student"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.OperationProperty operationProperty5 = new org.monet.metamodel.CollectionDefinition.OperationProperty();
    operationProperty5.setLabel("Publicar listado de alumnos/as");
    operationProperty5.setCode("morgpxw");
    operationProperty5.setName("OperacionTramitar");
    this.addOperation(operationProperty5);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty8 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty8.setLabel("Todos");
    setViewProperty8.setCode("mnisrwg");
    setViewProperty8.setIsDefault(true);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty10.setSortBy(new org.monet.metamodel.internal.Ref("Name","ceip.Students.Index","ceip.Students.Index.Name"));
    indexProperty10.setWithView(new org.monet.metamodel.internal.Ref("Item","ceip.Students.Index","ceip.Students.Index.Item"));
    showProperty10.setIndex(indexProperty10);
    setViewProperty8.setShow(showProperty10);
    this.addView(setViewProperty8);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.students.$Definition$.class,"ceip.Students",null);
  }
  }
  
  public static String static_getName() {
    return "Students";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.Students.class;
  }
  
  public String getClientBehaviour() {
    return "var mphcdia = new Object();mphcdia.refresh = function (node) {if (!node.isEditable()) return;};mphcdia.onChangeField = function (node, field) {};";
  }
}
