package serv.userscanteen.usercanteen;

import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import serv.userscanteen.usercanteen.AllergiesProperty;
import serv.userscanteen.usercanteen.DiabetesProperty;
import serv.userscanteen.usercanteen.ScheduleProperty;

@SuppressWarnings("all")
public class $Definition$ extends serv.users.user.$Definition$ implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "ms3tapg";
    this._name = "serv.UsersCanteen.UserCanteen";
    this._parent = "serv.Users.User";
    this._isAbstract = null;this._label = "Usuario de Comedor";
    this.addTextFieldProperty(Allergies);
    this.addBooleanFieldProperty(Diabetes);
    this.addTextFieldProperty(Schedule);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty4 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty4.setIndex(new org.monet.metamodel.internal.Ref("serv.UsersCanteen.Indice"));
    this.getMappingList().add(mappingProperty4);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty6.setLabel("Ficha");
    formViewProperty6.setCode("teaas");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Schedule","serv.UsersCanteen.UserCanteen","serv.UsersCanteen.UserCanteen.Schedule"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Allergies","serv.UsersCanteen.UserCanteen","serv.UsersCanteen.UserCanteen.Allergies"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Diabetes","serv.UsersCanteen.UserCanteen","serv.UsersCanteen.UserCanteen.Diabetes"));
    formViewProperty6.setShow(showProperty7);
    this.addView(formViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.userscanteen.usercanteen.$Definition$.class,"serv.UsersCanteen.UserCanteen","serv.Users.User");
  }
  }
  
  public static String static_getName() {
    return "UserCanteen";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.userscanteen.UserCanteen.class;
  }
  
  public String getClientBehaviour() {
    return "var ms3tapg = new Object();ms3tapg.refresh = function (node) {if (!node.isEditable()) return;};ms3tapg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -832768778:
    return serv.userscanteen.usercanteen.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final AllergiesProperty Allergies = new serv.userscanteen.usercanteen.AllergiesProperty();
  
  private final DiabetesProperty Diabetes = new serv.userscanteen.usercanteen.DiabetesProperty();
  
  private final ScheduleProperty Schedule = new serv.userscanteen.usercanteen.ScheduleProperty();
}
