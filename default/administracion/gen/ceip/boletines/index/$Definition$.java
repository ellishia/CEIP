package ceip.boletines.index;

import ceip.boletines.index.AcademicYearProperty;
import ceip.boletines.index.NameProperty;
import ceip.boletines.index.StudentNameProperty;
import ceip.boletines.index.TrimesterProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "ml3tpia";
    this._name = "ceip.Boletines.Index";
    this._isAbstract = null;this._label = "item";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Name);
    referenceProperty1.addAttributeProperty(AcademicYear);
    referenceProperty1.addAttributeProperty(Trimester);
    referenceProperty1.addAttributeProperty(StudentName);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty6.setCode("mc2rhjw");
    indexViewProperty6.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty6.setTitle(new org.monet.metamodel.internal.Ref("Name","ceip.Boletines.Index","ceip.Boletines.Index.Name"));
    indexViewProperty6.setShow(showProperty6);
    this.addView(indexViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.boletines.index.$Definition$.class,"ceip.Boletines.Index",null);
  }
  }
  
  public static String static_getName() {
    return "Index";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.boletines.Index.class;
  }
  
  public String getClientBehaviour() {
    return "var ml3tpia = new Object();ml3tpia.refresh = function (node) {if (!node.isEditable()) return;};ml3tpia.onChangeField = function (node, field) {};";
  }
  
  private final NameProperty Name = new ceip.boletines.index.NameProperty();
  
  private final AcademicYearProperty AcademicYear = new ceip.boletines.index.AcademicYearProperty();
  
  private final TrimesterProperty Trimester = new ceip.boletines.index.TrimesterProperty();
  
  private final StudentNameProperty StudentName = new ceip.boletines.index.StudentNameProperty();
}
