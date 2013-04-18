package ceip.shared.studieslevel;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mb_ne7w";
    this._name = "ceip.shared.StudiesLevel";
    this._isAbstract = null;this._label = "Studies level";
    this._ontology = "EstudiosDeAdministrcion";
    org.monet.metamodel.ThesaurusDefinition.TermsProperty termsProperty2 = new org.monet.metamodel.ThesaurusDefinition.TermsProperty();
    org.monet.metamodel.TermProperty termProperty2 = new org.monet.metamodel.TermProperty();
    termProperty2.setLabel("Sin estudios");
    termProperty2.setKey("001");
    termsProperty2.addTermProperty(termProperty2);
    org.monet.metamodel.TermProperty termProperty5 = new org.monet.metamodel.TermProperty();
    termProperty5.setLabel("Primarios");
    termProperty5.setKey("002");
    termsProperty2.addTermProperty(termProperty5);
    org.monet.metamodel.TermProperty termProperty8 = new org.monet.metamodel.TermProperty();
    termProperty8.setLabel("Secundarios");
    termProperty8.setKey("003");
    termsProperty2.addTermProperty(termProperty8);
    org.monet.metamodel.TermProperty termProperty11 = new org.monet.metamodel.TermProperty();
    termProperty11.setLabel("Diplomado Universitario");
    termProperty11.setKey("004");
    termsProperty2.addTermProperty(termProperty11);
    org.monet.metamodel.TermProperty termProperty14 = new org.monet.metamodel.TermProperty();
    termProperty14.setLabel("Licenciado");
    termProperty14.setKey("005");
    termsProperty2.addTermProperty(termProperty14);
    this.setTerms(termsProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.shared.studieslevel.$Definition$.class,"ceip.shared.StudiesLevel",null);
  }
  }
  
  public static String static_getName() {
    return "StudiesLevel";
  }
  
  public String getClientBehaviour() {
    return "var mb_ne7w = new Object();mb_ne7w.refresh = function (node) {if (!node.isEditable()) return;};mb_ne7w.onChangeField = function (node, field) {};";
  }
}
