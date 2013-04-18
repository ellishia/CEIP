package ceip.shared.worksituation;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "ml5cexg";
    this._name = "ceip.shared.WorkSituation";
    this._isAbstract = null;this._label = "Situación Laboral";
    this._ontology = "SituacionLaboralDeAdmin";
    org.monet.metamodel.ThesaurusDefinition.TermsProperty termsProperty2 = new org.monet.metamodel.ThesaurusDefinition.TermsProperty();
    org.monet.metamodel.TermProperty termProperty2 = new org.monet.metamodel.TermProperty();
    termProperty2.setLabel("En Activo");
    termProperty2.setKey("001");
    termsProperty2.addTermProperty(termProperty2);
    org.monet.metamodel.TermProperty termProperty5 = new org.monet.metamodel.TermProperty();
    termProperty5.setLabel("Parado");
    termProperty5.setKey("002");
    termsProperty2.addTermProperty(termProperty5);
    org.monet.metamodel.TermProperty termProperty8 = new org.monet.metamodel.TermProperty();
    termProperty8.setLabel("Jubilado");
    termProperty8.setKey("003");
    termsProperty2.addTermProperty(termProperty8);
    this.setTerms(termsProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.shared.worksituation.$Definition$.class,"ceip.shared.WorkSituation",null);
  }
  }
  
  public static String static_getName() {
    return "WorkSituation";
  }
  
  public String getClientBehaviour() {
    return "var ml5cexg = new Object();ml5cexg.refresh = function (node) {if (!node.isEditable()) return;};ml5cexg.onChangeField = function (node, field) {};";
  }
}
