package serv.users.user;

import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import serv.users.user.InformationProperty;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "ms3tapg";
    this._name = "serv.Users.User";
    this._isAbstract = new IsAbstract();this._label = "Usuario";
    this.addSectionFieldProperty(Information);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty2 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty2.setLabel("Ficha");
    formViewProperty2.setCode("teaas");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty3.getField().add(new org.monet.metamodel.internal.Ref("Name","serv.Users.User","serv.Users.User.Information.Name"));
    showProperty3.getField().add(new org.monet.metamodel.internal.Ref("Surname","serv.Users.User","serv.Users.User.Information.Surname"));
    formViewProperty2.setShow(showProperty3);
    this.addView(formViewProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.users.user.$Definition$.class,"serv.Users.User",null);
  }
  }
  
  public static String static_getName() {
    return "User";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.users.User.class;
  }
  
  public String getClientBehaviour() {
    return "var ms3tapg = new Object();ms3tapg.refresh = function (node) {if (!node.isEditable()) return;};ms3tapg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final InformationProperty Information = new serv.users.user.InformationProperty();
}
