package direc.creditcards.indice;

import direc.creditcards.indice.AcademicYearProperty;
import direc.creditcards.indice.BankProperty;
import direc.creditcards.indice.CardNumberProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mv1vzwq";
    this._name = "direc.CreditCards.Indice";
    this._isAbstract = null;this._label = "Tarjetas de Crédito";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(AcademicYear);
    referenceProperty1.addAttributeProperty(CardNumber);
    referenceProperty1.addAttributeProperty(Bank);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty5.setCode("m_xhkog");
    indexViewProperty5.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("CardNumber","direc.CreditCards.Indice","direc.CreditCards.Indice.CardNumber"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Bank","direc.CreditCards.Indice","direc.CreditCards.Indice.Bank"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.CreditCards.Indice","direc.CreditCards.Indice.AcademicYear"));
    indexViewProperty5.setShow(showProperty5);
    this.addView(indexViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.creditcards.indice.$Definition$.class,"direc.CreditCards.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.creditcards.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var mv1vzwq = new Object();mv1vzwq.refresh = function (node) {if (!node.isEditable()) return;};mv1vzwq.onChangeField = function (node, field) {};";
  }
  
  private final AcademicYearProperty AcademicYear = new direc.creditcards.indice.AcademicYearProperty();
  
  private final CardNumberProperty CardNumber = new direc.creditcards.indice.CardNumberProperty();
  
  private final BankProperty Bank = new direc.creditcards.indice.BankProperty();
}
