package ceip.centerinformation;

import ceip.centerinformation.contact.AddressProperty;
import ceip.centerinformation.contact.EmailProperty;
import ceip.centerinformation.contact.TelephoneProperty;
import ceip.centerinformation.contact.TownProperty;
import ceip.centerinformation.contact.WebProperty;
import ceip.centerinformation.contact.ZIPCodeProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

@SuppressWarnings("all")
public class ContactProperty extends SectionFieldProperty implements HasBehaviour {
  public ContactProperty() {
    super();this._code = "mtwrdpw";
    this._name = "Contact";
    this._label = "Contacto";
    this.addTextFieldProperty(Address);
    this.addNumberFieldProperty(ZIPCode);
    this.addTextFieldProperty(Town);
    this.addNumberFieldProperty(Telephone);
    this.addTextFieldProperty(Email);
    this.addTextFieldProperty(Web);
    
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.centerinformation.Contact.class;
  }
  
  public static String static_getName() {
    return "Contact";
  }
  
  private final AddressProperty Address = new ceip.centerinformation.contact.AddressProperty();
  
  private final ZIPCodeProperty ZIPCode = new ceip.centerinformation.contact.ZIPCodeProperty();
  
  private final TownProperty Town = new ceip.centerinformation.contact.TownProperty();
  
  private final TelephoneProperty Telephone = new ceip.centerinformation.contact.TelephoneProperty();
  
  private final EmailProperty Email = new ceip.centerinformation.contact.EmailProperty();
  
  private final WebProperty Web = new ceip.centerinformation.contact.WebProperty();
}
