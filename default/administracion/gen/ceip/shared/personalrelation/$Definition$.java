package ceip.shared.personalrelation;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m_0avtw";
    this._name = "ceip.shared.PersonalRelation";
    this._isAbstract = null;this._label = "Personal relation";
    this._ontology = "VinculosDeAdministracion";
    org.monet.metamodel.ThesaurusDefinition.TermsProperty termsProperty2 = new org.monet.metamodel.ThesaurusDefinition.TermsProperty();
    org.monet.metamodel.TermProperty termProperty2 = new org.monet.metamodel.TermProperty();
    termProperty2.setLabel("Padre/Madre");
    termProperty2.setKey("001");
    termsProperty2.addTermProperty(termProperty2);
    org.monet.metamodel.TermProperty termProperty5 = new org.monet.metamodel.TermProperty();
    termProperty5.setLabel("Abuelo/a");
    termProperty5.setKey("002");
    termsProperty2.addTermProperty(termProperty5);
    org.monet.metamodel.TermProperty termProperty8 = new org.monet.metamodel.TermProperty();
    termProperty8.setLabel("Tío/a");
    termProperty8.setKey("003");
    termsProperty2.addTermProperty(termProperty8);
    org.monet.metamodel.TermProperty termProperty11 = new org.monet.metamodel.TermProperty();
    termProperty11.setLabel("Hermano/a Adulto");
    termProperty11.setKey("004");
    termsProperty2.addTermProperty(termProperty11);
    org.monet.metamodel.TermProperty termProperty14 = new org.monet.metamodel.TermProperty();
    termProperty14.setLabel("Vecino/a");
    termProperty14.setKey("005");
    termsProperty2.addTermProperty(termProperty14);
    org.monet.metamodel.TermProperty termProperty17 = new org.monet.metamodel.TermProperty();
    termProperty17.setLabel("Otro");
    termProperty17.setKey("006");
    termsProperty2.addTermProperty(termProperty17);
    this.setTerms(termsProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.shared.personalrelation.$Definition$.class,"ceip.shared.PersonalRelation",null);
  }
  }
  
  public static String static_getName() {
    return "PersonalRelation";
  }
  
  public String getClientBehaviour() {
    return "var m_0avtw = new Object();m_0avtw.refresh = function (node) {if (!node.isEditable()) return;};m_0avtw.onChangeField = function (node, field) {};";
  }
}
