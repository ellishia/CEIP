package ceip.shared.phonetype;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "moxxl_g";
    this._name = "ceip.shared.PhoneType";
    this._isAbstract = null;this._label = "Phone Type";
    this._ontology = "TipoTelefono";
    org.monet.metamodel.ThesaurusDefinition.TermsProperty termsProperty2 = new org.monet.metamodel.ThesaurusDefinition.TermsProperty();
    org.monet.metamodel.TermProperty termProperty2 = new org.monet.metamodel.TermProperty();
    termProperty2.setLabel("Domicilio");
    termProperty2.setKey("001");
    termsProperty2.addTermProperty(termProperty2);
    org.monet.metamodel.TermProperty termProperty5 = new org.monet.metamodel.TermProperty();
    termProperty5.setLabel("Trabajo");
    termProperty5.setKey("002");
    termsProperty2.addTermProperty(termProperty5);
    org.monet.metamodel.TermProperty termProperty8 = new org.monet.metamodel.TermProperty();
    termProperty8.setLabel("Movil");
    termProperty8.setKey("003");
    termsProperty2.addTermProperty(termProperty8);
    this.setTerms(termsProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.shared.phonetype.$Definition$.class,"ceip.shared.PhoneType",null);
  }
  }
  
  public static String static_getName() {
    return "PhoneType";
  }
  
  public String getClientBehaviour() {
    return "var moxxl_g = new Object();moxxl_g.refresh = function (node) {if (!node.isEditable()) return;};moxxl_g.onChangeField = function (node, field) {};";
  }
}
