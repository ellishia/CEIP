package ceip.studentdatas.indice;

import ceip.studentdatas.indice.NombreProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "immwwqgq";
    this._name = "ceip.StudentDatas.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Nombre);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty3.setCode("imqwhwng");
    indexViewProperty3.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty3.setTitle(new org.monet.metamodel.internal.Ref("Nombre","ceip.StudentDatas.Indice","ceip.StudentDatas.Indice.Nombre"));
    indexViewProperty3.setShow(showProperty3);
    this.addView(indexViewProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.studentdatas.indice.$Definition$.class,"ceip.StudentDatas.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.studentdatas.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var immwwqgq = new Object();immwwqgq.refresh = function (node) {if (!node.isEditable()) return;};immwwqgq.onChangeField = function (node, field) {};";
  }
  
  private final NombreProperty Nombre = new ceip.studentdatas.indice.NombreProperty();
}
