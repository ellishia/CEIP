package direc.teacherasignations.indice;

import direc.teacherasignations.indice.TeacherProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imz72kgw";
    this._name = "direc.TeacherAsignations.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Teacher);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty3.setCode("mdckyyw");
    indexViewProperty3.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty3.setTitle(new org.monet.metamodel.internal.Ref("Teacher","direc.TeacherAsignations.Indice","direc.TeacherAsignations.Indice.Teacher"));
    indexViewProperty3.setShow(showProperty3);
    this.addView(indexViewProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.teacherasignations.indice.$Definition$.class,"direc.TeacherAsignations.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.teacherasignations.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imz72kgw = new Object();imz72kgw.refresh = function (node) {if (!node.isEditable()) return;};imz72kgw.onChangeField = function (node, field) {};";
  }
  
  private final TeacherProperty Teacher = new direc.teacherasignations.indice.TeacherProperty();
}
