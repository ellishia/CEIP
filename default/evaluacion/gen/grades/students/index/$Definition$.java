package grades.students.index;

import grades.students.index.CialProperty;
import grades.students.index.NombreProperty;
import grades.students.index.SurnameProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imphcdia";
    this._name = "grades.Students.Index";
    this._isAbstract = null;this._label = "Alumnos/as";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Nombre);
    referenceProperty1.addAttributeProperty(Surname);
    referenceProperty1.addAttributeProperty(Cial);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty5.setCode("mtv3aaw");
    indexViewProperty5.setName("Item");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Nombre","grades.Students.Index","grades.Students.Index.Nombre"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Surname","grades.Students.Index","grades.Students.Index.Surname"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Cial","grades.Students.Index","grades.Students.Index.Cial"));
    indexViewProperty5.setShow(showProperty5);
    this.addView(indexViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.students.index.$Definition$.class,"grades.Students.Index",null);
  }
  }
  
  public static String static_getName() {
    return "Index";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.students.Index.class;
  }
  
  public String getClientBehaviour() {
    return "var imphcdia = new Object();imphcdia.refresh = function (node) {if (!node.isEditable()) return;};imphcdia.onChangeField = function (node, field) {};";
  }
  
  private final NombreProperty Nombre = new grades.students.index.NombreProperty();
  
  private final SurnameProperty Surname = new grades.students.index.SurnameProperty();
  
  private final CialProperty Cial = new grades.students.index.CialProperty();
}
