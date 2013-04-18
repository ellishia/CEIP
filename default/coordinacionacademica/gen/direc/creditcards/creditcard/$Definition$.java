package direc.creditcards.creditcard;

import direc.creditcards.creditcard.AcademicYearProperty;
import direc.creditcards.creditcard.BankProperty;
import direc.creditcards.creditcard.CardNumberProperty;
import direc.creditcards.creditcard.MoneyCreditProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "m_mhwlw";
    this._name = "direc.CreditCards.CreditCard";
    this._isAbstract = null;this._label = "Tarjeta de Crédito";
    this.addNumberFieldProperty(CardNumber);
    this.addTextFieldProperty(Bank);
    this.addNumberFieldProperty(MoneyCredit);
    this.addSelectFieldProperty(AcademicYear);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty5 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty5.setIndex(new org.monet.metamodel.internal.Ref("direc.CreditCards.Indice"));
    this.getMappingList().add(mappingProperty5);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty7 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty7);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty9.setLabel("Tarjeta sin número");
    formViewProperty9.setCode("m1mjjsa");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty10 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("CardNumber","direc.CreditCards.CreditCard","direc.CreditCards.CreditCard.CardNumber"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("Bank","direc.CreditCards.CreditCard","direc.CreditCards.CreditCard.Bank"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("MoneyCredit","direc.CreditCards.CreditCard","direc.CreditCards.CreditCard.MoneyCredit"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.CreditCards.CreditCard","direc.CreditCards.CreditCard.AcademicYear"));
    formViewProperty9.setShow(showProperty10);
    this.addView(formViewProperty9);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.creditcards.creditcard.$Definition$.class,"direc.CreditCards.CreditCard",null);
  }
  }
  
  public static String static_getName() {
    return "CreditCard";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.creditcards.CreditCard.class;
  }
  
  public String getClientBehaviour() {
    return "var m_mhwlw = new Object();m_mhwlw.refresh = function (node) {if (!node.isEditable()) return;};m_mhwlw.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return direc.creditcards.creditcard.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 1380782150:
    return direc.creditcards.creditcard.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final CardNumberProperty CardNumber = new direc.creditcards.creditcard.CardNumberProperty();
  
  private final BankProperty Bank = new direc.creditcards.creditcard.BankProperty();
  
  private final MoneyCreditProperty MoneyCredit = new direc.creditcards.creditcard.MoneyCreditProperty();
  
  private final AcademicYearProperty AcademicYear = new direc.creditcards.creditcard.AcademicYearProperty();
}
