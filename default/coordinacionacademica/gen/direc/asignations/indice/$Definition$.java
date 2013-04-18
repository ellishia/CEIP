package direc.asignations.indice;

import direc.asignations.indice.AcademicYearProperty;
import direc.asignations.indice.StudentProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mofshbw";
    this._name = "direc.Asignations.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(AcademicYear);
    referenceProperty1.addAttributeProperty(Student);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty4.setCode("i");
    indexViewProperty4.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty4.setTitle(new org.monet.metamodel.internal.Ref("AcademicYear","direc.Asignations.Indice","direc.Asignations.Indice.AcademicYear"));
    indexViewProperty4.setShow(showProperty4);
    this.addView(indexViewProperty4);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.asignations.indice.$Definition$.class,"direc.Asignations.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.asignations.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var mofshbw = new Object();mofshbw.refresh = function (node) {if (!node.isEditable()) return;};mofshbw.onChangeField = function (node, field) {};";
  }
  
  private final AcademicYearProperty AcademicYear = new direc.asignations.indice.AcademicYearProperty();
  
  private final StudentProperty Student = new direc.asignations.indice.StudentProperty();
}
