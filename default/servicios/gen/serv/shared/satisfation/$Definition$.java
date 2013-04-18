package serv.shared.satisfation;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m_eck_q";
    this._name = "serv.shared.Satisfation";
    this._isAbstract = null;this._label = "Satisfation";
    this._ontology = "bc4b7e40-70d8-4b06-8bee-f2a57d4fcdca";
    org.monet.metamodel.ThesaurusDefinition.TermsProperty termsProperty2 = new org.monet.metamodel.ThesaurusDefinition.TermsProperty();
    org.monet.metamodel.TermProperty termProperty2 = new org.monet.metamodel.TermProperty();
    termProperty2.setLabel("Alta Satisfación");
    termProperty2.setKey("001");
    termsProperty2.addTermProperty(termProperty2);
    org.monet.metamodel.TermProperty termProperty5 = new org.monet.metamodel.TermProperty();
    termProperty5.setLabel("Satisfación");
    termProperty5.setKey("002");
    termsProperty2.addTermProperty(termProperty5);
    org.monet.metamodel.TermProperty termProperty8 = new org.monet.metamodel.TermProperty();
    termProperty8.setLabel("Menos de lo esperado");
    termProperty8.setKey("003");
    termsProperty2.addTermProperty(termProperty8);
    org.monet.metamodel.TermProperty termProperty11 = new org.monet.metamodel.TermProperty();
    termProperty11.setLabel("Servicio Problemático");
    termProperty11.setKey("004");
    termsProperty2.addTermProperty(termProperty11);
    this.setTerms(termsProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.shared.satisfation.$Definition$.class,"serv.shared.Satisfation",null);
  }
  }
  
  public static String static_getName() {
    return "Satisfation";
  }
  
  public String getClientBehaviour() {
    return "var m_eck_q = new Object();m_eck_q.refresh = function (node) {if (!node.isEditable()) return;};m_eck_q.onChangeField = function (node, field) {};";
  }
}
