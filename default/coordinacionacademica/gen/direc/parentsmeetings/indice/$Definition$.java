package direc.parentsmeetings.indice;

import direc.parentsmeetings.indice.DateProperty;
import direc.parentsmeetings.indice.GroupProperty;
import direc.parentsmeetings.indice.TeacherProperty;
import direc.parentsmeetings.indice.TitleProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imrtwigw";
    this._name = "direc.ParentsMeetings.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Title);
    referenceProperty1.addAttributeProperty(Date);
    referenceProperty1.addAttributeProperty(Group);
    referenceProperty1.addAttributeProperty(Teacher);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty6.setCode("m1bkolg");
    indexViewProperty6.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty6.setTitle(new org.monet.metamodel.internal.Ref("Title","direc.ParentsMeetings.Indice","direc.ParentsMeetings.Indice.Title"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Date","direc.ParentsMeetings.Indice","direc.ParentsMeetings.Indice.Date"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Group","direc.ParentsMeetings.Indice","direc.ParentsMeetings.Indice.Group"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Teacher","direc.ParentsMeetings.Indice","direc.ParentsMeetings.Indice.Teacher"));
    indexViewProperty6.setShow(showProperty6);
    this.addView(indexViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.parentsmeetings.indice.$Definition$.class,"direc.ParentsMeetings.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.parentsmeetings.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imrtwigw = new Object();imrtwigw.refresh = function (node) {if (!node.isEditable()) return;};imrtwigw.onChangeField = function (node, field) {};";
  }
  
  private final TitleProperty Title = new direc.parentsmeetings.indice.TitleProperty();
  
  private final DateProperty Date = new direc.parentsmeetings.indice.DateProperty();
  
  private final GroupProperty Group = new direc.parentsmeetings.indice.GroupProperty();
  
  private final TeacherProperty Teacher = new direc.parentsmeetings.indice.TeacherProperty();
}
