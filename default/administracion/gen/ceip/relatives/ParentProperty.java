package ceip.relatives;

import ceip.relatives.parent.Child_custodyProperty;
import ceip.relatives.parent.Civil_stateProperty;
import ceip.relatives.parent.DniProperty;
import ceip.relatives.parent.EmailProperty;
import ceip.relatives.parent.NameProperty;
import ceip.relatives.parent.ProfessionProperty;
import ceip.relatives.parent.SecondSurnameProperty;
import ceip.relatives.parent.Studies_levelProperty;
import ceip.relatives.parent.SurnameProperty;
import ceip.relatives.parent.TelephoneProperty;
import ceip.relatives.parent.Work_situationProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

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
    return ceip.relatives.Parent.class;
  }
  
  public static String static_getName() {
    return "Parent";
  }
  
  private final NameProperty Name = new ceip.relatives.parent.NameProperty();
  
  private final SurnameProperty Surname = new ceip.relatives.parent.SurnameProperty();
  
  private final SecondSurnameProperty SecondSurname = new ceip.relatives.parent.SecondSurnameProperty();
  
  private final DniProperty Dni = new ceip.relatives.parent.DniProperty();
  
  private final ProfessionProperty Profession = new ceip.relatives.parent.ProfessionProperty();
  
  private final TelephoneProperty Telephone = new ceip.relatives.parent.TelephoneProperty();
  
  private final EmailProperty Email = new ceip.relatives.parent.EmailProperty();
  
  private final Child_custodyProperty Child_custody = new ceip.relatives.parent.Child_custodyProperty();
  
  private final Civil_stateProperty Civil_state = new ceip.relatives.parent.Civil_stateProperty();
  
  private final Studies_levelProperty Studies_level = new ceip.relatives.parent.Studies_levelProperty();
  
  private final Work_situationProperty Work_situation = new ceip.relatives.parent.Work_situationProperty();
}
