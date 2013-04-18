package serv.userstransport.usertransport;

import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import serv.userstransport.usertransport.BuslineProperty;
import serv.userstransport.usertransport.MedicalIssuesProperty;
import serv.userstransport.usertransport.StopProperty;

@SuppressWarnings("all")
public class $Definition$ extends serv.users.user.$Definition$ implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "ms3tapg";
    this._name = "serv.UsersTransport.UserTransport";
    this._parent = "serv.Users.User";
    this._isAbstract = null;this._label = "Usuario";
    this.addTextFieldProperty(MedicalIssues);
    this.addLinkFieldProperty(Busline);
    this.addSelectFieldProperty(Stop);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty4 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty4.setIndex(new org.monet.metamodel.internal.Ref("serv.UsersTransport.Indice"));
    this.getMappingList().add(mappingProperty4);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty6.setLabel("Ficha");
    formViewProperty6.setCode("teaas");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Busline","serv.UsersTransport.UserTransport","serv.UsersTransport.UserTransport.Busline"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Stop","serv.UsersTransport.UserTransport","serv.UsersTransport.UserTransport.Stop"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("MedicalIssues","serv.UsersTransport.UserTransport","serv.UsersTransport.UserTransport.MedicalIssues"));
    formViewProperty6.setShow(showProperty7);
    this.addView(formViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.userstransport.usertransport.$Definition$.class,"serv.UsersTransport.UserTransport","serv.Users.User");
  }
  }
  
  public static String static_getName() {
    return "UserTransport";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.userstransport.UserTransport.class;
  }
  
  public String getClientBehaviour() {
    return "var ms3tapg = new Object();ms3tapg.refresh = function (node) {if (!node.isEditable()) return;};ms3tapg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -832768778:
    return serv.userstransport.usertransport.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final MedicalIssuesProperty MedicalIssues = new serv.userstransport.usertransport.MedicalIssuesProperty();
  
  private final BuslineProperty Busline = new serv.userstransport.usertransport.BuslineProperty();
  
  private final StopProperty Stop = new serv.userstransport.usertransport.StopProperty();
}
