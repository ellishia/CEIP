package serv.users.user;

import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import serv.users.user.information.AgeProperty;
import serv.users.user.information.NameProperty;
import serv.users.user.information.SurnameProperty;

@SuppressWarnings("all")
public class InformationProperty extends SectionFieldProperty implements HasBehaviour {
  public InformationProperty() {
    super();this._code = "mm_pvtg";
    this._name = "Information";
    this._label = "Información";
    this.addTextFieldProperty(Name);
    this.addTextFieldProperty(Surname);
    this.addTextFieldProperty(Age);
    
  }
  
  public Class<?> getBehaviourClass() {
    return serv.users.user.Information.class;
  }
  
  public static String static_getName() {
    return "Information";
  }
  
  private final NameProperty Name = new serv.users.user.information.NameProperty();
  
  private final SurnameProperty Surname = new serv.users.user.information.SurnameProperty();
  
  private final AgeProperty Age = new serv.users.user.information.AgeProperty();
}
