package ceip.academiccalendars.index;

import ceip.academiccalendars.index.AcademicYearProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mee6lya";
    this._name = "ceip.AcademicCalendars.Index";
    this._isAbstract = null;this._label = "item";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(AcademicYear);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty3.setCode("mutz6zg");
    indexViewProperty3.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty3.getLine().add(new org.monet.metamodel.internal.Ref("academicYear","ceip.AcademicCalendars.Index","ceip.AcademicCalendars.Index.academicYear"));
    indexViewProperty3.setShow(showProperty3);
    this.addView(indexViewProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.academiccalendars.index.$Definition$.class,"ceip.AcademicCalendars.Index",null);
  }
  }
  
  public static String static_getName() {
    return "Index";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.academiccalendars.Index.class;
  }
  
  public String getClientBehaviour() {
    return "var mee6lya = new Object();mee6lya.refresh = function (node) {if (!node.isEditable()) return;};mee6lya.onChangeField = function (node, field) {};";
  }
  
  private final AcademicYearProperty AcademicYear = new ceip.academiccalendars.index.AcademicYearProperty();
}
