package ceip.shared.trimester;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m4qszeg";
    this._name = "ceip.shared.Trimester";
    this._isAbstract = null;this._label = "Trimester";
    this._ontology = "TrimesterAdministracion";
    org.monet.metamodel.ThesaurusDefinition.TermsProperty termsProperty2 = new org.monet.metamodel.ThesaurusDefinition.TermsProperty();
    org.monet.metamodel.TermProperty termProperty2 = new org.monet.metamodel.TermProperty();
    termProperty2.setLabel("Primero");
    termProperty2.setKey("1");
    termsProperty2.addTermProperty(termProperty2);
    org.monet.metamodel.TermProperty termProperty5 = new org.monet.metamodel.TermProperty();
    termProperty5.setLabel("Segundo");
    termProperty5.setKey("2");
    termsProperty2.addTermProperty(termProperty5);
    org.monet.metamodel.TermProperty termProperty8 = new org.monet.metamodel.TermProperty();
    termProperty8.setLabel("Tercero");
    termProperty8.setKey("3");
    termsProperty2.addTermProperty(termProperty8);
    org.monet.metamodel.TermProperty termProperty11 = new org.monet.metamodel.TermProperty();
    termProperty11.setLabel("Final");
    termProperty11.setKey("4");
    termsProperty2.addTermProperty(termProperty11);
    this.setTerms(termsProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.shared.trimester.$Definition$.class,"ceip.shared.Trimester",null);
  }
  }
  
  public static String static_getName() {
    return "Trimester";
  }
  
  public String getClientBehaviour() {
    return "var m4qszeg = new Object();m4qszeg.refresh = function (node) {if (!node.isEditable()) return;};m4qszeg.onChangeField = function (node, field) {};";
  }
}
