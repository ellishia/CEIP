package direc.shared.weekdays;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mjw9ptg";
    this._name = "direc.shared.Weekdays";
    this._isAbstract = null;this._label = "Días de la semana";
    this._ontology = "55e69ef6-8547-4701-b0c2-326b0c626977";
    org.monet.metamodel.ThesaurusDefinition.TermsProperty termsProperty2 = new org.monet.metamodel.ThesaurusDefinition.TermsProperty();
    org.monet.metamodel.TermProperty termProperty2 = new org.monet.metamodel.TermProperty();
    termProperty2.setLabel("Lunes");
    termProperty2.setKey("001");
    termsProperty2.addTermProperty(termProperty2);
    org.monet.metamodel.TermProperty termProperty5 = new org.monet.metamodel.TermProperty();
    termProperty5.setLabel("Martes");
    termProperty5.setKey("002");
    termsProperty2.addTermProperty(termProperty5);
    org.monet.metamodel.TermProperty termProperty8 = new org.monet.metamodel.TermProperty();
    termProperty8.setLabel("Miércoles");
    termProperty8.setKey("003");
    termsProperty2.addTermProperty(termProperty8);
    org.monet.metamodel.TermProperty termProperty11 = new org.monet.metamodel.TermProperty();
    termProperty11.setLabel("Jueves");
    termProperty11.setKey("004");
    termsProperty2.addTermProperty(termProperty11);
    org.monet.metamodel.TermProperty termProperty14 = new org.monet.metamodel.TermProperty();
    termProperty14.setLabel("Viernes");
    termProperty14.setKey("005");
    termsProperty2.addTermProperty(termProperty14);
    this.setTerms(termsProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.shared.weekdays.$Definition$.class,"direc.shared.Weekdays",null);
  }
  }
  
  public static String static_getName() {
    return "Weekdays";
  }
  
  public String getClientBehaviour() {
    return "var mjw9ptg = new Object();mjw9ptg.refresh = function (node) {if (!node.isEditable()) return;};mjw9ptg.onChangeField = function (node, field) {};";
  }
}
