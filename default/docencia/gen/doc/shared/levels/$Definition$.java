package doc.shared.levels;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mfngpdg";
    this._name = "doc.shared.Levels";
    this._isAbstract = null;this._label = "Levels";
    this._ontology = "fc319857-63d4-4bfe-a778-a2fd09fac8ec";
    org.monet.metamodel.ThesaurusDefinition.TermsProperty termsProperty2 = new org.monet.metamodel.ThesaurusDefinition.TermsProperty();
    org.monet.metamodel.TermProperty termProperty2 = new org.monet.metamodel.TermProperty();
    termProperty2.setLabel("Alto");
    termProperty2.setKey("001");
    termsProperty2.addTermProperty(termProperty2);
    org.monet.metamodel.TermProperty termProperty5 = new org.monet.metamodel.TermProperty();
    termProperty5.setLabel("Medio");
    termProperty5.setKey("002");
    termsProperty2.addTermProperty(termProperty5);
    org.monet.metamodel.TermProperty termProperty8 = new org.monet.metamodel.TermProperty();
    termProperty8.setLabel("Bajo");
    termProperty8.setKey("003");
    termsProperty2.addTermProperty(termProperty8);
    this.setTerms(termsProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.shared.levels.$Definition$.class,"doc.shared.Levels",null);
  }
  }
  
  public static String static_getName() {
    return "Levels";
  }
  
  public String getClientBehaviour() {
    return "var mfngpdg = new Object();mfngpdg.refresh = function (node) {if (!node.isEditable()) return;};mfngpdg.onChangeField = function (node, field) {};";
  }
}
