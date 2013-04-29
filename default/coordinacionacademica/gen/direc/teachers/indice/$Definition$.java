package direc.teachers.indice;

import direc.teachers.indice.IdentifierProperty;
import direc.teachers.indice.NameProperty;
import direc.teachers.indice.SurnameProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imjxw34w";
    this._name = "direc.Teachers.Indice";
    this._isAbstract = null;this._label = "Docentes";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Name);
    referenceProperty1.addAttributeProperty(Surname);
    referenceProperty1.addAttributeProperty(Identifier);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty5.setCode("mzo58qq");
    indexViewProperty5.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty5.setTitle(new org.monet.metamodel.internal.Ref("Surname","direc.Teachers.Indice","direc.Teachers.Indice.Surname"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Name","direc.Teachers.Indice","direc.Teachers.Indice.Name"));
    indexViewProperty5.setShow(showProperty5);
    this.addView(indexViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.teachers.indice.$Definition$.class,"direc.Teachers.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.teachers.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imjxw34w = new Object();imjxw34w.refresh = function (node) {if (!node.isEditable()) return;};imjxw34w.onChangeField = function (node, field) {};";
  }
  
  private final NameProperty Name = new direc.teachers.indice.NameProperty();
  
  private final SurnameProperty Surname = new direc.teachers.indice.SurnameProperty();
  
  private final IdentifierProperty Identifier = new direc.teachers.indice.IdentifierProperty();
}
