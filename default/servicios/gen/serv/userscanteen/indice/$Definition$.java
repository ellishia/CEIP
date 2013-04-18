package serv.userscanteen.indice;

import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import serv.userscanteen.indice.ScheduleProperty;

@SuppressWarnings("all")
public class $Definition$ extends serv.users.indice.$Definition$ implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imbeh6vw";
    this._name = "serv.UsersCanteen.Indice";
    this._parent = "serv.Users.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Schedule);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty3.setCode("i");
    indexViewProperty3.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty3.setTitle(new org.monet.metamodel.internal.Ref("Schedule","serv.UsersCanteen.Indice","serv.UsersCanteen.Indice.Schedule"));
    indexViewProperty3.setShow(showProperty3);
    this.addView(indexViewProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.userscanteen.indice.$Definition$.class,"serv.UsersCanteen.Indice","serv.Users.Indice");
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.userscanteen.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imbeh6vw = new Object();imbeh6vw.refresh = function (node) {if (!node.isEditable()) return;};imbeh6vw.onChangeField = function (node, field) {};";
  }
  
  private final ScheduleProperty Schedule = new serv.userscanteen.indice.ScheduleProperty();
}
