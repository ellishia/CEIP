package solicitud.shared.genders;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mdufera";
    this._name = "solicitud.shared.Genders";
    this._isAbstract = null;this._label = "Genders";
    this._ontology = "Generos";
    org.monet.metamodel.ThesaurusDefinition.TermsProperty termsProperty2 = new org.monet.metamodel.ThesaurusDefinition.TermsProperty();
    org.monet.metamodel.TermProperty termProperty2 = new org.monet.metamodel.TermProperty();
    termProperty2.setLabel("Varón");
    termProperty2.setKey("001");
    termsProperty2.addTermProperty(termProperty2);
    org.monet.metamodel.TermProperty termProperty5 = new org.monet.metamodel.TermProperty();
    termProperty5.setLabel("Hembra");
    termProperty5.setKey("002");
    termsProperty2.addTermProperty(termProperty5);
    this.setTerms(termsProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.shared.genders.$Definition$.class,"solicitud.shared.Genders",null);
  }
  }
  
  public static String static_getName() {
    return "Genders";
  }
  
  public String getClientBehaviour() {
    return "var mdufera = new Object();mdufera.refresh = function (node) {if (!node.isEditable()) return;};mdufera.onChangeField = function (node, field) {};";
  }
}
