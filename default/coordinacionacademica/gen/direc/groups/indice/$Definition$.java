package direc.groups.indice;

import direc.groups.indice.AcademicYearProperty;
import direc.groups.indice.IdentifierProperty;
import direc.groups.indice.NameProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "im86137q";
    this._name = "direc.Groups.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Name);
    referenceProperty1.addAttributeProperty(Identifier);
    referenceProperty1.addAttributeProperty(AcademicYear);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty5.setCode("i");
    indexViewProperty5.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty5.setTitle(new org.monet.metamodel.internal.Ref("Name","direc.Groups.Indice","direc.Groups.Indice.Name"));
    indexViewProperty5.setShow(showProperty5);
    this.addView(indexViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.groups.indice.$Definition$.class,"direc.Groups.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.groups.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var im86137q = new Object();im86137q.refresh = function (node) {if (!node.isEditable()) return;};im86137q.onChangeField = function (node, field) {};";
  }
  
  private final NameProperty Name = new direc.groups.indice.NameProperty();
  
  private final IdentifierProperty Identifier = new direc.groups.indice.IdentifierProperty();
  
  private final AcademicYearProperty AcademicYear = new direc.groups.indice.AcademicYearProperty();
}
