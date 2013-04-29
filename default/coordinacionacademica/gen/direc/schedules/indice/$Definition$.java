package direc.schedules.indice;

import direc.schedules.indice.AcademicYearProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imvvan9w";
    this._name = "direc.Schedules.Indice";
    this._isAbstract = null;this._label = "Horarios";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(AcademicYear);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty3.setCode("mwml0sa");
    indexViewProperty3.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty3.getLine().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.Schedules.Indice","direc.Schedules.Indice.AcademicYear"));
    indexViewProperty3.setShow(showProperty3);
    this.addView(indexViewProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.schedules.indice.$Definition$.class,"direc.Schedules.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.schedules.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imvvan9w = new Object();imvvan9w.refresh = function (node) {if (!node.isEditable()) return;};imvvan9w.onChangeField = function (node, field) {};";
  }
  
  private final AcademicYearProperty AcademicYear = new direc.schedules.indice.AcademicYearProperty();
}
