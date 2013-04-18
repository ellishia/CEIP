package solicitud.relatives;

import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import solicitud.relatives.parent.Child_custodyProperty;
import solicitud.relatives.parent.Civil_stateProperty;
import solicitud.relatives.parent.DniProperty;
import solicitud.relatives.parent.EmailProperty;
import solicitud.relatives.parent.NameProperty;
import solicitud.relatives.parent.ProfessionProperty;
import solicitud.relatives.parent.SecondSurnameProperty;
import solicitud.relatives.parent.Studies_levelProperty;
import solicitud.relatives.parent.SurnameProperty;
import solicitud.relatives.parent.TelephoneProperty;
import solicitud.relatives.parent.Work_situationProperty;

@SuppressWarnings("all")
public class ParentProperty extends SectionFieldProperty implements HasBehaviour {
  public ParentProperty() {
    super();this._code = "mdcmujg";
    this._name = "Parent";
    this._label = "Padre/Tutor";
    this.setIsMultiple(true);
    this.addTextFieldProperty(Name);
    this.addTextFieldProperty(Surname);
    this.addTextFieldProperty(SecondSurname);
    this.addTextFieldProperty(Dni);
    this.addTextFieldProperty(Profession);
    this.addTextFieldProperty(Telephone);
    this.addTextFieldProperty(Email);
    this.addBooleanFieldProperty(Child_custody);
    this.addSelectFieldProperty(Civil_state);
    this.addSelectFieldProperty(Studies_level);
    this.addSelectFieldProperty(Work_situation);
    
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.relatives.Parent.class;
  }
  
  public static String static_getName() {
    return "Parent";
  }
  
  private final NameProperty Name = new solicitud.relatives.parent.NameProperty();
  
  private final SurnameProperty Surname = new solicitud.relatives.parent.SurnameProperty();
  
  private final SecondSurnameProperty SecondSurname = new solicitud.relatives.parent.SecondSurnameProperty();
  
  private final DniProperty Dni = new solicitud.relatives.parent.DniProperty();
  
  private final ProfessionProperty Profession = new solicitud.relatives.parent.ProfessionProperty();
  
  private final TelephoneProperty Telephone = new solicitud.relatives.parent.TelephoneProperty();
  
  private final EmailProperty Email = new solicitud.relatives.parent.EmailProperty();
  
  private final Child_custodyProperty Child_custody = new solicitud.relatives.parent.Child_custodyProperty();
  
  private final Civil_stateProperty Civil_state = new solicitud.relatives.parent.Civil_stateProperty();
  
  private final Studies_levelProperty Studies_level = new solicitud.relatives.parent.Studies_levelProperty();
  
  private final Work_situationProperty Work_situation = new solicitud.relatives.parent.Work_situationProperty();
}
